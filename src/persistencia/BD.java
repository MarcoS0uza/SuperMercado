
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {
    private static final String URL_BD = "jdbc:mysql://localhost/supermercado";
    private static final String USER = "root";
    private static final String SENHA = "marco";
    public static Connection conexão = null;
    public static Statement comando = null;
    
    
    public static void iniciarConexãoComando(){
        try {
            conexão = DriverManager.getConnection(URL_BD, USER, SENHA);
            comando = conexão.createStatement();   
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void fecharComandoConexão(){
        try {
            comando.close();
            conexão.close();
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }


    }






