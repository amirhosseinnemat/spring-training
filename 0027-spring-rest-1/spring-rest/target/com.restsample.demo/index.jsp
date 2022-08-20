<%--
  Created by IntelliJ IDEA.
  User: A.Nemat
  Date: 8/20/2022
  Time: 12:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h1>Hello, Dolly</h1>
    <hr>
    <a href="/test/hello">Click here for hello.</a><br>
    <a href="/test/bye">Click here for bye.</a>
    <hr>
    <a href="${pageContext.request.contextPath}/api/students">click here for getting students</a>

</body>
</html>
