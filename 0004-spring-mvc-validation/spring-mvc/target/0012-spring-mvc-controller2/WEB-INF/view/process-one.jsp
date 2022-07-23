<%--
  Created by IntelliJ IDEA.
  User: A.Nemat
  Date: 7/13/2022
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${student.name}</h1>
<h1>${student.family}</h1>
<h1 style="color: navy">country : ${student.country}</h1>
<h1 style="color: navy">city : ${student.city}</h1>
<h2 style="color: #243b55"> gender : ${student.gender}</h2>

operating system :
<ul>
<c:forEach var="os" items="${student.operatingSystem}">
    <li>${os}</li>
</c:forEach>
</ul>

</body>
</html>
