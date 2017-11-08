/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import java.util.List;
import javax.ejb.Local;
import uesocc.edu.sv.ingenieria.prn335.progra3.UsuarioRolCategoria;

/**
 *
 * @author Castro
 */
@Local
public interface UsuarioRolCategoriaFacadeLocal {

    void create(UsuarioRolCategoria usuarioRolCategoria);

    void edit(UsuarioRolCategoria usuarioRolCategoria);

    void remove(UsuarioRolCategoria usuarioRolCategoria);

    UsuarioRolCategoria find(Object id);

    List<UsuarioRolCategoria> findAll();

    List<UsuarioRolCategoria> findRange(int[] range);

    int count();
    
}
