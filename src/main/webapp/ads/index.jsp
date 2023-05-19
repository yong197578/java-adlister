<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bandalgom78
  Date: 5/19/23
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>See all dao.Ads</title>
</head>
<body>
    <form action="index.jsp" method="post">
        <label for="id">Enter id:</label>
        <input type="text" name="id" id="id">
        <label for="userId">Enter userId:</label>
        <input type="text" name="userId" id="userId">
        <label for="title">Enter ad's title: </label>
        <input type="text" name="title" id="title">
        <label for="description">Enter description: </label>
        <input type="text" name="description" id="description">
        <button>Submit</button>
    </form>
    <h1>Here is all dao.Ads!</h1>
    <c:forEach items="${allAds}" var="allAd">
        <p>Post#${allAd.id} & Posted BY userId: ${allAd.userId}</p>
        <h2>${allAd.title}</h2>
        <p>${allAd.description}</p>
    </c:forEach>
</body>
</html>
