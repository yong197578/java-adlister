<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bandalgom78
  Date: 5/19/23
  Time: 9:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Alums</title>
</head>
<body>

  <c:forEach items="${albums}" var="album">
    <div>
    <h1>${album.id}</h1>
    <h1>${album.artist}</h1>
    <p>${album.song}</p>
    <p>${album.sales}</p>
    <p>${album.release_date}</p>
    <p>${album.genre}</p>
    </div>
  </c:forEach>
  <c:forEach items="${quotes}" var="quote">
    <div>
    <h1>${quote.id}</h1>
<%-- this will print author's object    <h1>${quote.author}</h1>--%>
    <h1>"${quote.content}"</h1>
      <p>${quote.content} - ${quote.author.first_name} ${quote.author.last_name}</p>
    </div>
  </c:forEach>
</body>
</html>
