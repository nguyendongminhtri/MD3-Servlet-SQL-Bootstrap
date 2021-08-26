<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/23/2021
  Time: 10:12 AM
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
</head>
<body>
<h1>Category</h1>
<a href="/category?action=create">Create Category</a>

<table class="table">
    <thead>
    <tr>
        <th scope="col">STT</th>
        <th scope="col">Name Category</th>
        <th scope="col">Avatar</th>
    </tr>
    </thead>
    <c:forEach items='${requestScope["categories"]}' var="categories">
        <tbody>
        <tr>
            <th scope="row">${categories.getId()}</th>
            <td>${categories.getNameCategory()}</td>
            <td>${categories.getAvatarCategory()}</td>
<%--            <td>@mdo</td>--%>
        </tr>
<%--        <tr>--%>
<%--            <th scope="row">2</th>--%>
<%--            <td>Jacob</td>--%>
<%--            <td>Thornton</td>--%>
<%--            <td>@fat</td>--%>
<%--        </tr>--%>
<%--        <tr>--%>
<%--            <th scope="row">3</th>--%>
<%--            <td colspan="2">Larry the Bird</td>--%>
<%--            <td>@twitter</td>--%>
<%--        </tr>--%>
        </tbody>
    </c:forEach>

</table>
</body>
</html>
