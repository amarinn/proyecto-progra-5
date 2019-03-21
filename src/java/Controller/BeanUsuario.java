/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Usuario;
import Model.UsuarioDB;
import java.io.Serializable;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ana Marin
 */
@Named(value = "beanUsuario")
@SessionScoped
public class BeanUsuario implements Serializable {
    String usuarioIngresado;
    String password;
    String errorAutenticacion;

    public String getErrorAutenticacion() {
        return errorAutenticacion;
    }

    public void setErrorAutenticacion(String errorAutenticacion) {
        this.errorAutenticacion = errorAutenticacion;
    }
    Usuario usuario;
    UsuarioDB usuDB;
    
    Usuario Usuario1;
    
    
     /**
     * Creates a new instance of BeanUsuario
     */
    public BeanUsuario() {
        this.usuario = new Usuario();
        this.usuDB = new UsuarioDB();
    }
    
    public String getUsuarioIngresado() {
        return usuarioIngresado;
    }

    public void setUsuarioIngresado(String usuarioIngresado) {
        this.usuarioIngresado = usuarioIngresado;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public UsuarioDB getUsuDB() {
        return usuDB;
    }

    public void setUsuDB(UsuarioDB usuDB) {
        this.usuDB = usuDB;
    }

    public void autenticarUsuario() {
        try {
            Usuario1 = usuDB.autenticar(this.getUsuarioIngresado(), this.getPassword());
            

            if (Usuario1 != null && Usuario1.validarContrasena(this.getPassword())) {
                FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("Usuario", Usuario1);
               

                FacesContext.getCurrentInstance().getExternalContext().redirect("Principal.xhtml");

//                FacesContext.getCurrentInstance().getExternalContext().redirect("Pri.XHTML");
            } else{
                this.setErrorAutenticacion("Ingresa unas credenciales validas");
            }
        } catch (Exception e) {

        }

    }

   

}
