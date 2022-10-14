package com.pfms.Personal_Finance_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pfms.Personal_Finance_Management.model.User;

@Repository
public interface UserRepository extends JpaRepository <User, Integer>{

	User findByUserName(String username);

}
