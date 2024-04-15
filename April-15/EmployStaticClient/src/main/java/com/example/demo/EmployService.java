package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class EmployService {

	static List<Employ> employList = new ArrayList<Employ>();
	
	static {
		employList.add(new Employ(1, "Kamal", 94234.55));
		employList.add(new Employ(2, "Sohan", 90002.55));
		employList.add(new Employ(3, "Teja", 89942.55));
		employList.add(new Employ(4, "Shiva", 91155.55));
		employList.add(new Employ(5, "Owais", 90552.55));
	}
	
	public List<Employ> showEmploy() {
		return employList;
	}
	
	public Employ searchEmploy(int empId) {
		return employList.get(empId);
	}
}
