package com.prodapt.springsecurityexampledemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prodapt.springsecurityexampledemo.entities.Weather;
import com.prodapt.springsecurityexampledemo.repositories.WeatherRepository;

@Service
public class WeatherServiceImpl implements WeatherService {

	@Autowired
	private WeatherRepository repo;

	@Override
	public Weather createWeather(Weather weather) {
		return repo.save(weather);
	}

	@Override
	public Weather getWeatherById(Integer weatherId) {
		Optional<Weather> weather = repo.findById(weatherId);
		if (weather.isEmpty()) {
			return weather.get();
		} else {
			return null;
		}
	}

}
