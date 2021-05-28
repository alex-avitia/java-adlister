<%--
  Created by IntelliJ IDEA.
  User: alexhernando-avitia
  Date: 5/27/21
  Time: 2:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form method="POST" action="login.jsp">
        <br/>Username:
        <label>
            <input type="text" name="username">
        </label>

        <br/>Password:
        <label>
            <input type="password" name="password">
        </label>

        <br/><input type="submit" value="Submit">
    </form>

    <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        request.setAttribute("username", username);
        request.setAttribute("password", password);
    %>

    <c:choose>
        <c:when test="${username.equals('admin')} && ${password.equals('password')}">
            <% response.sendRedirect("profile.jsp"); %>
        </c:when>
    </c:choose>
</body>
</html>

