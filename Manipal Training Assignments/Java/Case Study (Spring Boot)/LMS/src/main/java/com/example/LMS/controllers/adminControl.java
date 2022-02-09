package com.example.LMS.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.LMS.model.books;
import com.example.LMS.model.user_signup;
import com.example.LMS.services.adminServices;

@Controller
public class adminControl {
	
	@Autowired
	public adminServices as;

	//admin login
	@RequestMapping("/admin/adminLogIn/{username}/{password}")
	@ResponseBody
	public String adminLogIn(@PathVariable String username, @PathVariable String password)
	{
		if(password.equals(as.adminLogIn(username)))
			return "Admin sign-in success.";
		else
			return "Admin sign-in failure.";
	}
	
	//add book
	@RequestMapping("/admin/adminAddBook")
	@ResponseBody
	public String adminAddBook(@RequestBody books b)
	{
		as.adminAddBook(b);
		return "book added successfully.";
	}
	
	//delete book
	@DeleteMapping("/admin/adminDeleteBook/{bookName}")
	@ResponseBody
	public String adminDeleteBook(@PathVariable String bookName)
	{
		if(as.adminDeleteBook(bookName))
			return "book deleted successfully.";
		else
			return "book deletion failure.";	
	}
	
	//delete user
	@DeleteMapping("/admin/adminDeleteUser/{userName}")
	@ResponseBody
	public String adminDeleteUser(@PathVariable String userName)
	{
		if(as.adminDeleteUser(userName))
			return "user deleted successfully.";
		else
			return "user deletion failure";
	}
	
	//view book
	@RequestMapping("/admin/adminViewBooks")
	@ResponseBody
	public List<books> adminViewBooks()
	{
		return as.adminDisplayBook();
	}
	
	//view user
	@RequestMapping("/admin/adminViewUsers")
	@ResponseBody
	public List<user_signup> adminViewUser()
	{
		return as.adminDisplayUser();
	}
	
	//update book ratings
	@PutMapping("/admin/adminUpdateRating/{bookname}/{rating}")
	@ResponseBody
	public String adminUpdateRating(@PathVariable String bookname, @PathVariable String rating)
	{
		as.adminUpdateRating(bookname,rating);
		return "book rating updated.";
	}
}
