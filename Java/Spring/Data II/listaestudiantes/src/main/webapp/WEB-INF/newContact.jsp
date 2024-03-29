<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
    <title>New Contact</title>
</head>
<body>
    <h1>New Contact Info</h1>
    <form:form action="/contact/new" method="post" modelAttribute="contact">
        <p>
            <form:label path="student">Student: </form:label>
            <form:select path="student">
                <c:forEach items="${students}" var="student">
                    <form:option value="${student.id}" label="${student.getFirstName()} ${student.getLastName()}"/>
                </c:forEach>
            </form:select>
        </p>
        <p>
            <form:label path="address">Address: </form:label>
            <form:errors path="address"/>
            <form:input path="address"/>
        </p>
        <p>
            <form:label path="city">City: </form:label>
            <form:errors path="city"/>
            <form:input path="city"/>
        </p>

        <p>
            <form:label path="state">State: </form:label>
            <form:errors path="state"/>
            <form:input path="state"/>
        </p>

        <input type="submit" value="Create">
    </form:form>
</body>
</html>