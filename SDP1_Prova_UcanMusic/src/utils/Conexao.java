/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;


import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author : Yuri Domingos
 * Data    : 17 - 12 - 2021
 * Objectivo : Construir a class conexao 
 */
public class Conexao {
    
    private static final String driver ="org.postgresql.Driver";
    private static final String url = "jdbc:postgresql://localhost:5432/ucanmusicdb";
    private static String user = "postgres";
    private static String password = "postgres"; 
    private static Connection conexao;
    
    
    public static Connection abrirConexao()
    {
        try
        {
            forName(driver);
            conexao = DriverManager.getConnection(url, user,password);
            return conexao;
            
        }
        catch(ClassNotFoundException ex)
        {
            ex.printStackTrace();
        }
        catch(SQLException ex)
        {
            System.out.println("Errp nos dados de acessos ");
        }
        
        return null;
    }
    
    public static void fecharConexao() throws SQLException
    {
        try 
        {
             if ( conexao != null)
              {
                 conexao.close();
               System.out.println("Conexao fechada com sucesso ");
              }
             
             
         }
        catch(SQLException ex )
        {
            ex.printStackTrace();
        }
            
     
    }
}
