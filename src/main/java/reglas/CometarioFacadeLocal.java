/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.ingenieria.prn335.progra3.Cometario;

/**
 *
 * @author Castro
 */
@Local
public interface CometarioFacadeLocal {

    void create(Cometario cometario);

    void edit(Cometario cometario);

    void remove(Cometario cometario);

    Cometario find(Object id);

    List<Cometario> findAll();

    List<Cometario> findRange(int[] range);

    int count();
    
}
