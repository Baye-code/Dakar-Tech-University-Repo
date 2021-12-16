package com.saraya.DakarTechUniversity.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.DakarTechUniversity.model.Contact;
import com.saraya.DakarTechUniversity.service.ContactService;


@RestController
public class UniversityController {
	
	@Autowired
	private ContactService contactService;
	
	
	@PostMapping(path="/contact",consumes="application/json")
	public void register(@RequestParam("firstName") String firstName,@RequestParam String lastName,
			@RequestParam String email,@RequestParam int phoneNumber,@RequestParam String degreeLevel,
			@RequestParam String interest) {
		 
		Contact contact = new Contact(firstName,lastName,email,phoneNumber,degreeLevel,interest);
		contactService.register(contact);
		
		
		
		
	}

}
