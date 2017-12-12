<%-- 
    Document   : index
    Created on : Dec 11, 2017, 6:10:58 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    FBConnection fbConnection = new FBConnection();
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="${fbConnection.getFBAuthUrl()}">
            <input type =" submit" value ="login "/>
        </form>
    </body>
</html>
