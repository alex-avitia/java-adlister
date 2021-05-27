<%--
  Created by IntelliJ IDEA.
  User: alexhernando-avitia
  Date: 5/27/21
  Time: 3:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Check Login</title>
</head>
<body>
    <%
        String username=request.getParameter("username");
        String password=request.getParameter("password");

        if ((username.equals("admin") && password.equals("password"))) {
            response.sendRedirect("profile.jsp");
        } else {
            session.setAttribute("username", username);
            response.sendRedirect("login.jsp");
        }
    %>
</body>
</html>
