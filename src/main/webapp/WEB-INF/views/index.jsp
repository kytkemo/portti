<%@ page contentType='text/html' pageEncoding='UTF-8' %>
<%@ taglib prefix='c' uri='http://java.sun.com/jsp/jstl/core' %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset='UTF-8'>
        <title>Portti</title>
    </head>
    <body>

        <h1>Portti</h1>

        <ul>
            <li><a href='<c:url value="/spring_security_login" />'>Login</a></li>
            <li><a href='<c:url value="/j_spring_security_logout" />'>Logout</a></li>
        </ul>

        <p>OAuth 2.0 authorisation and resource provider.</p>

    </body>
</html>
