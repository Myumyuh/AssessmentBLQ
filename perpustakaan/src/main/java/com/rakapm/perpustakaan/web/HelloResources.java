package com.rakapm.perpustakaan.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rakapm.perpustakaan.service.GreetingService;

@RestController
public class HelloResources {
	
	Logger log = LoggerFactory.getLogger(HelloResources.class);
	
	private GreetingService greetingService;
	
	@Autowired
	public HelloResources(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	@GetMapping("/hello")
	public String helloWorld() {
		log.debug("This is Log DEBUG");
		log.trace("This is Log TRACE");
		log.info("This is Log INFO");
		log.warn("This is Log WARN");
		log.error("This is Log ERROR");
		return greetingService.sayGreeting();
		}
}
