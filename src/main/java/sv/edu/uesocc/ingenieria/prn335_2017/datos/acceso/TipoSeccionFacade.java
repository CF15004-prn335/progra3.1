/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import sv.edu.uesocc.edu.sv.ingenieria.prn335_2017.datos.definiciones.TipoSeccion;

/**
 *
 * @author Castro
 */
@Stateless
public class TipoSeccionFacade extends AbstractFacade<TipoSeccion> implements TipoSeccionFacadeLocal {

    @PersistenceContext(unitName = "pu")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public TipoSeccionFacade() {
        super(TipoSeccion.class);
    }
    
}
