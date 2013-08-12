<%@ page contentType='text/html' pageEncoding='UTF-8' %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset='UTF-8'>
        <title>Portti</title>
    </head>
    <body>

        <h1>Portti</h1>

        <ul>
            <li><a href='${pageContext.request.contextPath}/spring_security_login'>Login</a></li>
            <li><a href='${pageContext.request.contextPath}/j_spring_security_logout'>Logout</a></li>
        </ul>

        <p>OAuth 2.0 authorisation and resource provider.</p>

    </body>
</html>
