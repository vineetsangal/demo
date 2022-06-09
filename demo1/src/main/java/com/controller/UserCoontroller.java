package com.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RequestBody;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;    
import org.springframework.web.bind.annotation.RestController;

import com.model.UserRecord;
import com.service.UserService;

import java.util.List;    
@RestController
@RequestMapping("/value")

public class UserCoontroller {
	@Autowired    
	private UserService userService;     
	@RequestMapping("/")    
	public List<UserRecord> getAllUser()  
	{    
	return userService.getAllUsers();    
	}       
	@RequestMapping(value="/add-user", method=RequestMethod.POST)    
	public void addUser(@RequestBody UserRecord userRecord)  
	{    
	userService.addUser(userRecord);    
	}       
	}    



