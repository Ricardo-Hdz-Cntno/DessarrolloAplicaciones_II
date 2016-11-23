/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.utng.model;

/**
 *
 * @author Ricardo
 */
public class Almacen {
     private int idalmacen;
    private String nombre;
    private String direccion;
    private int telefono;
    private String pais;

    public Almacen(int idalmacen, String nombre, String direccion, int telefono, String pais) {
        this.idalmacen = idalmacen;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.pais = pais;
    }
    
    public Almacen(){
        this(0,"", "",0,"");
    }

    public int getIdalmacen() {
        return idalmacen;
    }

    public void setIdalmacen(int idalmacen) {
        this.idalmacen = idalmacen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Almacen{"+"idAlmacen"+idalmacen+",nombre="+nombre+", direccion="+direccion+", telefono="+telefono+", pais="+pais+'}';
    }
    
    
    
}
