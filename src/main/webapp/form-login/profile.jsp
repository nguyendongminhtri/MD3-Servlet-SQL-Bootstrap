<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/26/2021
  Time: 1:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/category?action=create">Create Category</a>
<div style="text-align: center">
    <h1>Welcome to Website Trộm Chó!</h1>
    <b>${user.fullname} (${user.email})</b>
    <br><br>
    <a href="/logout">Logout</a>
</div>
</body>
</html>
