package com.saraya.DakarTechUniversity.controller;

import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.saraya.DakarTechUniversity.model.Contact;
import com.saraya.DakarTechUniversity.service.ContactService;


@RestController
public class UniversityController {
	
	@Autowired
	private ContactService contactService;
	
	
	@PostMapping(path="/contact")
	public void register(@RequestBody Contact contact) {
		 
		contactService.register(contact);
		
		
		
		
	}

}
