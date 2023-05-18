<%--
  Created by IntelliJ IDEA.
  User: bandalgom78
  Date: 5/17/23
  Time: 4:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Color</title>
    <style>
        body{
            background-color: ${param.color};
        }
    </style>
</head>
<body>
<h1>Your favorite color is: ${param.color}</h1>

</body>
</html>
