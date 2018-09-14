<%-- 
    Document   : agecalculator
    Created on : Sep 14, 2018, 3:13:19 PM
    Author     : 766375
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="number" name="age" ><br>
            <input type="submit" value="Age Next Birthday">
        </form>
        <div>
            ${result}<br>
            ${message}
        </div>
        <div>
            <a href="arithmetic">Arithmetic Calculator</a>
        </div>
    </body>
</html>