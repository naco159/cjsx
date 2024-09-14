<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
</head>
<body>
<h2>Login</h2>
<form action="login" method="post">
    Username: <input type="text" name="username" required><br>
    Password: <input type="password" name="password" required><br>
    <input type="submit" value="Login">
</form>
<p style="color:red;">
    <% String error = (String) request.getAttribute("error");
        if (error != null) {
            out.print(error);
        }
    %>
</p>
</body>
</html>