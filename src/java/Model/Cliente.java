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
public class Cliente {
    String nombre = "";
    String apellido1 = "";
    String apellido2 = "";
    String direccion = "";
    String telefono = "";
    String posDirEntrega = "";

    public Cliente(String nombrep, String appelli1p, String apellid2p, String direccionp, String telefonop, String posDirEntregap) {
        this.nombre=nombrep;
        this.apellido1=appelli1p;
        this.apellido2=apellid2p;
        this.direccion=direccionp;
        this.telefono=telefonop;
        this.posDirEntrega=posDirEntregap;
    }

     public Cliente(){
         
     }
     
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPosDirEntrega() {
        return posDirEntrega;
    }

    public void setPosDirEntrega(String posDirEntrega) {
        this.posDirEntrega = posDirEntrega;
    }

}
