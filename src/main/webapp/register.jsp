<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 17-07-2020
  Time: 08:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"
         import="com.hibernate.sample.webapp.dao.UserDao" %>
<html>
<head>
    <title>Register User</title>
</head>
<body>
<jsp:useBean id="user" class="com.hibernate.sample.webapp.model.User"></jsp:useBean>
<jsp:setProperty name="user" property="*"></jsp:setProperty>
<%
    Long i = UserDao.registerUser(user);
    if (i > 0) {
        System.out.println("Successfully registered.");
    }
%>
<h4>Successfully registered.</h4>
</body>

</html>