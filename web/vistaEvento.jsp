<%-- 
    Document   : vistaEvento
    Created on : May 3, 2018, 2:10:30 AM
    Author     : manuel
--%>
<%@page import="modelos.com.ipn.mx.modelo.Evento" %>

<%@page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vista Eventos</title>
    </head>
    <body>
        <form method="POST" action="EventoServlet" enctype="multiport/form-data">
            <table>
                <tr>
                    <th>Nombre Evento</th>
                    <td>
                        <input type="text" name="nombreEvento" placeholder="nombre del Evento" required="required"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="number" name="duracionEvento" placeholder="nombre del Evento" required="required"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="file" name="fotoEvento"/>
                    </td>
                </tr>
                <tr>
                    <td>
                        <input type="submit" value="enviar" name="btnEnviar"/>
                    </td>
                </tr>
            </table>          
        </form>
    </body>
</html>

