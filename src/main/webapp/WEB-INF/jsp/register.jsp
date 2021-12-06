<%--
  Created by IntelliJ IDEA.
  User: o_ram
  Date: 02.09.2021
  Time: 19:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>User Registration</title>
    <style>
        .xeta {
            color: red;
        }
    </style>
</head>
<body>
    <h1>Zehmet olmasa, butun melumatlari doldurun</h1>
    <form method="post" action="add">
        Name: <input type="text" name="name"> <br/>
        Surname: <input type="text" name="surname"> <br/>
        Mail: <input type="email" name="mail"> <br/>
        <input type="submit" value="Add">
    </form>
</body>
</html>
