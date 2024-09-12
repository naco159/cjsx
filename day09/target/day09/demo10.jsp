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
    <title>demo10</title>
</head>
<body>
<c:url var="myUrl" value="index.jsp">
    <c:param name="param1" value="value1" />
    <c:param name="param2" value="value2" />
</c:url>

<!-- 输出生成的 URL -->
<p>Generated URL: <a href="${myUrl}">${myUrl}</a></p>
</body>
</html>