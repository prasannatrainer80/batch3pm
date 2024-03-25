package com.example.demo;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployController {

	@Autowired
	EmployService service;
	
	@GetMapping(value="/showEmploy")
	public List<Employ> list() {
		return service.showEmployService();
	}
	
	@GetMapping("/searchEmploy/{id}")
	public ResponseEntity<Employ> get(@PathVariable int id) {
		try {
		Employ employ = service.searchEmployService(id);
		return new ResponseEntity<Employ>(employ,HttpStatus.OK);
		} catch(NoSuchElementException e) {
			return new ResponseEntity<Employ>(HttpStatus.NOT_FOUND);
		}
	} 
	
	@PostMapping("/deleteEmploy/{id}")
	public String delete(@PathVariable int id) {
		 service.deleteEmployService(id);
		 return "Record Deleted...";
	}
	
	@PostMapping("/addEmploy")
	public String add(@RequestBody Employ employ) {
		 service.addEmployService(employ);
		 return "Employ Record Inserted...";
	}

	@PostMapping("/updateEmploy")
	public String update(@RequestBody Employ employ) {
		 service.updateEmployService(employ);
		 return "Employ Record Updated...";
	}
}
