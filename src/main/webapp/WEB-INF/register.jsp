<%--
  Created by IntelliJ IDEA.
  User: bandalgom78
  Date: 5/24/23
  Time: 11:34 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome to Registration Page" />
    </jsp:include>
</head>

<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />
<div class="container">
    <h1>Registration</h1>
    <form action="/register" method="post">
        <div>
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" class="form-control" required>
        </div>
        <div>
            <label for="email">Email:</label>
            <input type="email" id="email" name="email"class="form-control" required>
        </div>
        <div>
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" class="form-control" required>
        </div>
            <input type="submit" class="btn btn-primary btn-block" value="Register">
    </form>
</div>
</body>
</html>
