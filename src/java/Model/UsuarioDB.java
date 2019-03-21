/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import DAO.AccesoDatos;
import DAO.SNMPExceptions;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Ana Marin
 */
public class UsuarioDB {

    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

     public UsuarioDB() {
        super();
    }

    public UsuarioDB(Connection conn) {
        accesoDatos = new AccesoDatos();
        accesoDatos.setDbConn(conn);
    }

    public Usuario autenticar(String correo, String password ) throws SNMPExceptions {
        Usuario us=null;
        String select = "";
        try {

            //Se instancia la clase de acceso a datos
            AccesoDatos accesoDatos = new AccesoDatos();

            //Se crea la sentencia de búsqueda
            select
                    = "SELECT * FROM Usuario where correo='" + correo+"'"; 
                    
            //Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(select);
            //Se llena el arryaList con los proyectos   
            while (rsPA.next()) {

                
                 us = new Usuario(
                rsPA.getInt("Id"),
                        rsPA.getString("Nombre"),
                        rsPA.getString("Direccion"),
                        rsPA.getString("Correo"),
                        rsPA.getString("Contrasena"),
                        rsPA.getString("Roll"),
                       // rsPA.getString("Estado"),
                        true
                        
                );
                rsPA.close();
                return us;
            }
            rsPA.close();

        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage());
        } finally {

        }
        return us;
        

    }
}

   

