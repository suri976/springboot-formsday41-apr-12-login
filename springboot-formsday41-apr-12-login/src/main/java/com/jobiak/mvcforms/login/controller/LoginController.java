package com.jobiak.mvcforms.login.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvcforms.login.model.User;
import com.jobiak.mvcforms.login.repository.UserRepository;



@Controller
public class LoginController {

	@Autowired
	UserRepository repo;
	
	
	
	
	
	

	public LoginController() {
		// TODO Auto-generated constructor stub
	}

	public LoginController(UserRepository repo) {
		
		this.repo = repo;
	}

	@RequestMapping(path="/test",method = RequestMethod.GET)
	public String redirect()
	{
		return "login";
	}
	
	@RequestMapping(path="/login",method = RequestMethod.POST)
	public String doSignUp(@ModelAttribute("user")User user)
	{
		repo.save(user);
		return "success";
		
		
		
		
	}
	
}

