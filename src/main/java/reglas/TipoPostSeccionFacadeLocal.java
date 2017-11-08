/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.ingenieria.prn335.progra3.TipoPostSeccion;

/**
 *
 * @author Castro
 */
@Local
public interface TipoPostSeccionFacadeLocal {

    void create(TipoPostSeccion tipoPostSeccion);

    void edit(TipoPostSeccion tipoPostSeccion);

    void remove(TipoPostSeccion tipoPostSeccion);

    TipoPostSeccion find(Object id);

    List<TipoPostSeccion> findAll();

    List<TipoPostSeccion> findRange(int[] range);

    int count();
    
}
