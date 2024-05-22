<%@page import="com.java.emp.Employ"%>
<%@page import="com.java.emp.EmployDaoImpl"%>
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
		EmployDaoImpl impl = new EmployDaoImpl();
		Employ employ = impl.searchEmployDao(empno);
	%>
	<form method="get" action="UpdateEmploy.jsp">
		<center>
			Employ No : 
			<input type="number" name="empno" value=<%=employ.getEmpno() %> />
			<br/><br/>
			Employ Name : 
			<input type="text" name="name" value=<%=employ.getName() %> /> 
			<Br/><br/>
			Gender : 
			<input type="text" name="gender" value=<%=employ.getGender() %> />
			<br/><br/>
			Department : 
			<input type="text" name="dept" value=<%=employ.getDept() %> /> 
			<br/><br/>
			Designation : 
			<input type="text" name="desig" value=<%=employ.getDesig() %> /> 
			<br/><br/>
			Basic : 
			<input type="number" name="basic" value=<%=employ.getBasic() %> />
			<br/><br/>
			<input type="submit" value="Update Employ" />
		</center>
	</form>
	<%
		if (request.getParameter("empno")!=null && request.getParameter("basic")!=null) {
			Employ employUpdated = new Employ();
			employUpdated.setEmpno(Integer.parseInt(request.getParameter("empno")));
			employUpdated.setName(request.getParameter("name"));
			employUpdated.setGender(request.getParameter("gender"));
			employUpdated.setDept(request.getParameter("dept"));
			employUpdated.setDesig(request.getParameter("desig"));
			employUpdated.setBasic(Double.parseDouble(request.getParameter("basic")));
			out.print(impl.updateEmployDao(employUpdated));
	%>
		<jsp:forward page="EmployShow.jsp" />
	<%
		}
	%>
</body>
</html>