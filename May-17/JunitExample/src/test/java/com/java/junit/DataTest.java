package com.java.junit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataTest {

	static Data data;
	
	@BeforeClass
	public static void setUp() {
		data = new Data();
		System.out.println("Object Created Successfully...");
	}
	
	@AfterClass
	public static void cleanUp() {
		data = null;
		System.out.println("Object memory deallocated...");
	}
	
	@Before
	public void greeting() {
		System.out.println("Welcome to Test Case");
	}
	
	@After
	public void endNote() {
		System.out.println("Test Case Ended...");
	}
	@Test
	public void testNull() {
		Data data = null;
		assertNull(data);
		data = new Data();
		assertNotNull(data);
	}
	@Test
	public void testEvenOdd() {
//		Data data = new Data();
		assertTrue(data.evenOdd(4));
		assertFalse(data.evenOdd(5));
	}
	
	@Test
	public void testArray() {
		int[] a = new int[] {1,2,3,4};
		int[] b = new int[] {1,2,3,4};
		assertArrayEquals(a, b);
	}
	
	@Test
	public void testMinArray() {
//		Data data = new Data();
		int[] a = new int[] {-1,5,32,66,23,25};
		assertEquals(-1, data.minArray(a));
		int[] b = new int[] {100,5,32,66,-7,25};
		assertEquals(-7, data.minArray(b));
	}
	
	@Test
	public void testMax3() {
//		Data data = new Data();
		assertEquals(7, data.max3(7, 5, 3));
		assertEquals(7, data.max3(5, 7, 3));
		assertEquals(7, data.max3(3, 5, 7));
	}
	
	@Test
	public void testSum() {
//		Data data = new Data();
		assertEquals(5, data.sum(2, 3));
	}
	
	@Test
	public void testSayHello() {
//		Data data = new Data();
		assertEquals("Welcome to Java Programming...", data.sayHello());
	}

}
