/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.ConsultaModelo;
import modelo.MusicoModelo;
import utils.Conexao;

/**
 *
 * @author yuridomingos
 * Data   : 17 - 12 - 2021
 * Objectivo : Fazer o priemiro select da prova 
 */
public class MusicoDAO {
    
    
    
    public ArrayList<ConsultaModelo> consulta(int id_musico, String data1, String data2)
    {
        ArrayList<ConsultaModelo> lista_consulta = new ArrayList<ConsultaModelo>();
        
        String query = "SELECT p.nome, m.titulo, d.data FROM pessoa p"
                + " INNER JOIN musico mu ON (p.id_pessoa = mu.fk_pessoa) "
                + " INNER JOIN musica m  ON (mu.id_musico = m.fk_musico)"
                + " INNER JOIN disco d   ON (d.id_disco = m.fk_disco) "
                + " WHERE mu.id_musico = (?) and d.data between ? and ?";
        try
        {
             PreparedStatement ps = Conexao.abrirConexao().prepareStatement(query);
             ps.setInt(1, id_musico);
             ps.setString(2, data1);
             ps.setString(3, data2);
             ResultSet rs = ps.executeQuery();
             
             
             while ( rs.next())
             {
                 ConsultaModelo novo = new ConsultaModelo();
                 
                 novo.setNome_musico(rs.getString(1));
                 novo.setDescricao(rs.getString(2));
                 novo.setData_musica(rs.getString(3));
                 
                
                 lista_consulta.add(novo);
                  for ( int i = 0; i <lista_consulta.size(); i++)
                 {
                     System.out.println(" Nome "+lista_consulta.get(i).getNome_musico()
                                       + "Nome musica "+ lista_consulta.get(i).getDescricao()
                                       + "Data musica "+lista_consulta.get(i).getData_musica());
                 }
             }
             
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        
        }
                    
        return lista_consulta;
    }
    
}
