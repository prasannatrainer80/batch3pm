package com.java.sup;

public class Emp {

	int empno;
	String name;
	double basic;
	
	public Emp() {

	}

	public Emp(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp)obj;
		if (emp.empno == empno && emp.name == name && emp.basic == basic) {
			return true;
		}
		return false;
	}
}
