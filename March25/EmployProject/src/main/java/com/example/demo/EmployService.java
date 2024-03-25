package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class EmployService {

	@Autowired
	EmployRepository repo;
	
	public List<Employ> showEmployService() {
		return repo.findAll();
	}
	
	public Employ searchEmployService(int empno) {
		return repo.findById(empno).get();

	}
	
	public void addEmployService(Employ employ) {
		repo.save(employ);
	}
	
	public void updateEmployService(Employ employ) {
		repo.save(employ);
	}
	
	public void deleteEmployService(int empno) {
		Employ employ = searchEmployService(empno);
		repo.delete(employ);
	}
}
