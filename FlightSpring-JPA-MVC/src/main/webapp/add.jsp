<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" errorPage="errpage.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="navbar.jsp"></jsp:include>
	<form action="add.do">
	<h1>${flight}</h1>
	<h1>Add Flight</h1>
	<h2>Carrier: </h2><input name="carrier" required pattern="[A-Za-z]{5,}"><br>
	<h2>Source: </h2><input name="source"><br>
	<h2>Destination: </h2><input name="destination"><br>
	<h2>Distance: </h2><input name="distance"><br>
	<input type="submit" value="Add">
	</form>
</body>
</html>