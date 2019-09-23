<%@ taglib prefix="c" uri="http://www.springframework.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Chenwz
  Date: 2019/9/16 0016
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" session="false" %>
<html>
<head>
    <title>Spittr</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/>">
</head>
<body>
    <h1>Welcome to Spitter</h1>
    <a href="<c:url value="/spittles"/>">Spittles</a>
    <a href="<c:url value="/spitter/register"/>">Register</a>
</body>
</html>