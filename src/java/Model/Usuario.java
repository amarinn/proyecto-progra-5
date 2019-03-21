/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ana Marin
 */
public class Usuario {
 //atributos
    private int Id;
    private String Nombre;
    private String Direccion;
    private String Correo;
    private String Contrasena;
    private String Rol;
    private boolean estado;
    
    //constructor
    //sin parametros
    public Usuario() {
    }
    
    //constructor 
    //con parametros

    public Usuario(int Id, String Nombre, String Direccion, String Correo, String Contrasena, String Rol, boolean estado) {
        this.Id = Id;
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Contrasena = Contrasena;
        this.Rol = Rol;
        this.estado = estado;
    }

    //set y get
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public boolean isEstado() {
        return estado;
    }
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }
    
    public boolean validarContrasena(String password){
        return this.Contrasena.equals(password);
    }
    



}
