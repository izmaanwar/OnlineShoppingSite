<%-- 
    Document   : updatephone
    Created on : Jan 14, 2018, 10:35:31 PM
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
     var x = document.forms["myForm"]["qa"].value;
    if (x == "") {
        alert("quantiy must be filled out");
        return false;
    }
     var x = document.forms["myForm"]["pr"].value;
    if (x == "") {
        alert("price must be filled out");
        return false;
    }
}
</script>
    </head>
    <body>
           <div class="login-page">
         <div class="form">
           <form name ="myForm" action="/session/up.jsp" method="post">
            <input type="text" name="name"  placeholder="name"/>
           <input type="text" name="ty" placeholder="type"/>
           <input type="text"  name="qa" placeholder="quantity"/>
             <input type="text"  name="pr" placeholder="price"/>
                <button>ADD</button>
                 </form>
    </body>
</html>
