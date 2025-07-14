<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Data Rendering Complex</title>
</head>
<body>
	Details are as follows:
	Name: <c:out value="${name}"/><br/>
	Age: <c:out value="${age}"/><br/>
	Address: <c:out value="${address}"/><br/>
    <a href="<c:url value='/test/home'/>">Back to Home</a>
</body>
</html>