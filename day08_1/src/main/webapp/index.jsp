<%@ page import="java.util.*" %>
<%@ page import="com.wxy.Student" %> <!-- 导入默认包中的 Student 类 -->
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生成绩处理</title>
    <style>
        .red { color: red; }
        .blue { color: blue; }
    </style>
</head>
<body>
<%
    // 假设 students 是已经填充了学生信息的 List<Student>
    // 在实际应用中，这个列表应该从后端（如 Servlet）传递到 JSP 页面
    List<Student> students = new ArrayList<>();
    students.add(new Student("张三", 20, 85.0));
    students.add(new Student("李四", 21, 92.0));
    students.add(new Student("王五", 19, 78.0));
    // ... 添加更多学生信息

    double sum = 0;
    for (Student student : students) {
        sum += student.getScore();
    }
    double average = sum / students.size();
%>
<h2>学生平均成绩: <%= average %></h2>
<ul>
    <% for (Student student : students) { %>
    <% if (student.getScore() > average) { %>
    <li class="red"><%= student.getName() %> - 成绩: <%= student.getScore() %></li>
    <% } else if (student.getScore() < average) { %>
    <li class="blue"><%= student.getName() %> - 成绩: <%= student.getScore() %></li>
    <% } else { %>
    <li><%= student.getName() %> - 成绩: <%= student.getScore() %></li>
    <% } %>
    <% } %>
</ul>
</body>
</html>