package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerService {

	@Autowired
	CustomerRepository repo;
	
	@Autowired
	CustomerDao dao;
	
	public List<Customer> showCustomer() {
		return repo.findAll();
	}
	
	public Customer searchCustomer(int cid) {
		return repo.findById(cid).get();
	}
	
	public String authenticate(String user, String pwd) {
		return dao.authenticate(user, pwd);
	}
	
	public String showCustId(String user) {
		return dao.showCustomerId(user);
	}
}
