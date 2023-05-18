<%--
  Created by IntelliJ IDEA.
  User: bandalgom78
  Date: 5/17/23
  Time: 4:46 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Game</title>
</head>
<body>
<form action="/guess" method="post">
    <h1>Welcome to Guess Game!</h1>
    <label for="guess">Please guess 1-3</label>
    <input type="text" name="guess" id="guess">
    <button type="submit">Guess!</button>
</form>
</body>
</html>
