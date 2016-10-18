/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;


import org.hibernate.HibernateException;
import utng.modelo.Pais;

/**
 *
 * @author Ricardo
 */
public class PaisDAO extends DAO<Pais>{
    
    public PaisDAO() {
        super(new Pais());
    }
    
    protected Pais getOneById(Pais pais) 
            throws HibernateException {
        return super.getOneById(pais.getIdPais());
    }
    
    
    
}
