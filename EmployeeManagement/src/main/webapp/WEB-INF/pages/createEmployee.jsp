<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form action="saveEmployee" modelAttribute="emp">
		First Name: <form:input path="fName" /><br/>
		Last Name: <form:input path="lName" /><br/>
		Age: <form:input path="age" /><br/>
		Email: <form:input path="email" /><br/>
		Street: <form:input path="street" /><br/>
		City: <form:select path="city" items="${cities}" /><br/>
		Country: <form:input path="country" /><br/>
		Gender: <form:radiobutton path="gender" value="M" />M
		<form:radiobutton path="gender" value="F" />F<br/>
		
		Hobbies: <form:checkbox path="hobbies" value="Cricket"/>Cricket
		<form:checkbox path="hobbies" value="Football"/>Football
		<form:checkbox path="hobbies" value="Singing"/>Singing
		<form:checkbox path="hobbies" value="Movies"/>Movies
		<form:checkbox path="hobbies" value="Badminton"/>Badminton<br/>
		Remarks: <form:input path="Remarks" /><br/>
		<form:button name="Submit" value="submit">Submit</form:button>
	 </form:form>
	 
	<c:if test ="${exp != null}">
         <c:out value="${exp.statusCode}"></c:out>
         <c:out value="${exp.msgs[0]}"></c:out>
      </c:if>
</body>
</html>