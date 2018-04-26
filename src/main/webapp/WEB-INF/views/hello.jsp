
<%--
  Created by IntelliJ IDEA.
  User: mateusz
  Date: 25.04.18
  Time: 20:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <style>
        tr,table,td{
            border: black solid 1px;
            padding: 7px;
            text-align: center;
        }
    </style>
</head>
<body>

<table>
    <tr>
        <td>Name</td>
        <td>Surname</td>

    </tr>
    <c:forEach items="${articles}" var="article">
        <tr>
            <td>${article.title}</td>
            <td>${article.author}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>