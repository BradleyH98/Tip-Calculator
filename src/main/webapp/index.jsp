<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Tip Calculator</title>
</head>
<body>
	<h1>Option 1: Tip Calculator</h1>
	<form action="getTipInfoServlet" method="post">
		<p>Enter the amount in the first text box and the percentage to tip in the second text box to find the tip in a dollar amount</p>
		<label for="amount">Amount Due:</label><br>
		<input type="text" name="baseAmount" value="0" size="10" ><br><br>
		<label for="tipPercentage">Tip Percentage:</label><br>
		<input type="text" name="tipPercentage" value="0" size="10" ><br><br>
		<input type="submit" value="Calculate Tip" />
	</form>
	<h2>Option 2: Total, Tip and Tax Calculator</h2>
	<form action="getFullAmountServlet" method="post">
		<p>Enter the amount in the first text box and the percentage to tip in the second text box and we'll add tax to find the total amount</p>
		<label for="amount">Amount Due:</label><br>
		<input type="text" name="baseAmount" value="0" size="10" ><br><br>
		<label for="tipPercentage">Tip Percentage:</label><br>
		<input type="text" name="tipPercentage" value="0" size="10" ><br><br>
		<input type="submit" value="Calculate Total" />
	</form>
</body>
</html>