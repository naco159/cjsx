<%--
  Created by IntelliJ IDEA.
  User: 大咸鱼
  Date: 2024/9/12
  Time: 20:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
  <title>JSTL forEach Example</title>
</head>
<body>

<% String[] strings = {"Hello", "World", "JSTL", "forEach"}; %>

<% request.setAttribute("strings", strings); %>

  <ul>
  <c:forEach var="string" items="${strings}">
    <li>${string}</li>
  </c:forEach>
  </ul>
  </body>
  </html>
