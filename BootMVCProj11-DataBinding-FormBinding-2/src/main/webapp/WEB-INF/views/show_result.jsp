<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>

    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<h2>Student Details</h2>
<br>
<form:form method="post" modelAttribute="student">
	<table>
		<tr>
			<td>Student Id:</td>
			<td><form:input path="sno" /></td>
		</tr>
		<tr>
			<td>Student Name:</td>
			<td><form:input path="sname" /></td>
		</tr>
		<tr>
			<td>Student Address:</td>
			<td><form:input path="sadd" /></td>
		</tr>
		<tr>
			<td>Student Avg:</td>
			<td><form:input path="avg" /></td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>

