<%--
  Created by IntelliJ IDEA.
  User: Jin
  Date: 31.05.2020
  Time: 8:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <title>Richest</title>
    <link href="https://fonts.googleapis.com/css2?family=Quicksand&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Quicksand:wght@700&display=swap" rel="stylesheet">
    <style>
        <%@include file='/style/style.css' %>
    </style>
</head>
<body>
<h1>Richest</h1>

<form method="post" action="richest" >
    <input name="max" type="text" size="10" value="${max}" placeholder="Enter 'get'">
    <button type="submit">get</button>
</form>
<div>
    <button onclick="location.href='/'">Back to main</button>
</div>
</body>
</html>
