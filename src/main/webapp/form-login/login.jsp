<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 8/26/2021
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        .hide {
            display: none;
        }
    </style>
</head>
<script
        src="https://code.jquery.com/jquery-3.4.1.min.js"
        integrity="sha256-CSXorXvZcTkaix6Yvo6HppcZGetbYMGWSFlBw8HfCJo="
        crossorigin="anonymous"></script>
<script type="text/javascript"
        src="https://cdn.jsdelivr.net/npm/jquery-validation@1.19.0/dist/jquery.validate.min.js"></script>

<body>
<div style="text-align: center">
    <h1>Form Login</h1>
    <form id = "loginForm" action="/login" method="post">
        <label>Email:</label>
        <input id="email" name="email" size="30" />
        <br><br>
        <label>Password:</label>
        <input type="password" name="password" size="30" />
        <br>${message}
        <br><br>
        <button type="submit">Login</button>
    </form>
</div>
<script type="text/javascript">
    $(document).ready(function() {
        $("#loginForm").validate({
            rules: {
                email: {
                    required: true
                    // email: true
                },
                password: "required",
            },
            messages: {
                email: {
                    required: "The email is required!",
                },
                password: "Please enter password"
            }
        });
    });
</script>
</body>
</html>
