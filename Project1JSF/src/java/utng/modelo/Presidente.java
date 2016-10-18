/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ricardo
 */
@Entity @Table(name="presidente")
public class Presidente implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id_presidente")
    private Long idPresidente;
    @Column(name = "nombre", length = 20)
    private String nombre;
    @Column(name = "apellido_paterno", length = 20)
    private String apellidoP;
    @Column(name = "apellido_materno", length = 20)
    private String apellidoM;
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="id_pais")
    private Pais pais;

    public Presidente(Long idPresidente, String nombre, String apellidoP, String apellidoM, Pais pais) {
        super();
        this.idPresidente = idPresidente;
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.pais = pais;
    }

    public Presidente() {
        this.idPresidente = 0L;
    }

    public Long getIdPresidente() {
        return idPresidente;
    }

    public void setIdPresidente(Long idPresidente) {
        this.idPresidente = idPresidente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    
    

}
