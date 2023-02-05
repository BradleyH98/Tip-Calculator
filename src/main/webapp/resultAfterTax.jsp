<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Final amount</title>
</head>
<body>
	<h1>Tip Amount</h1>
	<p>The amount of you tip based off of the percent: <br />
	${userTotal.returnTip()}<br />
	</p>
	<h2>Full Amount After Tax</h2>
	<p>
	${userTotal.returnFullAmount()}<br />
	</p>
<a href="index.jsp">Find a different tip amount</a>
</body>
</html>