package com.prodapt.restapiexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestTemplate;

import io.swagger.v3.oas.annotations.Operation;

@RestController
public class HelloWorldRestTemplateController {
	
	private static final String URL =  "http://localhost:8081/hello/";
	@Autowired
	RestTemplate restTemplate;
	
	@Autowired
	RestClient restClient;

	// URL : http://localhost:8081/greetrest
	@GetMapping("/greetrest")
	public String greetingFromHelloWorldController() {
		ResponseEntity<String> message = restTemplate.getForEntity(URL+"greet", String.class);
			//client.get(URL+"greet");
		return message.getBody();
	}
	
	// URL : http://localhost:8081/greetrestclient
	@GetMapping("/greetrestclient")
	public String greetingFromHelloWorldControllerUsingRestClient() {
		ResponseEntity<String> message = restClient.get()
												.uri("/greet")
												.retrieve()
												.toEntity(String.class);
		return message.getBody();
	}
	
	//URL http://localhost:8081/greetmsgrestclient?name=Amrita
	@GetMapping("/greetmsgrestclient")
	public String greeting(@RequestParam("name") String name) {
		
		ResponseEntity<String> message = restClient.get()
				.uri("/greetmsg?name={name}",name)
				.retrieve()
				.toEntity(String.class);
		return message.getBody();
	}
	
	//Passing data in path variables
	// URL : http://localhost:8081/greetmsgrestcli/Prabhat
	@GetMapping("/greetmsgrestcli/{name}")
	public String greetingUsingPathVarRestCli(@PathVariable("name") String name) {
		ResponseEntity<String> message = restClient.get()
				.uri("/greetmsg/{name}",name)
				.retrieve()
				.toEntity(String.class);
		return message.getBody();
		
	}
	
	
		//Passing data in request body in JSON format
		//URL : http://localhost:8081/sendgreetrestcli
		
		@PostMapping("/sendgreetrestcli")
		public String sendGreetMessageRestCli(@RequestBody String message) {
			ResponseEntity<String> msg = restClient.post()
					.uri("/sendgreet")
					.contentType(MediaType.APPLICATION_JSON)
					.body(message)
					.retrieve()
					.toEntity(String.class);
			return msg.getBody();
		}
}
