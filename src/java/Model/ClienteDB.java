/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

<<<<<<< HEAD
/**
 *
 * @author Ana Marin
 */
public class ClienteDB {
    
}
=======
import DAO.AccesoDatos;
import DAO.SNMPExceptions;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author Aaron Salas
 */
public class ClienteDB {
    private AccesoDatos accesoDatos = new AccesoDatos();
    private Connection conn;

    private LinkedList<Cliente> listaP
            = new LinkedList<Cliente>();
    
    public ClienteDB(Connection con){
        accesoDatos = new AccesoDatos();    
        accesoDatos.setDbConn(con);
    }

    public ClienteDB() {
        super();
    }
    
    public void mvRegitroCliente(Cliente pvoCliente) throws SNMPExceptions, SQLException {
        String strSQL = "";
        try {
//Se obtienen los valores del objeto Departamento
            Cliente clien = new Cliente();
            clien = pvoCliente;
            strSQL = "INSERT INTO CLIENTE (Nombre, Apellido1, Apellido2, Direccion, Telefono, PosDirEntrega,HorarioEntrega) VALUES ('" + clien.getNombre() + "'," + clien.getApellido1() + "," + clien.getApellido2() + "," + clien.getDireccion() + "," + clien.getTelefono() + "," + clien.getPosDirEntrega() + ",gettime()" + ")";
//Se ejecuta la sentencia SQL
            ResultSet rsPA = accesoDatos.ejecutaSQLRetornaRS(strSQL);
           
        } catch (SQLException e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage(), e.getErrorCode());
        } catch (Exception e) {
            throw new SNMPExceptions(SNMPExceptions.SQL_EXCEPTION,
                    e.getMessage());
        } finally {
        }
    }

}


>>>>>>> aaron-segundoavance
