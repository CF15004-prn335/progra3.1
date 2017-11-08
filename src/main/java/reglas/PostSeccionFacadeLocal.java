/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.ingenieria.prn335.progra3.PostSeccion;

/**
 *
 * @author Castro
 */
@Local
public interface PostSeccionFacadeLocal {

    void create(PostSeccion postSeccion);

    void edit(PostSeccion postSeccion);

    void remove(PostSeccion postSeccion);

    PostSeccion find(Object id);

    List<PostSeccion> findAll();

    List<PostSeccion> findRange(int[] range);

    int count();
    
}
