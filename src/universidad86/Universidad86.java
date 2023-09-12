/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad86;

import java.sql.Connection;
import universidad86.AccesoADatos.Conexion;

/**
 *
 * @author dea
 */
public class Universidad86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connection con=Conexion.getConexion();
    }
    
}
