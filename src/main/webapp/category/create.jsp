<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/23/2021
  Time: 9:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.3/dist/umd/popper.min.js" integrity="sha384-eMNCOe7tC1doHpGoWe/6oMVemdAVTMs2xqW4mwXrXsW0L84Iytr2wi5v2QjrP/xp" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.min.js" integrity="sha384-cn7l7gDp0eyniUwwAZgrzD06kc/tftFf19TOAs2zVinnD/C7E91j9yyk5//jjpt/" crossorigin="anonymous"></script>
<html>
<head>
    <title>Title</title>
    <style>
        .create-category {
            text-align: center;
            width: 350px;
        }
    </style>
</head>
<body>
<h1>Create new Category</h1>
<c:if test='${requestScope["message"] != null}'>
<span style="color: red">${requestScope["message"]}</span>
</c:if>
<a href="/category">Back To List Category</a>
<form class="create-category"  method="post">
        <span class="input-group-text">Name Category</span>
        <input name="nameCategory" type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
        <span class="input-group-text" >Avatar</span>
        <input name="avatarCategory" type="text" class="form-control" placeholder="Username" aria-label="Username" aria-describedby="basic-addon1">
    <button type="submit" class="btn btn-primary">Create</button>
</form>

</body>

</html>
