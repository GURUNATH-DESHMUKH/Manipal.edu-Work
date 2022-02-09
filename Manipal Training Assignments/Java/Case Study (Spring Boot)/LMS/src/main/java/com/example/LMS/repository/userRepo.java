package com.example.LMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LMS.model.user_signup;

public interface userRepo extends JpaRepository<user_signup,String> {

}
