package com.capgemini.spring2.classbased;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.capgemini.spring2")
public class BeanConfig {
	
	@Bean
	public List<Integer> listProvider() {
		return List.of(1,2,3,4,5,6,7,8,9);
	}
	
	@Bean(name = "honda")
	public Bike bikeProvider() {
		Bike bike = new Bike();
		bike.setBikeId(12);
		bike.setBikeName("Honda SP125");
		bike.setColour("Black");
		
		return bike;
	}
	
}
