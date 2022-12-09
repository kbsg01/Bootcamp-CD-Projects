<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
    <!-- Bootstrap -->
    <title>New Student</title>
</head>
<body>
    <h1>New Student</h1>
    <from:form action="/students/new" method="post" modelAttribute="student">
        <p>
            <from:label path="firstName">First Name</from:label>
            <form:input path="firstName"/>
            <from:errors path="firstName"/>
        </p>

        <p>
            <form:label path="lastName">Last Name</form:label>
            <form:input path="lastName"/>
            <form:errors path="lastName"/>
        </p>

        <p>
            <form:label path="age">Age</form:label>
            <form:input path="age"/>
            <form:errors path="age"/>
        </p>

        <input type="submit" value="Create">
    </from:form>
</body>
</html>