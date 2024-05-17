package com.java.junit;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testToString() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employee emp1 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("2000-10-10"), sdf.parse("2024-05-01"), 
				sdf.parse("2055-10-10"));
	}
	
	@Test
	public void testEquals() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employee emp1 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("2000-10-10"), sdf.parse("2024-05-01"), 
				sdf.parse("2055-10-10"));
		Employee emp2 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("2000-10-10"), sdf.parse("2024-05-01"), 
				sdf.parse("2055-10-10"));
		Employee emp3 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"99333399", "Tekkali", "SWE", sdf.parse("2000-10-10"), sdf.parse("2024-05-01"), 
				sdf.parse("2055-10-10"));
		assertTrue(emp1.equals(emp2));
		assertFalse(emp1.equals(emp3));
	}
	
	@Test
	public void testHashCode() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employee emp1 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("2000-10-10"), sdf.parse("2024-05-01"), 
				sdf.parse("2055-10-10"));
		Employee emp2 = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("2000-10-10"), sdf.parse("2024-05-01"), 
				sdf.parse("2055-10-10"));
		assertEquals(emp1.hashCode(), emp2.hashCode());
	}
	@Test
	public void testGettersAndSetters() throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employee employee = new Employee();
		employee.setEmployeeID(1);
		employee.setFirstName("Sadhana");
		employee.setLastName("Madina");
		employee.setGender("Female");
		employee.setEmail("sadhana@gmail.com");
		employee.setPhoneNumber("9933993399");
		employee.setAddress("Tekkali");
		employee.setPosition("SWE");
		employee.setDateOfBirth(sdf.parse("2000-10-10"));
		employee.setJoiningDate(sdf.parse("2024-05-01"));
		employee.setTerminationDate(sdf.parse("2055-10-10"));
		assertEquals(1, employee.getEmployeeID());
		assertEquals("Sadhana", employee.getFirstName());
		assertEquals("Madina", employee.getLastName());
		assertEquals("Female", employee.getGender());
		assertEquals("sadhana@gmail.com", employee.getEmail());
		assertEquals("9933993399", employee.getPhoneNumber());
		assertEquals("Tekkali", employee.getAddress());
		assertEquals("SWE", employee.getPosition());
		assertEquals(sdf.parse("2000-10-10"), employee.getDateOfBirth());
		assertEquals(sdf.parse("2024-05-01"), employee.getJoiningDate());
		assertEquals(sdf.parse("2055-10-10"), employee.getTerminationDate());
	}
	@Test
	public void testConstructors() throws ParseException {
		Employee employee = new Employee();
		assertNotNull(employee);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Employee emp = new Employee(1, "Sadhana", "Madina","Female", "sadhana@gmail.com", 
				"9933993399", "Tekkali", "SWE", sdf.parse("2000-10-10"), sdf.parse("2024-05-01"), 
				sdf.parse("2055-10-10"));
		assertEquals(1, emp.getEmployeeID());
		assertEquals("Sadhana", emp.getFirstName());
		assertEquals("Madina", emp.getLastName());
		assertEquals("Female", emp.getGender());
		assertEquals("sadhana@gmail.com", emp.getEmail());
		assertEquals("9933993399", emp.getPhoneNumber());
		assertEquals("Tekkali", emp.getAddress());
		assertEquals("SWE", emp.getPosition());
		assertEquals(sdf.parse("2000-10-10"), emp.getDateOfBirth());
		assertEquals(sdf.parse("2024-05-01"), emp.getJoiningDate());
		assertEquals(sdf.parse("2055-10-10"), emp.getTerminationDate());
	}

}
