package com.example.LMS.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.LMS.model.books;
import com.example.LMS.model.user_signup;
import com.example.LMS.repository.adminRepo;
import com.example.LMS.repository.bookRepo;
import com.example.LMS.repository.userRepo;

@Service
public class userServices {
	@Autowired
	public userRepo ur;
	
	@Autowired
	public bookRepo br;
	
	public void userSignUp(user_signup usu) 
	{
		ur.save(usu);
	}
	
	public String userSignIn(String username)
	{
		String un=ur.findById(username).get().getUsername();
		return un;
	}
	
	public List<books> userDisplayBook()
	{
		List <books> b=new ArrayList<books>();
		br.findAll().forEach(book -> b.add(book));
		return b;
	}
	
}
