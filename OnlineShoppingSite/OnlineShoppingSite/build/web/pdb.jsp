<%-- 
    Document   : pdb
    Created on : Jan 14, 2018, 9:34:40 PM
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
String qa=request.getParameter("qa");  
String pr =request.getParameter("pr"); 
dbhandle db = new dbhandle();
if(db.insertRecordp(name,ty,qa,pr))
{
    out.print("record has been inserted"); 
}

%> 
    </body>
</html>
