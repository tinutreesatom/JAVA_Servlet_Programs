<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<jsp:include page="_header.jsp"></jsp:include>
	<jsp:include page="_menu.jsp"></jsp:include>
	<h1>Login</h1>
	<p style="color:red;">${errorString}</p>
	<form metod="post" action="${pageContext.request.contextPath}/login">
	<table border="0">
		<tr>
			<td>Username</td>
			<td><input type="text" name="userName" value="${user.userName}"></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="text" name="password" value="${user.password}"></td>
		</tr>
		<tr>
			<td>Remember me</td>
			<td><input type="checkbox" name="rememberMe" value="y"></td>
		</tr>
		<tr>
			<td colspan="2"><input type="Submit" value="Submit">
				<a href="${pageContext.request.contextPath}/">Cancel</a>
			</td>
		</tr>
	</table>
	</form>
	<jsp:include page="_footer.jsp"></jsp:include>
</body>
</html>