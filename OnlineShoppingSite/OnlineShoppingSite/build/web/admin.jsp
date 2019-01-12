<%-- 
    Document   : admin
    Created on : Jan 14, 2018, 11:49:57 AM
    Author     : aa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <% String name=(String)session.getAttribute("name");  
        out.print("<h2 style= text-align:center;color:blue>welcome admin</h2>");
        out.print("<h3 style= text-align:center;color:blue>perfome the action which you want to perfome</h3>");
        %>
        <div class="login-page">
 
           <div class="form">
        <form action="/session/additems.jsp">
           <input type="submit" value="addNewItems">
        </form>
         <form action="/session/removeitems.jsp">
           <input type="submit" value="removeItems">
        </form>
          <form action="/session/updateitems.jsp">
           <input type="submit" value="updateItems">
        </form>
    </body>
</html>
