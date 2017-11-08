/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import uesocc.edu.sv.ingenieria.prn335.progra3.TipoPostSeccion;

/**
 *
 * @author Castro
 */
@Stateless
public class TipoPostSeccionFacade extends AbstractFacade<TipoPostSeccion> implements TipoPostSeccionFacadeLocal {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoPostSeccionFacade() {
        super(TipoPostSeccion.class);
    }
    
}
