package com.java.quiz;

class Java extends Employ {

	public Java(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
class Hr extends Employ {

	public Hr(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
class Admin extends Employ {

	public Admin(int empno, String name, double basic) {
		super(empno, name, basic);
	}
	
}
class Employ {
	
	int empno;
	String name;
	double basic;

	public Employ(int empno, String name, double basic) {
		this.empno = empno;
		this.name = name;
		this.basic = basic;
	}

	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", basic=" + basic + "]";
	}
}
public class Quiz5 {
	public static void main(String[] args) {
		Employ[] arr = new Employ[] {
			new Hr(1, "Saida", 88234),
			new Admin(2,"MG",83145),
			new Java(3, "Sadhana", 88323),
			new Hr(4, "Parvathy", 88234),
			new Java(5, "Mayuri", 88323),
			new Admin(6,"Sudha",83145),
			new Java(7, "Gladys", 88323),
			new Admin(8,"Sowmya",83145),
			new Java(9, "Balaji", 88323),
		};
		for (Employ employ : arr) {
			if (employ instanceof Java) {
				System.out.println(employ);
			}
		}
	}
}
