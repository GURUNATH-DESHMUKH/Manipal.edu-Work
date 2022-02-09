package com.example.LMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LMS.model.books;

public interface bookRepo extends JpaRepository<books,String>{
	
}
