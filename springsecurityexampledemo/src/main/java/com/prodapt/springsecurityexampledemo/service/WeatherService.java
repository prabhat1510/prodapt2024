package com.prodapt.springsecurityexampledemo.service;

import com.prodapt.springsecurityexampledemo.entities.Weather;

public interface WeatherService {
	public Weather createWeather(Weather weather);

	public Weather getWeatherById(Integer weatherId);
}
