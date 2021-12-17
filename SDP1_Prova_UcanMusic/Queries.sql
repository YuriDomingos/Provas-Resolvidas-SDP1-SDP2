
/*

@Autor : Yuri Domingos
Dados : 17 - 12 - 2021
Objectivo : Realizar as queries nativas,para prova 
Problema : UCanMusic
*/



/*Primeiro select */

SELECT p.nome, m.titulo, d.data FROM pessoa p
                 INNER JOIN musico mu ON (p.id_pessoa = mu.fk_pessoa) 
                 INNER JOIN musica m  ON (mu.id_musico = m.fk_musico)
                 INNER JOIN disco d   ON (d.id_disco = m.fk_disco) 
                 WHERE mu.id_musico = 1 and d.data between '2001' and '2021';



/* Segundo Exercicio  **/
SELECT distinct  pessP.nome, pessM,  

    ( SELECT e.descricao FROM  endereco e 
	                     WHERE  e.id_endereco = pessP.fk_endereco )
	                     AS Endereco_do_produtor,
						 
	(SELECT e.descricao FROM endereco e
	                    WHERE e.id_endereco = pessM.fk_endereco ) 
	                     AS Endereco_Musico 
						 						 
	 FROM disco d 
        INNER JOIN produtor p
		ON ( d.fk_produtor = p.id_produtor )
		INNER JOIN musica m 
		ON (m.fk_disco = d.id_disco)
		INNER JOIN musico mus
		ON (mus.id_musico = m.fk_musico)
		INNER JOIN pessoa pessM 
		ON (pessM.id_pessoa = p.fk_pessoa)
		INNER JOIN pessoa pessP 
		ON (pessP.id_pessoa = p.fk_pessoa)	
               WHERE d.data between '2009' and '2023' and pessM.sexo = 'Masculino'     and pessM.fk_endereco = pessP.fk_endereco;
