package com.pfms.Personal_Finance_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfms.Personal_Finance_Management.model.TransactionDetails;
@Repository
public interface TransRepository extends JpaRepository<TransactionDetails, Long> {
	

}
