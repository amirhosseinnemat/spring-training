<%--
  Created by IntelliJ IDEA.
  User: A.Nemat
  Date: 8/16/2022
  Time: 11:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Admin page</title>
</head>
<body>

  <h1>welcome to admin page</h1>

  <hr>

  <p>
      user : <sec:authentication property="principal.username"/>, glad to see you here.
  </p>

  <hr>

  <p>
      <a href="${pageContext.request.contextPath}/">back to home.</a>
  </p>

</body>
</html>
