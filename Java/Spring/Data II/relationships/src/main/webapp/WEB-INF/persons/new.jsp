<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- Para usar enlace de formularios -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New Person</title>
</head>
<body>
    <div>
        <div>
            <div>
                <div>
                    <h1>New Person</h1>
                </div>
                <div>
                    <div>
                        <form:form action="/persons/new" method="post" modelAttribute="person">
                            <div>
                                <div>
                                    <form:label path="firstName">First Name: </form:label>
                                </div>
                                <div>
                                    <form:input path="firstName"/>
                                </div>
                                <div>
                                    <p>
                                        <form:errors path="firstName"/>
                                    </p>
                                </div>
                            </div>
                            <div>
                                <div>
                                    <form:label path="lastName">Last Name: </form:label>
                                </div>
                                <div>
                                    <form:input path="lastName"/>
                                </div>
                                <div>
                                    <p>
                                        <form:errors path="lastName"/>
                                    </p>
                                </div>
                            </div>
                            <div>
                                <div>
                                    <input type="submit" value="Create">
                                </div>
                            </div>
                        </form:form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>