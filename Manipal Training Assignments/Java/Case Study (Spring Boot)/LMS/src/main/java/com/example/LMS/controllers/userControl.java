package com.example.LMS.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.LMS.model.books;
import com.example.LMS.model.user_signup;
import com.example.LMS.services.userServices;

@Controller
public class userControl {
	
	@Autowired
	public userServices us;
	
	//user sign up
	@RequestMapping("/user/userSignUp")
	@ResponseBody
	public String userSignUp(@RequestBody user_signup usu)
	{
		us.userSignUp(usu);
		return "User sign-up successful. User Created.";
	}
	
	//user sign in/log in
	@RequestMapping("/userSignIn/{username}/{password}")
	@ResponseBody
	public String userSignIn(@PathVariable String username,@PathVariable String password)
	{
		if(password.equals(us.userSignIn(username)))
			return "User sign-in success.";
		else
			return "User sign-in failure.";
	}
	
	//view book
		@RequestMapping("/user/userViewBooks")
		@ResponseBody
		public List<books> adminViewBooks()
		{
			return us.userDisplayBook();
		}
}
