package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@GetMapping(value="/")
	public List<Customer> showCustomer() {
		return service.showCustomer();
	}
	
	@GetMapping(value="/searchCustomer/{id}")
	public Customer searchCustomer(@PathVariable int id) {
		return service.searchCustomer(id);
	}
	
	@GetMapping(value="/customerLogin/{user}/{pwd}")
	public String customerLogin(@PathVariable String user, 
				@PathVariable String pwd) {
		return service.authenticate(user, pwd);
	}
	
	@GetMapping(value="/searchCustomerByUser/{user}")
	public String searchCustomer(@PathVariable String user) {
		return service.showCustId(user);
	}
}
