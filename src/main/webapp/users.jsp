<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="static by.itclass.constants.AppConstants.*" %>
<html>
<head>
    <title>Users</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>Email</th>
            <th>City</th>
            <th>Street</th>
            <th>Action</th>
        </tr>
        <c:forEach var="user" items="${userList}">
            <tr>
                <td>${user.id}</td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.address.city}</td>
                <td>${user.address.street}</td>
                <td>
                    <a href="<%=DEL_USER_URL%>?id=${user.id}" onclick="myFunction()">Delete</a>
                    <a href="<%=UPD_USER_URL%>/${user.id}">Update</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <p>
        <a href="<%=ADD_USER_URL%>">Add new User</a>
    </p>

    <script>
        function myFunction() {
            confirm("Press a button!");
        }
    </script>
</body>
</html>
