package dao;

import Conexao.Conexao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Cidade;


public class DaoCidade {
        
    Connection con = null;
    PreparedStatement pstm = null;  // Preparando o caminho. statement é estrada. 
    
    public void salvarCidade(Cidade c)
    {
        con  = new Conexao().conectarBanco();
        try{
            
        //INSERT INTO tb_cidade(nome_cidade,uf_cidade,cep_cidade) VALUES ('Formosa', 'GO','73.800-000')
        pstm = con.prepareStatement("INSERT INTO tb_cidade(nome_cidade,uf_cidade,cep_cidade) VALUES (?,?,?)");
        pstm.setString(1, c.nome);
        pstm.setString(2, c.uf);
        pstm.setString(3, c.cep);
        pstm.execute();
        JOptionPane.showMessageDialog(null,"A cidade "+c.nome+" foi salva com sucesso!");
            
        } catch(SQLException errins){
            
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao inserir a cidade no BD. Tente novamente"+errins);
        }
    }



public void alterarCidade(Cidade c)
{
    con  = new Conexao().conectarBanco();
    try{
            
        //INSERT INTO tb_cidade(nome_cidade,uf_cidade,cep_cidade) VALUES ('Formosa', 'GO','73.800-000')
        pstm = con.prepareStatement("UPDATE tb_cidade SET nome_cidade=?, uf_cidade=? ,cep_cidade=? WHERE id_cidade = ?");
        pstm.setString(1, c.nome);
        pstm.setString(2, c.uf);
        pstm.setString(3, c.cep);
        pstm.setInt(4, c.id);
        pstm.execute();
        JOptionPane.showMessageDialog(null,"A cidade "+c.nome+" foi alterada com sucesso!");
            
        } catch(SQLException erralt){
            
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao inserir a cidade no BD. Tente novamente"+erralt);
        }
}
public void excluirCidade(int id)
{
    con  = new Conexao().conectarBanco();
    try{
            
        //INSERT INTO tb_cidade(nome_cidade,uf_cidade,cep_cidade) VALUES ('Formosa', 'GO','73.800-000')
        pstm = con.prepareStatement("DELETE FROM tb_cidade WHERE id_cidade = ?");
        pstm.setInt(1, id);
        pstm.execute();
        JOptionPane.showMessageDialog(null,"A cidade foi excluída com sucesso!");
            
        } catch(SQLException errexc){
            
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao inserir a cidade no BD. Tente novamente"+errexc);
        }
}    


    
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
    

