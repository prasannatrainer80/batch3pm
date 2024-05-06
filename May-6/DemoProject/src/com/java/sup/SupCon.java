package com.java.sup;

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

class Mayuri extends Employ {

	public Mayuri(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
class Sadhana extends Employ {

	public Sadhana(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}

class Balaji extends Employ {

	public Balaji(int empno, String name, double basic) {
		super(empno, name, basic);
		// TODO Auto-generated constructor stub
	}
	
}
public class SupCon {
	public static void main(String[] args) {
//		Employ e1 = new Balaji(1, "Balaji", 99323);
//		Employ e2 = new Sadhana(2, "Sadhana", 99323);
//		Employ e3 = new Balaji(3, "Mayuri", 99323);
		
		Employ[] arr = new Employ[] {
				new Balaji(1, "Balaji", 99323),
				new Sadhana(2, "Sadhana", 99323),
				new Mayuri(3, "Mayuri", 99832)
		};
		
		for (Employ employ : arr) {
			System.out.println(employ);
		}
	}
}
