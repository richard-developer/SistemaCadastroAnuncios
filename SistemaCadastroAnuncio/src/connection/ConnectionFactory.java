/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ricardo
 */
public class ConnectionFactory {
    
    // Criando o Driver de Conexão com MySQL:
    private static final String DRIVER = "com.mysql.jdbc.Driver";    
    private static final String URL = "jdbc:mysql://localhost:3306/db_cad_anuncio"; 
    // Usuário e Senha do Banco de Dados:
    private static final String USER = "root";
    private static final String PASS = "";
    
    // Classe Pública de Conexão com o Banco de Dados:
    public static Connection getConnection(){
        
        try {
            // Chama a classe do DRIVER:
            Class.forName(DRIVER);
            
            return (Connection) DriverManager.getConnection(URL, USER, PASS);
            
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Falha na conexão com o Banco: "+ ex);
        }
        
    }
    
    public static void closeConnection(Connection con){
        
        // Verifica se a conexão está aberta:
        
            try {
                if (con != null){
                con.close();
            } 
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
       public static void closeConnection(Connection con, PreparedStatement stmt){
        
           closeConnection(con);
        
            try {
                if (stmt != null){
                stmt.close();
            } 
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
       
          public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
           closeConnection(con, stmt);
        
            try {
                if (rs != null){
                rs.close();
            } 
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
    

