package com.prodapt.springsecurityexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.springsecurityexample.service.UserInfoService;

@RestController
@RequestMapping("/login")
public class LoginController {

	
	@Autowired
	private UserInfoService userInfoService;
	
	@GetMapping("/loginunsecmsg")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity<String>("Unsecured Login Message",HttpStatus.OK);
	}
	
	@GetMapping("/loginsecmsg")
	public ResponseEntity<String> getSecuredMessage() {
		return new ResponseEntity<String>("Secured Login Message",HttpStatus.OK);
	}
}
