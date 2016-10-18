/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Ricardo
 */
@Entity @Table(name="pais")
public class Pais implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_pais")
    private Long idPais;
    @Column(name="nombre",length = 30)
    private String nombre;
    @Column(name="capital",length = 30)
    private String capital;
    @Column(name="lenguaje", length=20)
    private String lenguaje;

    public Pais(Long idPais, String nombre, String capital, String lenguaje) {
        super();
        this.idPais = idPais;
        this.nombre = nombre;
        this.capital = capital;
        this.lenguaje = lenguaje;
    }

    public Pais() {
        this(0L,"","","");
    } 

    public Long getIdPais() {
        return idPais;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(String lenguaje) {
        this.lenguaje = lenguaje;
    }
    
    
    
}
