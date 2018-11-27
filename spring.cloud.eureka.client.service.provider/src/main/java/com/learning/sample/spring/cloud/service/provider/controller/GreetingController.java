package com.learning.sample.spring.cloud.service.provider.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.learning.sample.spring.cloud.service.provider.object.Greeting;
import com.learning.sample.spring.cloud.service.provider.service.GreetingService;

@RestController
public class GreetingController implements GreetingService{

	private static final Logger LOGGER = LoggerFactory.getLogger(GreetingController.class);
	
    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
    	LOGGER.info("get visitor");
        return new Greeting(counter.incrementAndGet(),
                            String.format(TEMPLATE, name));
    }
}
