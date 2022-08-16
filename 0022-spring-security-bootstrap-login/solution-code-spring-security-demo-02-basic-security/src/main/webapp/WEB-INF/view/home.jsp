<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<html>

<head>
    <title>luv2code Company Home Page</title>
</head>


<h2>luv2code Company Home Page</h2>
<hr>

Welcome to the luv2code company home page!
<hr>
user : <sec:authentication property="principal.username"/>
role(s) : <sec:authentication property="principal.authorities"/>
<hr>
<p>
    <a href="${pageContext.request.contextPath}/leaders">Manager Page</a> (only for manager) <br>
    <a href="${pageContext.request.contextPath}/admin">Admin Page</a> (only for admin)
</p>

<hr>
<form:form method="POST" action="${pageContext.request.contextPath}/logout">
    <input type="submit" value="Logout">
</form:form>
</body>

</html>