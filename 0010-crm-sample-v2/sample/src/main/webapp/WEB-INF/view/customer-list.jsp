<%--
  Created by IntelliJ IDEA.
  User: A.Nemat
  Date: 7/27/2022
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<html>
<head>
    <title>customer list page</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
</head>
<body>
<header>
    <h1>CRM - CUSTOMER RELATIONSHIP MANAGER</h1>
</header>

<div id="container">
    <div id="content">
        <table>
            <tr>
                <th>Firstname</th>
                <th>Lastname</th>
                <th>Email</th>
            </tr>
            <c:forEach var="tempCustomer" items="${customers}">
                <tr>
                    <td>${tempCustomer.firstName}</td>
                    <td>${tempCustomer.lastName}</td>
                    <td>${tempCustomer.email}</td>
                </tr>
            </c:forEach>

        </table>        
    </div>
</div>

</main>
</body>
</html>
