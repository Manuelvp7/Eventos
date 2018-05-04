<%-- 
    Document   : vistaEvento
    Created on : May 3, 2018, 2:10:30 AM
    Author     : manuel
--%>
<%@page import="modelos.com.ipn.mx.DAO.EventoDAOImpl" %>
<%@page import="modelos.com.ipn.mx.modelo.Evento" %>
<%@page import="modelos.com.ipn.mx.modelo.EventoKey" %>
<%@page import="java.util.*" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Vista Eventos</title>
    </head>
    <body>
        <form name ="formEvento" method="POST" action="ServletEvento">
            idEvento<input type="text" name="txtIdEvento"></br>
            Nombre del evento<input type="text" name="txtNombreEvento"></br>
            Fecha del evento<input type="text" name="txtFechaEvento"></br>
            Duracion del evento<input type="text" name="txtDuracionEvento"></br>
            <input type="submit" name="btnInsertar" value="Insertar">
            <input type="submit" name="btnModificar" value="Modificar">
            <input type="submit" name="btnEliminar" value="Eliminar">
        </form>
    </body>
</html>

