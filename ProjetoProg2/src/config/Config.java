package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Matheus Dino
 */
public class Config {
    
    Connection conec = null;
    
    public static Connection conectarBD(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conec = DriverManager.getConnection("jdbc:sqlite:bdRuralTicket.sqlite");
            System.out.println("Conexao bem sucedida.");
            return conec;
        }
        catch(Exception e){
            System.out.println("Falha ao conectar " + e);
            return null;
        }
    }
    
    public static void main(String[] args) {
        conectarBD();
    }
    
}
