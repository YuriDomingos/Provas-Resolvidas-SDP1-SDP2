/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuridomingos
 * Data   : 17 - 12 - 2021
 * Objectivo : Construir 
 */
public class ConsultaModelo {
    
    private String nome_musico;
    private String descricao;
    private String data_musica;

    public ConsultaModelo() {
    }

    public ConsultaModelo(String nome_musico, String descricao, String data_musica) {
        this.nome_musico = nome_musico;
        this.descricao = descricao;
        this.data_musica = data_musica;
    }

    public String getNome_musico() {
        return nome_musico;
    }

    public void setNome_musico(String nome_musico) {
        this.nome_musico = nome_musico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData_musica() {
        return data_musica;
    }

    public void setData_musica(String data_musica) {
        this.data_musica = data_musica;
    }
    
   
}
