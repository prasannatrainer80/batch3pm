<%@page import="com.java.emp.EmployDaoImpl"%>
<%@page import="com.java.emp.EmployDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	int empno = Integer.parseInt(request.getParameter("empno"));
	EmployDao dao = new EmployDaoImpl();
	out.println(dao.deleteEmployDao(empno));
	
%>
<jsp:forward page="EmployShow.jsp" />
</body>
</html>