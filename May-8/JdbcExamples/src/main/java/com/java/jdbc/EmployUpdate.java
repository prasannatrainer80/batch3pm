package com.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployUpdate {

	public static void main(String[] args) {
		int empno;
		String name, dept, desig,gender;
		double basic;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employ No   ");
		empno = sc.nextInt();
		System.out.println("Enter Employ Name  ");
		name = sc.next();
		System.out.println("Enter Gender  ");
		gender = sc.next().toUpperCase();
		System.out.println("Enter Department   ");
		dept = sc.next();
		System.out.println("Enter Designation   ");
		desig = sc.next();
		System.out.println("Enter Basic   ");
		basic = sc.nextDouble();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexapractice", 
					"root", "root");
			String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, "
					+ " Basic = ? WHERE Empno = ?";
			PreparedStatement pst = con.prepareStatement(cmd);
			pst.setString(1, name);
			pst.setString(2, gender);
			pst.setString(3, dept);
			pst.setString(4, desig);
			pst.setDouble(5, basic);
			pst.setInt(6, empno);
			pst.executeUpdate();
			System.out.println("*** Employ Record Updated ***");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
