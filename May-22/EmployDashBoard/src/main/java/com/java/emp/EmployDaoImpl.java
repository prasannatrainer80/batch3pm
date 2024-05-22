package com.java.emp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDaoImpl implements EmployDao {

	Connection connection;
	PreparedStatement pst;
	
	@Override
	public List<Employ> showEmployDao() throws ClassNotFoundException, SQLException {
		List<Employ> employList = new ArrayList<Employ>();
		String cmd = "select * from Employ";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		while(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employList;
	}

	@Override
	public Employ searchEmployDao(int empno) throws ClassNotFoundException, SQLException {
		List<Employ> employList = new ArrayList<Employ>();
		String cmd = "select * from Employ where empno = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if(rs.next()) {
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setGender(rs.getString("gender"));
			employ.setDept(rs.getString("dept"));
			employ.setDesig(rs.getString("desig"));
			employ.setBasic(rs.getDouble("basic"));
			employList.add(employ);
		}
		return employ;
	}

	@Override
	public String updateEmployDao(Employ employNew) throws ClassNotFoundException, SQLException {
		String cmd = "Update Employ set Name = ?, Gender = ?, Dept = ?, Desig = ?, Basic = ? "
				+ " Where Empno = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setString(1, employNew.getName());
		pst.setString(2, employNew.getGender());
		pst.setString(3, employNew.getDept());
		pst.setString(4, employNew.getDesig());
		pst.setDouble(5, employNew.getBasic());
		pst.setInt(6, employNew.getEmpno());
		pst.executeUpdate();
		return "Employ Record Updated...";
	}

	@Override
	public String addEmployDao(Employ employNew) throws ClassNotFoundException, SQLException {
		String cmd = "Insert into Employ(Empno, Name, Gender, Dept, Desig, Basic) "
				+ " values(?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, employNew.getEmpno());
		pst.setString(2, employNew.getName());
		pst.setString(3, employNew.getGender());
		pst.setString(4, employNew.getDept());
		pst.setString(5, employNew.getDesig());
		pst.setDouble(6, employNew.getBasic());
		pst.executeUpdate();
		return "Employ Record Inserted...";
	}

	@Override
	public String deleteEmployDao(int empno) throws ClassNotFoundException, SQLException {
		String cmd = "Delete from Employ Where Empno = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		pst.executeUpdate();
		return "Employ Record Deleted...";
	}

	@Override
	public int authenticate(String user, String pwd) throws ClassNotFoundException, SQLException {
		String cmd = "Select count(*) cnt from UserData where UserName = ? AND PassCode = ?";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, pwd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;
	}

}
