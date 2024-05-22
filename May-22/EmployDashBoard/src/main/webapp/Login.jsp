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
	<form method="post" action="Login.jsp">
		<center>
			User Name : 
			<input type="text" name="userName" /> <br/><br/>
			Password : 
			<input type="password" name="passCode" /> <br/><br/>
			<input type="submit" value="Login" />
		</center>
	</form>
	<%
		if (request.getParameter("userName")!=null && 
				request.getParameter("passCode") !=null
				)  {
			String user = request.getParameter("userName").trim();
			String pwd = request.getParameter("passCode").trim();
			EmployDaoImpl impl = new EmployDaoImpl();
			int count = impl.authenticate(user, pwd);
			if (count==1) {
	%>
		<jsp:forward page="EmployShow.jsp" />
	<%
			}
		}
	%>
</body>
</html>