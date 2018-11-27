package com.learning.sample.spring.cloud.service.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.learning.sample.spring.cloud.service.consumer.object.Greeting;

@FeignClient(value="feign-service")
public interface GreetingService {

	@GetMapping("/greeting")
    public Greeting greeting(@PathVariable("name") String name);
}
