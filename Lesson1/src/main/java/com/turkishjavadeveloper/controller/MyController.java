package com.turkishjavadeveloper.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
public class MyController {

	
	
	
	/*@GetMapping(path = "/message/{message}")
	public String getMyMessage(@PathVariable String message) {
		
		return "Your message is : " + message;
	}*/
	
	
	
	/*@GetMapping(path = "/message")
	public String getMessage(@RequestParam String message) {
		return "my message : " + message;
	}*/
	
	
	@GetMapping({"/message1","/message1/{message}"})
	public String getByMessageWithVariable(@PathVariable(name = "message", required = false ) String message) {
		return "Your message is " + message;
	}
	
	@GetMapping("/message2")
	public String getByMessageWithParam(@RequestParam(name = "message", required = false, defaultValue = "default message") String message) {
		return "Your message is : " + message;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
