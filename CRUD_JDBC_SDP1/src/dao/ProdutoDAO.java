/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.ProdutoModelo;
import utils.Conexao;

/**
 *
 * @author : Yuri Domingos
 * Data    : 14 - 12 - 2021
 * Objectivo : Implementar um CRUD básico para servir de base do 
 */
public class ProdutoDAO 
{
   PreparedStatement ps = null;
   Connection con;
   
    public boolean cadastrarProdutos(ProdutoModelo produtoModelo)
    {
        String query = "INSERT INTO produtos VALUES (?,?,?);";
        
        try
        {
            con = Conexao.abrirConexao();
            ps = con.prepareStatement(query);
            ps.setInt(1, produtoModelo.getId_produto());
            ps.setString(2, produtoModelo.getDescricao());
            ps.setString(3, produtoModelo.getPreco());
            ps.execute();
            System.out.println(" Produto cadastrado com suceso ");
            
            
        }
        catch (SQLException ex )
        {
           ex.printStackTrace();
        }
        return false;
    }
    
    public boolean EliminarProduto(int idProduto)
    {
        String query = "DELETE FROM produtos WHERE id_produto = ?";
        
        try
        {
            con = Conexao.abrirConexao();
            ps = con.prepareStatement(query);
            ps.setInt(1, idProduto);
            ps.executeUpdate();
        }
        catch(SQLException ex) 
        {
           ex.printStackTrace();
        }
        return false;
    }
    
    
}
