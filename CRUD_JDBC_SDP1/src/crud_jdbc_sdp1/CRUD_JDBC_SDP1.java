/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud_jdbc_sdp1;

import dao.ProdutoDAO;
import java.util.Scanner;
import modelo.ProdutoModelo;
import utils.Conexao;

/**
 *
 * @author yuridomingos
 * Data   : 14 - 12 - 2021
 * Objectivo : Construir o CRUD mais gen]erico o poss]ivel 
 */
public class CRUD_JDBC_SDP1 {

   static ProdutoModelo novoProduto = new ProdutoModelo();
   static ProdutoDAO produto = new ProdutoDAO();
    
    public static void main(String[] args) {
        // TODO code application logic here
   
        
        
        
        
      if (produto.EliminarProduto(3))
      {
          System.out.println("Produto eliminado com sucesos ");
      }
      
       
      
    }
    
}
