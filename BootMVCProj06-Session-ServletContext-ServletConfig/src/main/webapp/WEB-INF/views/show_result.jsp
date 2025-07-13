<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Servlet context, Servlet config, Http Session</title>
</head>
<body>
	<h1 style="color:blue; text-align:center;">
        Results Page
    </h1>
    
    <%-- Use the 'contextPath' attribute you set in the controller --%>
    <p style="color:green; text-align:center;">
        <b>Context Path:</b> ${contextPath}
    </p>
    
    <%-- Use the 'servletName' attribute you set in the controller --%>
    <p style="color:green; text-align:center;">
        <b>Servlet Name:</b> ${servletName}
    </p>
    
    <%-- Use the 'sessionId' attribute you set in the controller --%>
    <p style="color:green; text-align:center;">
        <b>Http Session ID:</b> ${sessionId}
    </p>

    <br/>
    <a href="<c:url value='/test/home'/>">Back to Home</a>
</body>
</html>