package com.java.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployTest {

	@Test
	public void testToString() {
		Employ employ1 = new Employ(1, "Mayuri", Gender.FEMALE, "Java", 
				 "Programmer", 88832.44);
		String result = "Employ [empno=1, name=Mayuri, gender=FEMALE, "
	    		+ "dept=Java, desig=Programmer, basic=88832.44]";
		assertEquals(result, employ1.toString());
	}
	@Test
	public void testGettersAndSetters() {
		Employ employ = new Employ();
		employ.setEmpno(4);
		employ.setName("Shivendra");
		employ.setGender(Gender.MALE);
		employ.setDept("Java");
		employ.setDesig("Programmer");
		employ.setBasic(99932.44);
		
		assertEquals(4, employ.getEmpno());
		assertEquals("Shivendra", employ.getName());
		assertEquals(Gender.MALE, employ.getGender());
		assertEquals("Java", employ.getDept());
		assertEquals("Programmer", employ.getDesig());
		assertEquals(99932.44, employ.getBasic(), 2);
	}
	
	@Test
	public void testConstructors() {
		Employ employ = new Employ();
		assertNotNull(employ);
		Employ employ1 = new Employ(1, "Mayuri", Gender.FEMALE, "Java", 
				 "Programmer", 88832.44);
		assertEquals(1, employ1.getEmpno());
		assertEquals("Mayuri", employ1.getName());
		assertEquals(Gender.FEMALE, employ1.getGender());
		assertEquals("Java", employ1.getDept());
		assertEquals("Programmer", employ1.getDesig());
		assertEquals(88832.44, employ1.getBasic(),2);
	}

}
