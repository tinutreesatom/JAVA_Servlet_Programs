<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome
<!-- <form action="/NewRegistration/HomeServlet" method="post">
	<input type="submit" value="submit">
</form>-->
<table border="1">
<tr>
			<th>SI No</th>
			<th>Name</th>
			<th>Email</th>
			<th>PhNo</th>
			<th>Username</th>
			<th>Password</th>
		</tr>
<%String uname=request.getParameter("unameTxt") ;
session.setAttribute("userName",uname);
%>
<%@page import="java.util.List" %>
<%@page import="com.face.bo.LoginBO" %>
<%@page import="java.util.Iterator" %>
<%  
int i=0;
Iterator itr; 
List data=(List)request.getAttribute("data");
for(itr=data.iterator(); itr.hasNext();){
   // while (iterator.hasNext()) { 
    	//LoginBO hbo=iterator.next();
    	%><tr>
    		<td><%out.print(++i); %></td>
    		<td><% out.print(itr.next());%></td>
    		<td><% out.print(itr.next());%></td>
    		<td><% out.print(itr.next());%></td>
    		<td><% out.print(itr.next());%></td>
    		<td><% out.print(itr.next());%></td>
    	</tr>
   <% }
 %>
		
		
	</table>
</body>
</html>