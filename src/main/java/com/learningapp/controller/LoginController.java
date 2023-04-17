package com.learningapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.learningapp.service.LoginSer;
import com.learningapp.service.LoginService;

@RestController
@RequestMapping("/api/a1")
@CrossOrigin
public class LoginController {
	@Autowired
	private LoginService loginservice;
	
	
//	public ResponseEntity<String> login(@RequestParam String username,@RequestParam String password) {
//		User auth=loginservice.login(username,password);
		
//		return null;
		
//}
	@GetMapping("/login/{username}/{password}")
	public boolean login(@PathVariable String username, @PathVariable String password){
//		System.out.println("inside post mapping!!!");
		boolean stat=loginservice.login(username, password);
		return stat;
//		return new ResponseEntity<>("",HttpStatus.OK);
//		return new ResponseEntity<String>loginservice.login(user);
	}
	
	
	


}
