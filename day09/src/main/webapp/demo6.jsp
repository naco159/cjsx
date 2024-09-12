<%--
  Created by IntelliJ IDEA.
  User: 大咸鱼
  Date: 2024/9/12
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>

<html>
<head>
  <title>demo6</title>
</head>
<body>

<% int number = 15; %>

<% request.setAttribute("number", number); %>


  <c:if test="${number > 10}">
    大于 10
  </c:if>
  <c:if test="${number <= 10}">
    小于等于 10
  </c:if>
  </body>
  </html>
