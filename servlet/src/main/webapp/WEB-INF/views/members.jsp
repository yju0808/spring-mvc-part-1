<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" language="java" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <meta charset="UTF-8">
    <title>Member List</title>
</head>
<body>
    <a href="/index.html">메인</a>
    <table>
        <thead>
            <tr>
                <th>id</th>
                <th>username</th>
                <th>age</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="member" items="${members}">
            <tr>
                <td>${member.id}</td>
                <td>${member.username}</td>
                <td>${member.age}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
        
</body>
</html>
