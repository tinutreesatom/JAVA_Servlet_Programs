<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/NewRegistration/RegisterServlet" method="POST">
		<label>Name</label>
		<input type="text" name="nameTxt"><br>
		<label>Email</label>
		<input type="text" name="emailTxt"><br>
		<label>Contact No</label>
		<input type="text" name="phTxt"><br>
		<label>Username</label>
		<input type="text" name="unameTxt"><br>
		<label>Password</label>
		<input type="text" name="passTxt"><br>
		<input type="Submit" value="Sign up">
	</form>
</body>
</html>