<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<spring:url value="/resources/css/jquery-ui.css" var="mainCss" />
<spring:url value="/resources/js/jquery-1.10.2.js" var="jqueryJs" />
<spring:url value="/resources/js/jquery-ui.js" var="mainJs" />

<link href="${mainCss}" rel="stylesheet" />
<script src="${jqueryJs}"></script>
<script src="${mainJs}"></script>

</head>
<body>
	<form:form modelAttribute="clientJobDto" action="job-card-registered" method="POST">
		<table border="2px" align="center">
			<caption>Operator Registration Form</caption>
			<tr>
				<td><form:label path="productName">Product Name : </form:label></td>
				<td><form:input path="productName" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="modelBrand">Model Brand : </form:label></td>
				<td><form:input path="modelBrand" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="modelNo">Model No : </form:label></td>
				<td><form:password path="modelNo" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="jobDescription">Job Description : </form:label></td>
				<td><form:textarea path="jobDescription" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="createdDate">Created Date : </form:label>
				</td>
				<td><form:input path="createdDate" id="ID_datepicker" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="approxCompletionDate">Approx Completion Date : </form:label>
				</td>
				<td><form:input path="approxCompletionDate" id="ID_datepicker" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="clientName">Contact Person Name : </form:label></td>
				<td><form:input path="clientName" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="clientAddress">Address : </form:label></td>
				<td><form:textarea path="clientAddress" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="clientContactNo">Contact No : </form:label></td>
				<td><form:input path="clientContactNo" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<tr>
				<td><form:label path="clientEmail">Email Id : </form:label></td>
				<td><form:input path="clientEmail" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<%-- <tr>
				<td><form:label path="jobStatus">Job Status : </form:label></td>
				<td><form:input path="jobStatus" /> <form:errors path=""/>
				</td>
			</tr> --%>
			<tr>
				<td><form:label path="clientRemark">Client Remark : </form:label></td>
				<td><form:textarea path="clientRemark" /> <%-- <form:errors path=""/> --%>
				</td>
			</tr>
			<%-- <tr>
				<td><form:label path="serviceEngineerStatus">Service Engineer Status : </form:label></td>
				<td><form:input path="serviceEngineerStatus" /> <form:errors path=""/>
				</td>
			</tr>
			<tr>
				<td><form:label path="serviceEngineerRemark">Service Engineer Remark : </form:label></td>
				<td><form:input path="serviceEngineerRemark" /> <form:errors path=""/>
				</td>
			</tr> --%>
			<tr>
				<td><input type="submit" value="Register"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>
		</table>
	</form:form>
	<script>
		$(function() {
			$("#ID_datepicker").datepicker({dateFormat:'dd/mm/yy'});
		});
	</script>
</body>
</html>