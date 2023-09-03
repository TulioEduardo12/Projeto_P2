package config;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Matheus Dino
 */
public interface Config { //pegamos o código padrão da internet para conectar ao SQLite
    
    Connection conec = null;
    
    public static Connection conectarBD(){ // metodo estático para conectar ao banco de dados. 
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
