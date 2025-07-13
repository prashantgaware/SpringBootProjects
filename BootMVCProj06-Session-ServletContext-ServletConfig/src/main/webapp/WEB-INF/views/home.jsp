<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
    <%-- This creates a robust URL: /CONTEXT_PATH/test/showResult --%>
	<a href="<c:url value='/test/showResult'/>">
		<h1 style="color:blue; text-align:center;">
	    	Click here to see Session, ServletContext, and ServletConfig data
	    </h1>
	</a>
</body>
</html>