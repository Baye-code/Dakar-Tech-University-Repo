package com.saraya.DakarTechUniversity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.saraya.DakarTechUniversity.model.User;
import com.saraya.DakarTechUniversity.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	
	@PostMapping(path="/api/infos")
	public void register(@RequestBody User user) {
		 
		userService.RequestInformation(user);
		
		
		
		
	}
	
	

}
