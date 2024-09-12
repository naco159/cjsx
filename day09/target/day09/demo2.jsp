<%--
  Created by IntelliJ IDEA.
  User: 大咸鱼
  Date: 2024/9/12
  Time: 20:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" %>
<%@ page import="com.wxy.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>demo2</title>
</head>
<body>
<%
    List<Student> students = new ArrayList<>();
    students.add(new Student("张三", 20));
%>



<!-- 使用 EL 表达式输出 person 的属性 -->

<% for (Student student : students) { %>
<p>姓名:<%=student.getName()%></p>
<p>年龄：<%=student.getAge()%></p>
<% } %>


</body>
</html>
