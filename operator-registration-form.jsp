<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form modelAttribute="operatorDto" action="operator-registered"
		method="POST">
		<table border="2px" align="center">
			<tr>
				<td><form:label path="userName">First Name : </form:label></td>
				<td><form:input path="userName" />
				<form:errors path="userName" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="userEmail">Email : </form:label></td>
				<td><form:input path="userEmail" />
				<form:errors path="userEmail" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="userPassword">Password : </form:label></td>
				<td><form:password path="userPassword" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="userContact">Contact No : </form:label></td>
				<td><form:input path="userContact" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="userGender">Gender : </form:label></td>
				<td><form:radiobutton path="userGender" value="M" />Male<form:radiobutton
						path="userGender" value="F" />Female <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="userAddress">Address : </form:label></td>
				<td><form:input path="userAddress" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="joiningDate">Joining Date : </form:label>
				</td>
				<td><form:input path="joiningDate" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="salary">Salary : </form:label></td>
				<td><form:input path="salary" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form:form>
</body>
</html>