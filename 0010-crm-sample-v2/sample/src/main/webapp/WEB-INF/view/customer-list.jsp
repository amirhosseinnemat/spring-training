<%--
  Created by IntelliJ IDEA.
  User: A.Nemat
  Date: 7/27/2022
  Time: 11:25 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>customer list page</title>

    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/style.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/button.css">
</head>
<body>
<header>
    <h1>CRM - CUSTOMER RELATIONSHIP MANAGER</h1>
</header>

<input class="button" type="button" value="Add Customer" onclick="window.location.href='showFormForAdd'">

<div id="container">
    <div id="content">
        <table>
            <tr>
                <th>Firstname</th>
                <th>Lastname</th>
                <th>Email</th>
                <th>Action</th>
            </tr>
            <c:forEach var="tempCustomer" items="${customers}">

                <%--construct an update link with customer id--%>
                <c:url var="updateLink" value="/showFormForUpdate">
                    <c:param name="customerId" value="${tempCustomer.id}"/>
                </c:url>

                <%--construct an delete link with customer id--%>
                <c:url var="deleteLink" value="/delete">
                    <c:param name="customerId" value="${tempCustomer.id}"/>
                </c:url>
                <tr>
                    <td>${tempCustomer.firstName}</td>
                    <td>${tempCustomer.lastName}</td>
                    <td>${tempCustomer.email}</td>
                    <td><a href="${updateLink}" style="text-decoration: none">Update</a> |
                        <a href="${deleteLink}" style="text-decoration: none" onclick="if (!(confirm('Are you sure?'))) return false">Delete</a></td>
                </tr>

            </c:forEach>

        </table>
    </div>
</div>


<%-- script for add customer button--%>
<script>
    document.querySelector('.button').addEventListener('click', function (event) {
        event.preventDefault();
    });
</script>

</main>
</body>
</html>
