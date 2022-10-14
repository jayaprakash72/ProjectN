package com.pfms.Personal_Finance_Management.controller;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.pfms.Personal_Finance_Management.model.TransactionDetails;
import com.pfms.Personal_Finance_Management.repository.TransRepository;
import com.pfms.Personal_Finance_Management.service.CsvService;
import com.univocity.parsers.csv.CsvParser;
import com.univocity.parsers.csv.CsvParserSettings;
import com.univocity.parsers.common.record.Record;

@RestController
@RequestMapping("/wallet")
public class TransController {
	
	@Autowired
	private TransRepository transRepo;
	@Autowired
	private CsvService transService;
	
	@PostMapping("/importCsv")
	public String uploadData(@RequestParam("file") MultipartFile file) throws Exception {
		//to receive the file from input and extract the records
		List<TransactionDetails> transList = new ArrayList<>();
		//receive file stream
		InputStream inputStream = file.getInputStream();
		//creat the parser for working with csv
		CsvParserSettings settings= new CsvParserSettings();
		//to remove first column
		settings.setHeaderExtractionEnabled(true);
		//create acsv parser
		CsvParser parser =new CsvParser(settings);
		//use the parser and get the details from input stream
		List<Record> parseAllRecords = parser.parseAllRecords(inputStream);
		parseAllRecords.forEach(record -> {
		TransactionDetails trans = new TransactionDetails();
			trans.setDate(record.getString("date"));
			trans.setCategory(record.getString("category"));
			trans.setbank_name(record.getString("bank_name"));
			trans.setAmount(Integer.parseInt(record.getString("amount")));
			transList.add(trans);
		});
		transRepo.saveAll(transList);
	
		return "uploaded";
	}
	
	@GetMapping("/exportCsv") 
	public ResponseEntity<Resource> getFile() {
		    String filename = "transactions.csv";
		    InputStreamResource file = new InputStreamResource(transService.load());

		    return ResponseEntity.ok()
		        .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=" + filename)
		        .contentType(MediaType.parseMediaType("application/csv"))
		        .body(file);
		  }
	

}
