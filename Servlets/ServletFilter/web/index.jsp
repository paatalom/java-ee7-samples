<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello Servlet World!</h1>
        <a href="${pageContext.request.contextPath}/MyServletFilter"> Clieck To Invoke Servlet </a><br>
        <a href="${pageContext.request.contextPath}/filtered/MyServletFilter"> Clieck To Invoke Servlet (With Filter)</a>
    </body>
</html>
