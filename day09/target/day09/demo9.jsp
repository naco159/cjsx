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
    <title>demo9</title>
</head>
<body>
<c:set var="greeting" value="Hello, World!" scope="request"/>

<!-- 使用 EL 表达式输出该变量的值 -->
<p>${requestScope.greeting}</p>

<!-- 或者，如果当前作用域内没有同名的变量，可以省略作用域前缀 -->
<p>${greeting}</p>
</body>
</html>
