<%-- 
    Document   : almacen
    Created on : 23-sep-2016, 10:48:49
    Author     : Ricardo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Almacen</title>
    </head>
    <body>
        <form action="AlmacenController" method="post">
            <fieldset>
                <legend>Registro de almacenes</legend>
                <div>
                    <label for="idalmacen">Id almacen:</label>
                    <input type="text" name="idalmacen"
                           value="${almacen.idalmacen}"
                           placeholder="Id de almacen"
                           readonly="readonly" />
                </div>
                <div>
                    <label for="nombre">Nombre:</label>
                    <input type="text" name="nombre"
                           value="${almacen.nombre}"
                           placeholder="Nombre del profesor"
                           />
                </div>
                <div>
                    <label for="direccion">Direccion:</label>
                    <input type="text" name="direccion"
                           value="${almacen.direccion}"
                           placeholder="Direccion de almacen"
                           />
                </div>
                <div>
                    <label for="telefono">Telefono:</label>
                    <input type="number" name="telefono"
                           value="${almacen.telefono}"
                           placeholder="Telefono de almacen"
                           />
                </div>
                
                <div>
                    <label for="pais">Pais:</label>
                    <input type="text" name="pais"
                           value="${almacen.pais}"
                           placeholder="Pais de almacen"
                           />
                </div>
                 <div>
                     <input type="submit" value="Guardar" />
                 </div>           
            </fieldset>
        </form>
    </body>
</html>
