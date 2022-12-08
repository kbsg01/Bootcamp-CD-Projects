<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title><c:out value="${person.getFirstName()} ${person.getLastName()}"</title>
</head>
<body>
    <div>
        <div>
            <div>
                <div>
                    <h2>
                        <c:out value="${person.getFirstName()} ${person.getLastName()}"
                    </h2>
                </div>
                <div>
                    <div>
                        <h6>License Number: </h6>
                    </div>
                    <div>
                        <p>
                            <c:out value="${person.getLicense().getNumber()}" />
                        </p>
                    </div>
                </div>
                <div>
                    <div>
                        <h6>
                            State:
                        </h6>
                    </div>
                    <div>
                        <p>
                            <c:out value="${person.getLicense().getState()}" />
                        </p>
                    </div>
                </div>
                <div>
                    <div>
                        <h6>
                            Expiration Date:
                        </h6>
                    </div>
                    <div>
                        <p>
                            <c:out value="${person.getLicense().getExpirationDate()}"/>
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>