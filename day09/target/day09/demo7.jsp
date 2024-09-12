<%--
  Created by IntelliJ IDEA.
  User: 大咸鱼
  Date: 2024/9/12
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>demo7</title>
</head>
<body>

<% int number = 2;%>

<% request.setAttribute("number", number); %>


  <c:choose>
    <c:when test="${number == 1}">
      One
    </c:when>
    <c:when test="${number == 2}">
      Two
    </c:when>
    <c:otherwise>
      Other
    </c:otherwise>
  </c:choose>
  </body>
  </html>
