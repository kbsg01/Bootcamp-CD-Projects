<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

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
    <title>Students</title>
</head>
<body>
    <nav class="navbar bg-light">
        <div class="container-fluid">
            <a class="navbar-brand fw-bold">All Students</a>
            <a href="/students/new">Add Student</a>
            <a href="/contact/new">Add Contact Info</a>
        </div>
    </nav>

    <table class="table table-striped table-hover mt-2">
        <thead>
            <tr>
                <th>Name</th>
                <th>Age</th>
                <th>Address</th>
                <th>City</th>
                <th>State</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td><c:out value="${student.getFirstName()} ${student.getLastName()}"/></td>
                    <td><c:out value="${student.getAge()}"/></td>
                    <td><c:out value="${student.contact.getAddress()}"/></td>
                    <td><c:out value="${student.contact.getCity()}"/></td>
                    <td><c:out value="${student.contact.getState()}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>