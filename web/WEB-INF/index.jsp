<%@ page import="com.mykong.User" %><%--
  Created by IntelliJ IDEA.
  User: tethippe
  Date: 3/16/2016
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello</title>
</head>
<body>
<p> Hello World</p>
<form action="home" method="get">
    First name:<br>
    <input type="text" name="firstname"><br>
    Password:<br>
    <input type="password" name="password">
    <input type="submit" value="Submit">
</form>

<% String user = (String) request.getAttribute("user");
    if(user == null) {
        user = "Tej";
    }
%>
<h2> Welcome <%= user%></h2>
</body>
</html>
