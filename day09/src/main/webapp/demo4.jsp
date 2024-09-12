<%@ page import="java.util.ArrayList, java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>demo4</title>
</head>
<body>
<%-- 使用 Scriptlet 创建一个包含整数的 List --%>
<%
  List<Integer> numbers = new ArrayList<>();
  numbers.add(10);
  numbers.add(20);
  numbers.add(30);

%>

<!-- 使用 EL 表达式输出 List 中的第一个元素 -->
<p>The first element of the list is: <%=numbers.get(0)%></p>
</body>
</html>