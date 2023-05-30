<%--
  Created by IntelliJ IDEA.
  User: max
  Date: 24.05.2023
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
    <form action="students" method="GET">
        <label for="name">Name:</label>
        <input id="name" type="text" name="name">
        <label for="surname">Surname:</label>
        <input id="surname" type="text" name="surname">
        <label for="middlename">MiddleName:</label>
        <input id="middlename" type="text" name="middlename">
        <label for="exam">Exam:</label>
        <input id="exam" type="text" name="exam">
        <label for="result">Result:</label>
        <input id="result" type="text" name="result">
        <input type="submit" value="Save">
    </form>
</body>
</html>
