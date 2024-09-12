<%--
  Created by IntelliJ IDEA.
  User: 大咸鱼
  Date: 2024/9/12
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="com.wxy.Student" %> <%-- 替换为你的 Student 类所在的包 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>demo8</title>
</head>
<body>
<%-- 在脚本片段中创建学生列表 --%>
<%
    List<Student> students = new ArrayList<>();
    students.add(new Student("张三", 20, 85.0));
    students.add(new Student("李四", 21, 92.0));
    students.add(new Student("王五", 19, 78.0));
    request.setAttribute("students", students); // 设置为请求属性
%>

    <ul>
    <c:forEach var="student" items="${students}">

        <c:if test="${student.score >= 80}">
            1
            <li>${student.name}</li>
        </c:if>

    </c:forEach>
    </ul>
    </body>
    </html>
