<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<c:forEach items="${empList}" var="emp">
	    <span>${emp.fName}</span>
	    <span>${emp.lName}</span>
	    <span>${emp.age}</span>
	    <span>${emp.street}</span>
	    <span>${emp.city}</span>
	    <span>${emp.country}</span></br>
	</c:forEach>
</body>
</html>