<%-- 
    Document   : dw
    Created on : Jan 15, 2018, 12:18:00 AM
    Author     : aa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="db.*" %> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
             <%  
String name=request.getParameter("name");  
String ty=request.getParameter("ty"); 

dbhandle db = new dbhandle();
if(db.deleteRecordw(name,ty))
{
    out.print("record has been inserted"); 
}

%> 
    </body>
</html>
