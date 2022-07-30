<%--
  Created by IntelliJ IDEA.
  User: A.Nemat
  Date: 7/30/2022
  Time: 10:02 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/addForm.css">
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/button.css">
</head>
<body>
<header>
        <h1>CRM - CUSTOMER RELATIONSHIP MANAGER</h1>
        <h2>Add / Update Customer Form</h2>
</header>
<div class="form-container">
    <form:form modelAttribute="customer" action="saveCustomer" method="post">
        <form:hidden path="id"/>
        <table>
            <tbody>
            <tr>
                <td><label>First name :</label></td>
                <td><form:input cssClass="text-input" path="firstName"/></td>
            </tr>

            <tr>
                <td><label>Last name :</label></td>
                <td><form:input cssClass="text-input" path="lastName"/></td>
            </tr>

            <tr>
                <td><label>Email : </label></td>
                <td><form:input cssClass="text-input" path="email"/></td>
            </tr>

            <tr>
                <td><label></label></td>
                <td><input type="submit" value="Save" class="button"></td>
            </tr>
            </tbody>
        </table>
    </form:form>

    <div style="clear: both"></div>
    <p>
        <a href="${pageContext.request.contextPath}/customer-list">Back to customer list</a>
    </p>
</div>


<%-- script for save customer button--%>
<%--<script>--%>
<%--    document.querySelector('.button').addEventListener('click', function (event) {--%>
<%--        event.preventDefault();--%>
<%--    });--%>
<%--</script>--%>
</body>
</html>
