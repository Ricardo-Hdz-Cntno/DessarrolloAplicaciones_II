<%-- 
    Document   : lista_almacenes
    Created on : 23-sep-2016, 10:52:39
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de almacenes</title>
    </head>
    <body>
        <table>
            <thead>
                <tr>
                    <th>Id:</th>
                    <th>Nombre:</th>
                    <th>Direccion:</th>
                    <th>Telefono:</th>
                    <th>Pais:</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${almacenes}" var="almacen">
                    <tr>
                        <td>${alamacen.idalmacen}</td>
                        <td>${almacen.nombre}</td>
                        <td>${almacen.direccion}</td>
                        <td>${almacen.telefono}</td>
                        <td>${almacen.pais}</td>
                        <td>
                            <a href="AlmacenController?action=cambiar&idalmacen=${almacen.idalmacen}">Cambiar</a>
                        </td>
                        <td>
                            <a href="AlmacenController?action=borrar&idalmacen=${almacen.idalmacen}">Borrar</a>
                        </td>
                    
                    </tr>
                </c:forEach>
            </tbody>    
        </table>
        
        <p>
            <a href="AlmacenController?action=agregar">Agregar almacen</a>
        </p>
    </body>
</html>
