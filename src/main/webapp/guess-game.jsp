<%--
  Created by IntelliJ IDEA.
  User: alexhernando-avitia
  Date: 5/28/21
  Time: 1:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guessing Game</title>
</head>
<body>
    <h1>Guessing Game</h1>
    <p>Let's play a game: guess a number between 1 and 3, and see if you've guessed correctly.</p>
    <form action="/guess-game.jsp">
        <div class="form-group">
            <label for="guess">Your guess</label>
            <input id="guess" name="guess" class="form-control" type="text">
        </div>
    </form>
</body>
</html>
