<%-- 
    Document   : logout
    Created on : Apr 22, 2015, 10:29:49 PM
    Author     : Aashu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logout Page</title>
    </head>
    <body>
         <%
            session.setAttribute("login_id",null);
            response.sendRedirect("index.jsp");
        %>
    </body>
</html>
