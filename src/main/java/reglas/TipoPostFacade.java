/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uesocc.edu.sv.ingenieria.prn335.progra3.TipoPost;

/**
 *
 * @author Castro
 */
@Stateless
public class TipoPostFacade extends AbstractFacade<TipoPost> implements TipoPostFacadeLocal {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoPostFacade() {
        super(TipoPost.class);
    }
    
}
