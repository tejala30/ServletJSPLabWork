<%@ page import="com.mykong.User" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--
  Created by IntelliJ IDEA.
  User: tethippe
  Date: 3/16/2016
  Time: 2:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>${initParam.ProductName}</title>
    <link href="../app.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<% User user = (User) request.getAttribute("user");
    if(user == null) {
        user = new User();
        user.setName("Tej");
    }
%>
<h2> Welcome <%= user.getName() %></h2>
<%--<h2> Welcome ${user.name}</h2>--%>
<p> Today is ${dayOfWeek}</p>
<div class=${app.formCssClass}>
<form action="home" method="post">
    First name:<br>
    <input type="text" name="firstname"><br>
    Password:<br>
    <input type="password" name="password">
    <br>
    <br>
    <br>
    <input type="submit" value="Submit">
</form>
</div>

<p> Here are the list of entities</p>
<ul>
    <c:forEach items="{entities}" var="entity">
        <li>${entity.name}</li>
    </c:forEach>
</ul>

</body>
</html>
