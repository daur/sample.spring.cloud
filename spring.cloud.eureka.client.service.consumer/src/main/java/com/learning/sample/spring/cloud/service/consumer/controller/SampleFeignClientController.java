package com.learning.sample.spring.cloud.service.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.sample.spring.cloud.service.consumer.object.Greeting;
import com.learning.sample.spring.cloud.service.consumer.service.GreetingService;

@RestController
public class SampleFeignClientController {

	@Autowired
	private GreetingService greetingService;
	
	@GetMapping(value = "/greeting")
	public Greeting greeting(@RequestParam(value="name", defaultValue="world") String name) {
		return greetingService.greeting(name);
	}
}
