<%--
  Created by IntelliJ IDEA.
  User: o_ram
  Date: 31.08.2021
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employee Profile</title>
    <style>
        table, tr, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <c:choose>
        <c:when test="${not empty user}">
            <h2>Employee Profile</h2>
            ID: ${user.id} <br/>
            Name: ${user.name} <br/>
            Surname: ${user.surname} <br/>
            Mail: ${mail.mail_address} <br/>
        </c:when>
        <c:otherwise>
            <h2>User not found!</h2>
        </c:otherwise>
    </c:choose>

</body>
</html>
