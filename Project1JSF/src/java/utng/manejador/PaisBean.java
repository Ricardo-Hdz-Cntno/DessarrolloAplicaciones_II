/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.PaisDAO;
import utng.modelo.Pais;

/**
 *
 * @author Ricardo
 */
@ManagedBean
@SessionScoped
public class PaisBean implements Serializable{
    private List<Pais> paises;
    private Pais pais;
    public PaisBean() { }

    public List<Pais> getPaises() {
        return paises;
    }

    public void setPaises(List<Pais> paises) {
        this.paises = paises;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
    public String listar(){
        PaisDAO dao = new PaisDAO();
            try {
                paises=dao.getAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Paises";            
    }
    public String eliminar(){
        PaisDAO dao=new PaisDAO();
        try {
            dao.delete(pais);
            paises = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    public String iniciar(){
        pais=new Pais();
        return "Iniciar";
    }
    public String guardar(){
        PaisDAO dao = new PaisDAO();
        try {
            if (pais.getIdPais() != 0) {
                dao.update(pais);
            }else{
                dao.insert(pais);
            }
            paises = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Pais pais){
        this.pais = pais;
        return "Editar";
    }
    
}
