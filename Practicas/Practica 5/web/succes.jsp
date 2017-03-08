<%-- 
    Document   : succes
    Created on : 7/03/2017, 09:26:13 AM
    Author     : JoseAlejandro
--%>


<%
    if (session.getAttribute("usuario")==null)
        response.sendRedirect("login.jsp");
    %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de sesion Correcta</title>
    </head>
    <body>
        <h1>Inicio de sesion extiso</h1>
         <h2>Hola <%= session.getAttribute("usuario") %></h2>
         <h2>Email: <%= session.getAttribute("email") %></h2>
         <h2>Nombre:  <%= session.getAttribute("nombre") %></h2>
         <h2>Apellidos:  <%= session.getAttribute("apellido") %></h2>
         <h2>Ocupacion:  <%= session.getAttribute("ocupacion") %></h2>
         
    </body>
</html>
