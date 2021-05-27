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
<%-- TODO: When a user visits /login.jsp, they should see a form for logging in

 This form should have a 'username' and 'password' field.

 This form should submit a POST request to /login.jsp

TODO: Inside of login.jsp write some code to check the submmitted values.
TODO: If the username submitted is "admin", and the password is "password", redirect the user to the profile page; otherwise, redirect back to the login form. --%>

    <form method="POST" action="loginCheck.jsp">
        <br/>Username:<label>
            <input type="text" name="username">
        </label>

        <br/>Password:<label>
            <input type="password" name="password">
        </label>

        <br/><input type="submit" value="Submit">

    </form>
</body>
</html>

