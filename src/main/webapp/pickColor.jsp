<%--
  Created by IntelliJ IDEA.
  User: bandalgom78
  Date: 5/17/23
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color Page</title>
</head>
<body>
<form action="/pickcolor" method="post">
  <label for="colorInput">Enter your favorite color: </label>
  <input type="text" id="colorInput" name="color">
  <button type="submit">Submit</button>
</form>
</body>
</html>
