/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Aaron Salas
 */
public class Pedido {
    String nombreProducto="";
    int CantProducto = 0;
    String Direccion = "";
    
     public Pedido() {
    }
     
    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantProducto() {
        return CantProducto;
    }

    public void setCantProducto(int CantProducto) {
        this.CantProducto = CantProducto;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

   
}
