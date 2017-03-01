<%-- 
    Document   : login
    Created on : 26/02/2017, 09:11:46 PM
    Author     : JoseAlejandro
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Bienvenido</h1>
        <form action="LoginController" method="Post">
            Usuario: <input type="text" name="username" value="" /><br><br>
            Contraseña:<input type="password" name="password" value=""/><br><br>
            
            Nombres: <input type="text" name="nombres" value="" /><br><br>
            Apellidos:<input type="text" name="apellidos" value=""/><br><br>
            Email: <input type="text" name="email" value="" /><br><br>
            Ocupacion:<input type="text" name="ocupacion" value=""/><br><br>
            
            
            <input type="submit" value="Iniciar sesion"/>
            
     
        </form>
    </body>
</html>
