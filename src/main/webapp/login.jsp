<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: bandalgom78
  Date: 5/17/23
  Time: 10:14 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
    <jsp:include page="partial/header.jsp" />
</head>
<body>
<jsp:include page="partial/navbar.jsp" />

    <h1>Welcome to the Page!</h1>
    <form action="login.jsp" method="POST">
        <label for="username">Username:</label>
        <input type="text" name="username" id="username">
        <br>
        <label for="password">Password:</label>
        <input type="password" name="password" id="password">
        <button type="submit">Submit</button>
    </form>

    <c:set var="username" value="${param.username}" />
    <c:set var="password" value="${param.password}" />



    <c:if test='<%=request.getMethod().equalsIgnoreCase("post")%>'>
        <c:choose>
            <c:when test="${username.equals('admin') && password.equals('password')}">
                <c:redirect url="profile.jsp" />
<%--                <%=response.sendRedirect("profile.jsp")%>--%>
            </c:when>
        </c:choose>
        <c:otherwise>
            <c:redirect url="login.jsp" />
        </c:otherwise>
    </c:if>


<%--    <%  if(request.getMethod().equalsIgnoreCase("post")) {--%>
<%--        String username = request.getParameter("username");--%>
<%--        String password = request.getParameter("password");--%>
<%--        if (username.equals("admin") && password.equals("password")) {--%>
<%--            response.sendRedirect("/profile.jsp");--%>
<%--        } else {--%>
<%--            response.sendRedirect("/login.jsp");--%>
<%--        }--%>
<%--    }--%>

<%--    %>--%>


</body>
</html>
