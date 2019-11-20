<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div style="backgound:#E0E0E0;height:55px;padding:5px;">
		<div style="float:left">
			<h1>My site</h1>
		</div>
		<div style="float:right;padding:10px;text-align:right">
		<!-- user store in session with attribute -->
		Hello<b>${loginedUser.userName}</b>
		<br/>
		Search<input name="search">
		</div>
	</div>
</body>
</html>