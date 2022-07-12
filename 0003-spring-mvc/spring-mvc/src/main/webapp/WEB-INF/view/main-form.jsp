<%--
  Created by IntelliJ IDEA.
  User: a.nemat
  Date: 7/12/2022
  Time: 9:44 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css" integrity="sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn" crossorigin="anonymous">
    <style>
        .container{
            margin: 20% 20%;
            padding: 5% 5%;
            background-color: #9cd4e0;
            border-radius: 4%;

        }
        body{
            background-color: #e4e6a3;
        }

        /*esize: vertical !* Allow the user to vertically resize the textarea (not horizontally) *!*/
        /*}*/

        /*!* Style the submit button with a specific background color etc *!*/
        /*input[type=submit] {*/
        /*    background-color: #04AA6D;*/
        /*    color: white;*/
        /*    padding: 12px 20px;*/
        /*    border: none;*/
        /*    border-radius: 4px;*/
        /*    cursor: pointer;*/
        /*}*/

        /*!* When moving the mouse over the submit button, add a darker green color *!*/
        /*input[type=submit]:hover {*/
        /*    background-color: #45a049;*/
        /*}*/

        /*!* Add a background color and some padding around the form *!*/
        /*.container {*/
        /*    border-radius: 5px;*/
        /*    background-color: #f2f2f2;*/
        /*    padding: 20px;*/
        /*}*/
    </style>
</head>
<body>

<div class="container">
    <form action="processForm" method="get">
        <div class="form-group">
            <label for="exampleForFirstName">First name</label>
            <input type="text" name="firstName" class="form-control" id="exampleForFirstName" placeholder="Enter your firstname">
        </div>
        <div class="form-group">
            <label for="exampleInputPassword">Last name</label>
            <input type="text" name="lastName" class="form-control" id="exampleInputPassword" placeholder="Enter your Lastname">
        </div>
        <div class="form-group">
            <label for="exampleCountry">country</label>
            <input type="text" name="country" class="form-control" id="exampleCountry" placeholder="Enter your country name">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
<%--    <form action="action_page.php">--%>

<%--        <label for="fname">First Name</label>--%>
<%--        <input type="text" id="fname" name="firstname" placeholder="Your name..">--%>

<%--        <label for="lname">Last Name</label>--%>
<%--        <input type="text" id="lname" name="lastname" placeholder="Your last name..">--%>

<%--        <label for="country">Country</label>--%>
<%--        <select id="country" name="country">--%>
<%--            <option value="australia">Australia</option>--%>
<%--            <option value="canada">Canada</option>--%>
<%--            <option value="usa">USA</option>--%>
<%--        </select>--%>

<%--        <input type="submit" value="Submit">--%>

<%--    </form>--%>
</div>

</body>
</html>
