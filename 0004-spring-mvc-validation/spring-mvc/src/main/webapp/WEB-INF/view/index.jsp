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
    <style>
        .error {
            color: darkred;
            font-style: italic;
        }
    </style>

</head>
<body>

<form:form action="/result-form" modelAttribute="student">
    First Name : <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>
    <br><br>
    Last Name : <form:input path="family"/>
    <form:errors path="family" cssClass="error"/>
    <br><br>
    Country : <form:select path="country">
    <form:option value="IRAN" label="Iran"/>
    <form:option value="TURKEY" label="Turkey"/>
</form:select>
    <br><br>

    city : <form:select path="city">
    <form:options items="${student.cityOptions}"/>
</form:select>

    <br><br>

<%--    radio button for gender--%>
    what's your gender ?<br>
    Male<form:radiobutton path="gender" value="Male"/>
    Female<form:radiobutton path="gender" value="Female"/>
    <br><br>
<%--    checkbox for operating system--%>
    what's your favorite operating system : <br>
    <span style="color: orangered">Linux</span> <form:checkbox cssStyle="color: orangered" path="operatingSystem" value="Linux"/>
    <span style="color: #2f00ff">Mac os</span> <form:checkbox cssStyle="color: #2f00ff" path="operatingSystem" value="Mac os"/>
    <span style="color: #0f9d5e">Microsoft Windows</span> <form:checkbox cssStyle="color: #0f9d5e" path="operatingSystem" value="Microsoft Windows"/>
    <br><br>
    <input type="submit" value="submit">
</form:form>


</body>
</html>
