<%-- 
    Document   : Activities
    Created on : Dec 22, 2017, 3:06:10 PM
    Author     : HP
--%>

<%@page import="com.fb.api.Constants"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% Constants obj = new Constants(); %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
          <form action="<%=request.getContextPath()%>/myServlet" method="get">
           Enter the text to post <input type="text" name ="StrPost" />  <br/>
            <input type="submit" name="btnPost" value="Post to your page"/> <br/>
            <input type="submit" name="btnGetMsg" value="Get messages"/> <br/>
            
            
            <input type="submit" name="btnGetCmt" value="Get Comments"/><br/>
            
        </form>
        <form action="<%=request.getContextPath()%>/index" method="post">
               Enter the message to be sent <input type="text" name="StrMsg"/><br/>
               <input type="submit" name="btnSendMsg" value="Send Message"/><br/>
           </form>
               
        <p><%= session.getAttribute("res") %>
            
            Access token Long :<%= session.getAttribute("accessToken_long") %> <br/>
            Access token : <%= session.getAttribute("accessToken") %> <br/>
            <%= request.getParameter("outputString") %>
        </p>
    </body>
</html>
