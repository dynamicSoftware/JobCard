<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<jsp:useBean id="operator"  class="com.job.card.management.system.dto.OperatorDto" />
<%-- <jsp:setProperty name="operator" value="${operatorDto}" property="*" /> --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show operatot info</title>
</head>
<body>

	<table border="2px" align="center">
		<tr>
			<td>Name : </td>
			<td><%=operator.getUserName()%> </td>
		</tr>
		<tr>
			<td>Email : </td>
			<td><%=operator.getUserEmail()%> </td>
		</tr>
		<tr>
			<td>Password : </td>
			<td><%=operator.getUserPassword()%> </td>
		</tr>
		<tr>
			<td>Contact No : </td>
			<td><%=operator.getUserContact()%> </td>
		</tr>
		<tr>
			<td>Gender : </td>
			<td><%=operator.getUserGender()%> </td>
		</tr>
		<tr>
			<td>Address : </td>
			<td><%=operator.getUserAddress()%> </td>
		</tr>
		<tr>
			<td>Joining Date : </td>
			<td><%=operator.getJoiningDate()%> </td>
		</tr>
		<tr>
			<td>Salary : </td>
			<td><%=operator.getSalary()%> </td>
		</tr>
	</table>

</body>
</html>