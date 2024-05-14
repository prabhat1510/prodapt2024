package com.prodapt.restapiexample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	// URL : http://localhost:8081/hello/greet
	@GetMapping("/greet")
	public String greeting() {
		return "Hello How are you all?";
	}

	//Passing data using parameters
	// URL : http://localhost:8081/hello/greetmsg?name=Prabhat
	@GetMapping("/greetmsg")
	public String greeting(@RequestParam("name") String name) {
		return "Hello from " + name + "How are you all?";
	}

	//Passing data using more than one parameters
	// URL : http://localhost:8081/hello/trainergreet?fname=Prabhat&lname=Chandra
	@GetMapping("/trainergreet")
	public String greeting(@RequestParam("fname") String fname, @RequestParam("lname") String lname) {
		return "Hello from " + fname + " " + lname + " How are you all?";
	}

	//Passing data in path variables
	// URL : http://localhost:8081/hello/greetmsg/Prabhat
	@GetMapping("/greetmsg/{name}")
	public String greetingUsingPathVariable(@PathVariable("name") String name) {
		return "Hello from " + name + " How are you all?";
	}
	
	//Passing data in request body in JSON format
	//URL : http://localhost:8081/hello/sendgreet
	@PostMapping("/sendgreet")
	public String sendGreetMessage(@RequestBody String message) {
		return "This message is from your mom "+message;
	}
}
