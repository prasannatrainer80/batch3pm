package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TestController {

	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping(value="/employs")
	public Object[] showEmploy() {
		Object[] employs = restTemplate.getForObject("http://EMPLOY-CLIENT", Object[].class);
		return employs;
	}
	
}
