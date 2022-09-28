package com.turkishjavadeveloper.controller;


import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path ="/api")
public class HelloController {
	
	
	//HTTP METODLARI(REST API)
	//GET : Veri görüntülemek istediğimizde kullanıyoruz @GetMapping
	//POST : Veri kaydetmek istediğimizde kullanıyoruz   @PostMapping
	//Put : Veri güncellemek için kullanıyoruz.          @PutMapping
	//PATCH : Verinin bir bölümünü güncellemek istediğimiz zaman kullanıyoruz. @PatchMapping
	//DELETE : Veri silmek istediğimiz zaman kullanıyoruz.   @DeleteMapping
	
	
	@GetMapping(path = "/hello")
	public String sayHello() {
		
		return "Hello World";
	}
	
	@PostMapping(path = "/save")
	public String save() {
		return "Data Saved!";
	}
	
	@DeleteMapping(path = "/delete")
	public String delete() {
		System.out.println("skdşaljsdaşsjdşasdjşasd");
		return "Data Delete!";
	}
	
	
 
}
