package com.example.LMS.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.LMS.model.books;
import com.example.LMS.model.user_signup;
import com.example.LMS.repository.adminRepo;
import com.example.LMS.repository.bookRepo;
import com.example.LMS.repository.userRepo;

@Service
public class adminServices {
	
	@Autowired
	public adminRepo ar;
	
	@Autowired
	public bookRepo br;
	
	@Autowired
	public userRepo ur;
	
	public String adminLogIn(String username)
	{
		String un=ar.findById(username).get().getUsername();
		return un;
	}
	
	public void adminAddBook(books b)
	{
		br.save(b);
	}
	
	public boolean adminDeleteBook(String bookName)
	{
		if(br.findById(bookName).isPresent())
		{
			br.deleteById(bookName);
			return true;
		}
		else
			return false;
	}
	
	public boolean adminDeleteUser(String user_name)
	{
		if(ur.findById(user_name).isPresent())
		{
			ur.deleteById(user_name);
			return true;
		}
		else
			return false;
	}
	
	public List<books> adminDisplayBook()
	{
		List <books> b=new ArrayList<books>();
		br.findAll().forEach(book -> b.add(book));
		return b;
	}
	
	public List<user_signup> adminDisplayUser()
	{
		List <user_signup> u=new ArrayList<user_signup>();
		ur.findAll().forEach(user -> u.add(user));
		return u;
	}
	
	public void adminUpdateRating(String bookname,String rating)
	{
		books bn=new books();
		bn.setBook_name(br.findById(bookname).get().getBook_name());
		bn.setBook_author_name(br.findById(bookname).get().getBook_author_name());
		bn.setUser_rating(rating);
		bn.setCategory(br.findById(bookname).get().getCategory());
		br.deleteById(bookname);
		br.save(bn);
	}
}
