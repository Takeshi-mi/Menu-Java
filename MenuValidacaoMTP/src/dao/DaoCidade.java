/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cidade;

/**
 *
 * @author ifg
 */
public class DaoCidade {
        
    Connection con = null;
    PreparedStatement pstm = null;  // Preparando o caminho. statement é estrada. 
    
    public List<Cidade> getCidades()
    {
        List<Cidade> lista = new ArrayList<Cidade>();
        con = new Conexao().conectarBanco(); //Método para conectar com o Banco
        try{
        pstm = con.prepareStatement("SELECT * FROM tb_cidade",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = pstm.executeQuery();
        if(rs.first()){
            do{
               Cidade cidade = new Cidade();
               cidade.id = rs.getInt("id_cidade");
               cidade.nome = rs.getString("nome_cidade");
               cidade.uf = rs.getString("uf_cidade");
               cidade.cep = rs.getString("cep_cidade");
               
               
               lista.add(cidade);
                
            }while(rs.next()); //Esse método confere se tem um próximo e repete até que chegue no últ imo.
        }
        pstm.close(); // Fechar o caminho pra nenhum hacker entrar
        }catch(SQLException err)
        {
            JOptionPane.showMessageDialog(null,"Erro ao buscar dados da tabela usuario: " + err);
        }
                
        return lista;
    }
}
    

