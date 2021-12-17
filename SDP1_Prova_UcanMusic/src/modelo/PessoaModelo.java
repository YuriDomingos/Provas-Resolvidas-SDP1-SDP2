/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author : yuridomingos
 * Data    : 17 - 12 - 2021
 * Objectivo : COnstruir a pessoa modelo  
 */
public class PessoaModelo {
    
    private int id_pessoa;
    private String nome;
    private int endereco;
    private String sexo;
    private String dataNasc;

    public PessoaModelo()
    {
        
    }

    public PessoaModelo(int id_pessoa, String nome, int endereco, String sexo, String dataNasc) {
        this.id_pessoa = id_pessoa;
        this.nome = nome;
        this.endereco = endereco;
        this.sexo = sexo;
        this.dataNasc = dataNasc;
    }

    public int getId_pessoa() {
        return id_pessoa;
    }

    public void setId_pessoa(int id_pessoa) {
        this.id_pessoa = id_pessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEndereco() {
        return endereco;
    }

    public void setEndereco(int endereco) {
        this.endereco = endereco;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }
    
    
    
    
    
    
    
    
    
}
