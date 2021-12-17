/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author : Yuridomingos
 * Data    : 17 - 12 - 2021
 * Objectivo : Criar musico modelo 
 */
public class MusicoModelo extends PessoaModelo {
    
    private int fk_pessoa;
    private String dataInicio;

    public MusicoModelo() {
    }

    public MusicoModelo(int fk_pessoa, String dataInicio) {
        this.fk_pessoa = fk_pessoa;
        this.dataInicio = dataInicio;
    }

    public int getFk_pessoa() {
        return fk_pessoa;
    }

    public void setFk_pessoa(int fk_pessoa) {
        this.fk_pessoa = fk_pessoa;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }
    
    
    
    
}
