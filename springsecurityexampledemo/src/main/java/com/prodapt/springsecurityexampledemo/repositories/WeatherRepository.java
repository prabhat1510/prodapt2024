package com.prodapt.springsecurityexampledemo.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.springsecurityexampledemo.entities.Weather;

@Repository
public interface WeatherRepository extends CrudRepository<Weather, Integer>{

}
