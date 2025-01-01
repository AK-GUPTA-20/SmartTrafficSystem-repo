<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <body>
        <h1>User Data</h1>
        <table>
            <tr><th>Username</th><th>Email</th></tr>
            <c:forEach var="user" items="${userList}">
                <tr><td>${user.username}</td><td>${user.email}</td></tr>
            </c:forEach>
        </table>
    </body>
</html>