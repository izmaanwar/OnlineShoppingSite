<%-- 
    Document   : deleteDailyuses
    Created on : Jan 15, 2018, 12:01:23 AM
    Author     : aa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
           <link rel="stylesheet" href="css/style.css">
        <script>

function validate() { 
 
	 var x = document.forms["myForm"]["name"].value;
    if (x == "") {
        alert("Name must be filled out");
        return false;
    }
 var x = document.forms["myForm"]["ty"].value;
    if (x == "") {
        alert("type must be filled out");
        return false;
    }
    
}
</script>
    </head>
    <body>
                 <div class="login-page">
         <div class="form">
           <form name ="myForm" action="/session/dd.jsp" method="post">
            <input type="text" name="name"  placeholder="name"/>
           <input type="text" name="ty" placeholder="type"/>
           <button>ADD</button>
                 </form>
    </body>
</html>
