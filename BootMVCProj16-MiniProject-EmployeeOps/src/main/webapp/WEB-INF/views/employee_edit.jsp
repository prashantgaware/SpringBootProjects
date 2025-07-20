<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>

<%@ taglib uri="jakarta.tags.core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1 style="text-align: center; color: red;">Edit Employee</h1>
<form:form method="post" action="edit" modelAttribute="employee">
    <table style="margin: auto; width: 50%;">
        <tr>
            <td>Employee ID:</td>
            <td><form:input path="empNo" readonly="true"/></td>
        </tr>
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
            <td colspan="2" style="text-align: center;">
                <input type="submit" value="Update Employee" />
            </td>
        </tr>
    </table>
</form:form>