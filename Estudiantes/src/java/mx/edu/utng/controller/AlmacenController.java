/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mx.edu.utng.dao.AlmacenDAO;
import mx.edu.utng.dao.AlmacenDAOImp;
import mx.edu.utng.model.Almacen;

/**
 *
 * @author Ricardo
 */
public class AlmacenController extends HttpServlet{
    private final String LISTA_ALMACENES = "/lista_almacenes.jsp";
    private final String AGREGAR_CAMBIAR = "/almacen.jsp";
    private AlmacenDAO dao;
    
    public AlmacenController(){
        dao = new AlmacenDAOImp();
    }
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String forward = "";
        String action = request.getParameter("action");
        if(action.equalsIgnoreCase("borrar")){
            forward = LISTA_ALMACENES;
            int idalmacen = Integer.parseInt(request.getParameter("idalmacen"));
            dao.borrarAlmacen(idalmacen);
            request.setAttribute("almacenes", dao.desplegarAlmacenes());
        }else if(action.equalsIgnoreCase("cambiar")){
            forward = AGREGAR_CAMBIAR;
            int idalmacen = Integer.parseInt(request.getParameter("idalmacen"));
            Almacen almacen = dao.elegirAlmacen(idalmacen);
            request.setAttribute("almacen", almacen);
        } else if(action.equalsIgnoreCase("agregar")){
            forward = AGREGAR_CAMBIAR;
        } else{
            forward = LISTA_ALMACENES;
            request.setAttribute("almacenes",
                    dao.desplegarAlmacenes());
        }
        
        RequestDispatcher view = 
                request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Almacen almacen = new Almacen();
        almacen.setNombre(request.getParameter("nombre"));
        almacen.setDireccion(request.getParameter("direccion"));
        almacen.setTelefono(Integer.parseInt(request.getParameter("telefono")));  
        String idalmacen = request.getParameter("idalmacen");
        
        if(idalmacen==null || idalmacen.isEmpty()){
            dao.agregarAlmacen(almacen);
        }else{
            almacen.setIdalmacen(Integer.parseInt(idalmacen));
            dao.cambiarAlmacen(almacen);
        }
        
        RequestDispatcher view = 
                request.getRequestDispatcher(LISTA_ALMACENES);
        request.setAttribute("almacenes", 
                dao.desplegarAlmacenes());
        view.forward(request, response);
    }      
    
}
