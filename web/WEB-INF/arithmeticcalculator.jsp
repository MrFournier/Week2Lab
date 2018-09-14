<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 14, 2018, 3:38:41 PM
    Author     : 766375
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="number" name="numerator" value="${numerator}"><br>
            Second: <input type="number" name="denominator" value="${denominator}"><br>
            <input type="submit" value="+" name="submit">
            <input type="submit" value="-" name="submit">
            <input type="submit" value="*" name="submit">
            <input type="submit" value="%" name="submit">
        </form>
        <div>
            Result: ${response}<br>
            <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
