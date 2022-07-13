<%--
  Created by IntelliJ IDEA.
  User: A.Nemat
  Date: 7/13/2022
  Time: 11:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>

</head>
<body>

<form:form action="/result-form" modelAttribute="student">
    First Name : <form:input path="name"/>
    <br><br>
    Last Name : <form:input path="family"/>
    <br><br>
    <input type="submit" value="submit">
</form:form>


</body>
</html>
