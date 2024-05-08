package com.java.jdbc.dao;

import java.sql.SQLException;
import java.util.List;

import com.java.jdbc.model.Employ;

public interface EmployDao {
	List<Employ> showEmployDao() throws ClassNotFoundException, SQLException;
	Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException;
	String addEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
	String updateEmployDao(Employ employ) throws ClassNotFoundException, SQLException;
	String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException;
}
