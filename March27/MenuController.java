package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MenuController {

	@Autowired
	MenuRepository repo;
	
	@GetMapping(value="/showMenu")
	public List<Menu> showMenu() {
		return repo.findAll();
	}
	
	@GetMapping(value="/searchMenu/{id}")
	public Menu searchByMenu(@PathVariable int id) {
		return repo.findById(id).get();
	}
	
}
