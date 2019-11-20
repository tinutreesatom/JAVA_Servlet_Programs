<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>
	<form method="post" action="">
		<h3>Product add</h3>
		<h1>Name</h1><input type="text" name="productName" value="${user.productName}">
		<h1>Quantity</h1><input type="text" name="productQuant" value="${user.productQuant}">
		<h1>Price</h1><input type="text" name="productPrice" value="${user.productPrice}">
		<input type="submit" value="submit">
	</form>
<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>