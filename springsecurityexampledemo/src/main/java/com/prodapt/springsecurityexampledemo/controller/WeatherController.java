package com.prodapt.springsecurityexampledemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.springsecurityexampledemo.entities.Weather;
import com.prodapt.springsecurityexampledemo.service.WeatherService;

@RestController
@RequestMapping("/weatherapp")
public class WeatherController {
	
	@Autowired
	private WeatherService service;
	
	@PostMapping("/addweather")
	public Weather createWeather(@RequestBody Weather weather) {
		return service.createWeather(weather);
	}
	
	@GetMapping("/weatherbyid")
	public Weather getWeatherById(@RequestParam("id") Integer weatherId) {
		return service.getWeatherById(weatherId);
	}
}
