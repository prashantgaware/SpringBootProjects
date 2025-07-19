<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="text-align: center; color: red;">Register Employee</h1>

<table style="border: 1px solid black; width: 100%; height: 100%;">
	<tr>
		<td style="text-align: center;"><img src="images/employee.jpg"
			alt="Employee Image" width="200" height="200"></td>
	</tr>
	<tr>
		<td><form:form method="post" action="add"
				modelAttribute="employee">
				<table style="margin: auto; width: 50%;">
					<tr>
						<td>Employee Name:</td>
						<td><form:input path="empName" /></td>
					</tr>
					<tr>
						<td>Designation:</td>
						<td><form:input path="designation" /></td>
					</tr>
					<tr>
						<td>Salary:</td>
						<td><form:input path="empSalary" /></td>
					</tr>
					<tr>
						<td colspan="2" style="text-align: center;"><input
							type="submit" value="Register Employee" /></td>
					</tr>
				</table>
			</form:form> <br />
			<h1 style="text-align: center; color: aqua; font-style: italic;">
				<a href="report"><img alt="Not Found" src="images/report.webp"
					width="50" height="50">View Employee Report</a>
			</h1> <br />
			<h1 style="text-align: center; color: aqua; font-style: italic;">
				<a href=""><img alt="Not Found" src="images/report.webp"
					width="50" height="50">Go to Home</a>
			</h1></td>
	</tr>
</table>