<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/bootstrap-theme.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/font-awesome.min.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui.theme.css">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/jquery-ui.structure.css">
</head>
<style>
	body {
    font-family: Arial, sans-serif;
    background-color: #f4f4f4;
    margin: 0;
    padding: 20px;
}
    h1 {
    color: #333;
}
    p {
    color: #666;
}
    a {
    color: #007bff;
    text-decoration: none;
}
    a:hover {
    text-decoration: underline;
}
    .container {
    max-width: 800px;
    margin: 0 auto;
    padding: 20px;
    background-color: #fff;
    border-radius: 5px;
    box-shadow: 0 2px 4px rgba(0,0,0,0.1);
}
    .container h1 {
    margin-bottom: 20px;
}
    .container p {
    margin-bottom: 15px;
}
    .container a {
    display: inline-block;
    margin-top: 10px;
    padding: 10px 15px;
    background-color: #007bff;
    color: white;
    border-radius: 5px;
}
    .container a:hover {
    background-color: #0056b3;
}
</style>
<body>
	<h1>Welcome to BootMVCProj01</h1>	
	<p>This is a starter project for building web applications using Spring Boot and MVC.</p>
	<p>It provides a basic structure to get you started quickly with your web development.</p>
	<p>Feel free to customize it as per your requirements!</p>
	<a href="about.jsp">Go to About</a>
</body>
</html>