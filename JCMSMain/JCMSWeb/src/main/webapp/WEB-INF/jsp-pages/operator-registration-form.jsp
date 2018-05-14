<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%-- <link href="<c:url value="/resources/css/jquery-ui.css" />" rel="stylesheet">
    <script src="<c:url value="/resources/js/jquery-1.10.2.js" />"></script>
    <script src="<c:url value="/resources/js/jquery-ui.js" />"></script> --%>

<spring:url value="/resources/css/jquery-ui.css" var="mainCss" />
<spring:url value="/resources/js/jquery-1.10.2.js" var="jqueryJs" />
<spring:url value="/resources/js/jquery-ui.js" var="mainJs" />

<link href="${mainCss}" rel="stylesheet" />
<script src="${jqueryJs}"></script>
<script src="${mainJs}"></script>

<!-- <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"rel = "stylesheet">
<script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
<script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script> -->

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Operator Registration Form</title>

</head>
<body>
	<form:form modelAttribute="operatorDto" action="operator-registered"
		method="POST">
		<table border="2px" align="center">
			<caption>Operator Registration Form</caption>
			<tr>
				<td><form:label path="userName">First Name : </form:label></td>
				<td><form:input path="userName" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="userEmail">Email : </form:label></td>
				<td><form:input path="userEmail" /> <%-- <form:errors path=""/> --%>
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
				<td><form:input path="joiningDate" id="ID_datepicker" /> <%-- <form:errors path=""/> --%>
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
	<script>
		$(function() {
			$("#ID_datepicker").datepicker({
				dateFormat : 'dd/mm/yy'
			});
		});
	</script>
</body>
</html>