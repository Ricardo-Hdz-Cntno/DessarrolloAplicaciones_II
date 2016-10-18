/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;


import org.hibernate.HibernateException;
import utng.modelo.Presidente;

/**
 *
 * @author Ricardo
 */
public class PresidenteDAO extends DAO<Presidente>{
    
    public PresidenteDAO() {
        super(new Presidente());
    }
    
    protected Presidente getOneById(Presidente presidente)
            throws HibernateException {
        return super.getOneById(presidente.getIdPresidente());
    }
    
    
}
