<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="static by.itclass.constants.AppConstants.*" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Add User</title>
</head>
<body>
    <sf:form method="post" action="<%=SAVE_USER_URL%>" modelAttribute="user">
        <sf:input path="name"/><br>
        <sf:input path="email"/><br>
        <input type="submit" value="Save">
    </sf:form>
</body>
</html>
