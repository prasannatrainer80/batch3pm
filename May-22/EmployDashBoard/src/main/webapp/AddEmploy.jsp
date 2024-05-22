<%@page import="com.java.emp.EmployDaoImpl"%>
<%@page import="com.java.emp.Employ"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="AddEmploy.jsp">
	<center>
		Employ No : 
		<input type="number" name="empno" /> <br/><br/>
		Employ Name : 
		<input type="text" name="name" /> <br/><br/> 
		Gender : 
		<select name="gender">
			<option value="MALE">Male</option>
			<option value="FEMALE">Female</option>
		</select> <br/><br/>
		Department : 
		<select name="dept">
			<option value="Dotnet">Dotnet</option>
			<option value="Java">Java</option>
			<option value="React">React</option>
		</select> <br/><br/>
		Designation : 
		<select name="desig">
			<option value="Junior">Junior</option>
			<option value="Senior">Senior</option>
			<option value="Head">Head</option>
		</select> <br/><br/>
		Basic : 
		<input type="number" name="basic" /> <br/><br/>
		<input type="submit" value="Insert" />
	</center>
</form>
<%
	if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
		Employ employ = new Employ();
		employ.setEmpno(Integer.parseInt(request.getParameter("empno")));
		employ.setName(request.getParameter("name"));
		employ.setGender(request.getParameter("gender"));
		employ.setDept(request.getParameter("dept"));
		employ.setDesig(request.getParameter("desig"));
		employ.setBasic(Double.parseDouble(request.getParameter("basic")));
		EmployDaoImpl impl = new EmployDaoImpl();
		out.println(impl.addEmployDao(employ));
%>
	<jsp:forward page="EmployShow.jsp" />
<%
	}
%>
</body>
</html>