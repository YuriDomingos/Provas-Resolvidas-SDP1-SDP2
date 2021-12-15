/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import static  java.lang.Class.forName;

/**
 *
 * @author yuridomingos
 * Data  : 14 - 12 - 2021 
 * Objectivo : Realizar a ligacao coma base de dados 
 */
public class Conexao {
    
    private final static String driver = "org.postgresql.Driver";
    private final static String url = "jdbc:postgresql://localhost:5432/provadb";
    private static String user = "postgres";
    private static String password = "postgres";
    private static Connection conexao;
  
    
    public static Connection abrirConexao()
    {
           
       try
       {
           forName(driver);
           conexao = DriverManager.getConnection(url,user,password);
           return conexao;
       }
       catch(ClassNotFoundException ex)
       {
           System.out.println("Erro na driver de conexao ");
       }
       catch(SQLException ex)
       {
           System.out.println("Erro nos dados de acessos");
       }
       return null;
    }
    
    public static void fecharConexao() throws SQLException 
    {
        if ( conexao != null )
        {
            conexao.close();
        }
        
    }
    
    
    
}
