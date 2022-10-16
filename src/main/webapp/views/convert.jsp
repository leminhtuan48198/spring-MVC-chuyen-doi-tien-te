
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Convert money</title>
</head>
<body>
<form method="post" action="/convert" >
    <input type="text" name="rate" value="${rate}">rate
    <br>
    <input type="text" name="usd" value="${usd}">usd
    <br>
    <button type="submit">Convert</button>
</form>
<c:out value="${vnd}"/>
<c:if test="${not empty vnd}">VND </c:if>
</body>
</html>
