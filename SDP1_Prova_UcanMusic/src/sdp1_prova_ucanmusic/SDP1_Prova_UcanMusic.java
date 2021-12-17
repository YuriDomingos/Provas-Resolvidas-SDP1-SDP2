/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sdp1_prova_ucanmusic;

import dao.MusicoDAO;
import utils.Conexao;

/**
 *
 * @author yuridomingos
 */
public class SDP1_Prova_UcanMusic {

    /**
     * @param args the command line arguments
     */
    
    static MusicoDAO musica = new MusicoDAO();
    
    public static void main(String[] args) {
        // TODO code application logic here
     
        musica.consulta(1, "2004", "2020");
        
        
        
    }
    
}
