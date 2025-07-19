<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>

<c:choose>
	<c:when test="${!empty employeeData }">
		<div style="text-align: center; margin-top: 50px;">
			<h1 style="color: blue">Employee Report</h1>
			<table border="1" style="margin: auto; width: 80%;">
				<tr>
					<th>Employee ID</th>
					<th>Employee Name</th>
					<th>Department</th>
					<th>Salary</th>
					<th>Actions</th>
				</tr>
				<c:forEach var="employee" items="${employeeData}">
					<tr>
						<td>${employee.empNo}</td>
						<td>${employee.empName}</td>
						<td>${employee.designation}</td>
						<td>${employee.empSalary}</td>
						<td style="align-content: center;"><a href="edit?empNo=${employee.empNo}"><img
								alt="Not found" src="images/edit.webp" width="50" height="50">Edit</a>
								&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; 
							<a href="delete?empNo=${employee.empNo}"><img alt="Not found"
								src="images/delete.webp" width="50" height="50">Delete</a></td>
					</tr>
				</c:forEach>
			</table>
		</div>
	</c:when>
	<c:otherwise>
		<div style="text-align: center; margin-top: 50px;">
			<h1 style="color: red">No Employee Data Available</h1>
			<p style="color: orange">Please add employee data to generate a	report.</p>
		</div>
	</c:otherwise>
</c:choose>
<br>
<br>
<h1 style="text-align: center; color: aqua; font: italic;">
	<a href="add"><img alt="Not Found" src="images/add.webp" width="50"
		height="50">Add Employee</a>
</h1>