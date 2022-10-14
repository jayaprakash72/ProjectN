package com.pfms.Personal_Finance_Management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pfms.Personal_Finance_Management.model.Category;
import com.pfms.Personal_Finance_Management.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;

	@PostMapping("/category")
	public void addCategory(@RequestBody Category category){
		categoryService.addCategory(category);
	}
}
