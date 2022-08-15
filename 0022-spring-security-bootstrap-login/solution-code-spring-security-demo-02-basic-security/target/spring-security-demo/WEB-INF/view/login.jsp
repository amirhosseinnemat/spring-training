<%--
  Created by IntelliJ IDEA.
  User: A.Nemat
  Date: 8/15/2022
  Time: 2:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>

    <style>
        .failed {
            color: darkred;
        }
    </style>
</head>
<body>
<h1>login form</h1>
<hr>

<form:form action="${pageContext.request.contextPath}/authenticateTheUser"
           method="POST">

        <%-- check for login error --%>

        <c:if test="${param.error != null}">
            <i class="failed"> Sorry! invalid username/password.</i>
        </c:if>

        <p>
            username : <input type="text" name="username" />
        </p>

    <p>
        password : <input type="password" name="password" />
    </p>

    <input type="submit" value="Login" />

</form:form>
</body>
</html>
