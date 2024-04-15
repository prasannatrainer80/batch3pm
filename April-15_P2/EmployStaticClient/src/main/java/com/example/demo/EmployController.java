package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EmployController {

	@Autowired
	EmployService service;
	
	@GetMapping(value="/")
	public List<Employ> showEmploy() {
		return service.showEmploy();
	}
	
	@GetMapping(value="/searchEmploy/{id}")
	public Employ search(@PathVariable int id) {
		return service.searchEmploy(id);
	}
	
	
}
