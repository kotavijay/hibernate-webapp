<%--
  Created by IntelliJ IDEA.
  User: kotas
  Date: 19/07/20
  Time: 10:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration</title>
</head>
<body>
<h2>User Registration Form</h2>

<form action="register.jsp" method="post">
    First Name:<input type="text" name="firstName"/><br><br>
    Last Name:<input type="text" name="lastName"/><br><br>
    Mail ID:<input type="text" name="email"/><br><br>
    Password:<input type="password" name="password"/><br><br>
    <input type="submit" value="register"/>

</form>
</body>
</html>
