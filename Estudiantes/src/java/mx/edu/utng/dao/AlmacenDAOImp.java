/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.edu.utng.model.Almacen;
import mx.edu.utng.util.UtilDB;

/**
 *
 * @author Ricardo
 */
public class AlmacenDAOImp implements AlmacenDAO{
    private Connection connection;
    
    public AlmacenDAOImp(){
        connection=UtilDB.getConnection();
    }

    @Override
    public void agregarAlmacen(Almacen almacen) {
        String sql = "INSERT INTO almacenes "
                + " (nombre, direccion,telefono,pais) "
                + " VALUES(?, ?, ?, ?)";
        try{
        PreparedStatement ps = 
                connection.prepareStatement(sql);
        ps.setString(1,almacen.getNombre());
        ps.setString(2,almacen.getDireccion());
        ps.setInt(3,almacen.getTelefono());
        ps.setString(4,almacen.getPais());
        ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void borrarAlmacen(int idalmacen) {
        String sql="DELETE FROM almacenes WHERE id_almacen=?";
        try {
            PreparedStatement ps = 
                    connection.prepareStatement(sql);
            ps.setInt(1, idalmacen);
            ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void cambiarAlmacen(Almacen almacen) {
       String sql = "UPDATE almacenes SET"
                + " nombre=?, direccion=?,telefono=?,pais=? ";
        try{
        PreparedStatement ps = 
                connection.prepareStatement(sql);
        ps.setString(1,almacen.getNombre());
        ps.setString(2,almacen.getDireccion());
        ps.setInt(3,almacen.getTelefono());
        ps.setString(4,almacen.getPais());
        ps.executeUpdate();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public List<Almacen> desplegarAlmacenes() {
             List<Almacen> almacenes = new ArrayList<Almacen>();
        try{
            Statement s = connection.createStatement();
            ResultSet rs = s.executeQuery(
                    "SELECT * FROM almacenes");
            while (rs.next()) {                
                Almacen almacen = new Almacen(
                        rs.getInt("id_almacen"),
                        rs.getString("nombre"),
                        rs.getString("direccion"),
                        rs.getInt("telefono"),
                        rs.getString("pais"));
                almacenes.add(almacen);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return almacenes;
    }

    @Override
    public Almacen elegirAlmacen(int idalmacen) {
        Almacen almacen = null;
        try{
            PreparedStatement ps = 
                    connection.prepareStatement(
                            "SELECT * FROM almacenes"
                                    + " WHERE id_almacen=?");
            ps.setInt(1, idalmacen);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {                
                 almacen = new Almacen(
                         rs.getInt("id_almacen"),
                        rs.getString("nombre"),
                         rs.getString("direccion"),
                        rs.getInt("telefono"),
                          rs.getString("pais"));
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return almacen;
    }
}
