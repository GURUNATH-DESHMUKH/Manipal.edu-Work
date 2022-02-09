package com.example.LMS.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.LMS.model.admin_login;

public interface adminRepo extends JpaRepository<admin_login,String>  {

}
