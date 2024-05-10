package com.aditya.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginOperationController {
	
	
	
	@GetMapping("/")
	public String getHomePage() 
	{
		
		return "home";
	}
	
	
	@GetMapping("/addhighlights")
	public String get() 
	{
		
		return "addhighlights";
		
	}
	
	@GetMapping("/showhighlights")
	public String show() 
	{
		
		return "showhighlight";
		
	}
	
	
	@GetMapping("/denied")
	public String access_denied() 
	{
		return "access_denied";
	
	}
	

}
