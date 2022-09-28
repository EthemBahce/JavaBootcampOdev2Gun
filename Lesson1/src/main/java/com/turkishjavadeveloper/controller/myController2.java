package com.turkishjavadeveloper.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turkishjavadeveloper.model.User;

@RestController
@RequestMapping("/api/")
public class myController2 {
	
	/*@PostMapping("users")
	public User saveUser(@RequestBody User user) {
		
		System.out.println("User saved!");
		user.setPassword("password bilgisi gösterilemez.");
		return user;
		
		}*/
	
	
	
	@PostMapping("users-all")
	public List<User> saveAllUser(@RequestBody List<User> users){
		
		users.forEach(user -> user.setPassword("Tüm passwordlar şifrelidir....."));
		System.out.println("All Users Saved!");
		return users;
		
	}
	
	
	
	
	
	
	
	

}
