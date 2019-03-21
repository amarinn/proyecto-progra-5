/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Cliente;
import Model.ClienteDB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author Aaron Salas
 */
@Named(value = "beanCliente")
@SessionScoped
public class beanCliente implements Serializable {

    String nombre = "";
    String apellido1 = "";
    String apellido2 = "";
    String direccion = "";
    String telefono = "";
    String posDirEntrega = "";
    ClienteDB clienteDB = new ClienteDB();

    public beanCliente() {
    }

    public void inserta() {
        try {
            Cliente cli = new Cliente(nombre, apellido1, apellido2, direccion, telefono, posDirEntrega);
            clienteDB.mvRegitroCliente(cli);
        } catch (Exception ex) {

        }
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

    public ClienteDB getClienteDB() {
        return clienteDB;
    }

    public void setClienteDB(ClienteDB clienteDB) {
        this.clienteDB = clienteDB;
    }

}
