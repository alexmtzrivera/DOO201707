<%-- 
    Document   : success
    Created on : 26/02/2017, 09:12:14 PM
    Author     : JoseAlejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesion valido</title>
    </head>
    <body>
        <h1>Inicio de sesion valido </h1>
         <h2>Hola <%= request.getAttribute("username") %></h2>
         <h2>Email:<%= request.getAttribute("email") %></h2>
         <h2>Nombres:<%= request.getAttribute("nombres") %></h2>
         <h2>Apellidos: <%= request.getAttribute("apellidos") %></h2>
         <h2>Ocupacion:<%= request.getAttribute("ocupacion") %></h2>
    </body>
</html>
