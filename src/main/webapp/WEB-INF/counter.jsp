<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Current Visit Count</title>
</head>
<body>
	<p>You have visted <a href="#">http:/your_server</a> <c:out value="${count}" /> times</p> 
	<div><a href="/your_server">Test Another visit ?</a></div>
	<div><a href="/your_server/reset">
		<button>Rest counter to zero</button>
	</a>
	</div>
	
	
</body>
</html>