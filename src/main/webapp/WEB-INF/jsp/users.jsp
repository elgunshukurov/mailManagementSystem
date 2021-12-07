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
    <title>Users</title>
    <style>
        table, tr, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <h2><a href="add">Yeni user elave et</a></h2>
<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Surname</th>
        <th>Mail</th>
    </tr>
    <c:forEach items="${user}" var="user" >
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.surname}</td>
            <td>${mail.mail_address}</td>
            <td>
                <a href="/employees/${user.id}">View</a> &nbsp;
                <a href="/employees/${user.id}/update">Update</a> &nbsp;
                <a href="/employees/${user.id}/delete">Delete</a>
            </td>
        </tr>
    </c:forEach>
    <tr></tr>
</table>
</body>
</html>
