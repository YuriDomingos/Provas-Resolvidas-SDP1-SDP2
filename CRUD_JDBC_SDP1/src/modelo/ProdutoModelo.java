/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Yuridomingos
 * Data   : 14 - 12 - 2021
 * Objectivo : Construir a classe modelo do produto 
 */
public class ProdutoModelo 
{
    
    private int id_produto;
    private String descricao;
    private String preco;

    public ProdutoModelo() {
    }

    public ProdutoModelo(int id_produto, String descricao, String preco) {
        this.id_produto = id_produto;
        this.descricao = descricao;
        this.preco = preco;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }
     
    
    

    
    
}
