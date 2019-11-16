<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form action="/NewRegistration/LoginServlet" method="get">
		<label>Username</label>
			<input type="text" name="unameTxt"><br>
			<label>Password</label>
			<input type="text" name="passTxt"><br>
			<input type="Submit" value="Sign up">
		</form>
</body>
</html>