/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sv.edu.uesocc.ingenieria.prn335_2017.web.controladores;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import org.primefaces.event.SelectEvent;
import org.primefaces.event.UnselectEvent;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.BeansFacadeLocal;
import sv.edu.uesocc.ingenieria.prn335_2017.datos.acceso.MetaFacadeLocal;
import sv.edu.uesocc.edu.sv.ingenieria.prn335_2017.datos.definiciones.Meta;



/**
 *
 * @author Castro
 */
@Named (value="MetaBean")
@ViewScoped
public class MetaBean extends ManagedBeanGenerico<Meta> implements Serializable{

    public MetaBean() {
    }   
    boolean visible=true;
    @EJB
     MetaFacadeLocal meta;
     Meta nuevo = new Meta();
     

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
    
    public MetaFacadeLocal getTipoSeccion() {
        return meta;
    }

    public Meta getNuevo() {
        return nuevo;
    }

    public void setNuevo(Meta nuevo) {
        this.nuevo = nuevo;
    }

    public void setTipoSeccion(MetaFacadeLocal meta) {
        this.meta = meta;
    }
 
    public void showMessage(String Mensaje) {
        
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(Mensaje));
    }

   
    
    @PostConstruct
    public void rellenar(){
        llenar();
    }
    public void limpiar(){
        nuevo.setActivo(false);
        nuevo.setDescripcion(null);
        nuevo.setNombre(null);
    }
    
    
    
    
    public void cancelar(){
        nuevo=new Meta();
        visible=true;
    }
      public void onRowSelect(SelectEvent event) {
          meta.edit(nuevo);
          visible=false;
    }
      public void onRowUnselect(UnselectEvent event) {
          
        visible=true;
          limpiar();
    }

    @Override
    public BeansFacadeLocal<Meta> getfacadelocal() {
        return  meta;
    }

    @Override
    public Meta getEntity() {
        return this.nuevo;
    }

}
