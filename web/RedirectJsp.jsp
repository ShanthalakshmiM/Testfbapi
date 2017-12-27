<%-- 
    Document   : RedirectJsp
    Created on : Dec 19, 2017, 10:43:10 AM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
                Object id = request.getAttribute("conv");
                Object cmnts = request.getAttribute("cmnts");
                Object msg_id = request.getAttribute("result");
                Object check = request.getAttribute("check");
        %>
            
      <p> <%= id %> </p> <br/> 
        <p> <%= cmnts %> </p>
        <p> Message Details : <%= msg_id %> </p> <br/>
        <p>
            <%= check%>
        </p>
    </body>
</html>
