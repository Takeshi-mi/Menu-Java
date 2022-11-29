
package dao;
import java.sql.*;
import java.util.List;
import model.Cidade;
import conexao.Conexao;
import com.mysql.cj.jdbc.result.ResultSetFactory;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoCidade {
    Connection con = null;
    PreparedStatement pstm = null;
    
    public void salvarCidade(Cidade c)
    {
        con = new Conexao().conectarBanco();
        
        try{
            pstm = con.prepareStatement("INSERT INTO cidade(nome,uf,cep)");
            pstm.setString(1, c.nome);
            pstm.setString(2, c.uf);
            pstm.setString(3, c.cep);
            pstm.execute();
            JOptionPane.showMessageDialog(null,"A cidade "+c.nome+" foi salva com sucesso");
            
        } catch(SQLException errins){
            
            JOptionPane.showMessageDialog(null,"Ocorreu um erro ao inserir a cidade. Tente novamente"+errins);
        }
        
        
    }
    
    
    public List<Cidade> getCidades(){
        
        List<Cidade> lista = new ArrayList<Cidade>();
        con = new Conexao().conectarBanco();
        try{
            pstm = con.prepareStatement("SELECT * FROM cidade", ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = pstm.executeQuery();
            if(rs.first()){
                do{
                    Cidade cidade = new Cidade();
                    cidade.id = rs.getInt("id");
                    cidade.nome = rs.getString("nome");
                    cidade.cep = rs.getString("cep");
                    cidade.uf = rs.getString("uf");
                    
                    lista.add(cidade);              
                } while(rs.next());
            
            }
            pstm.close();
        } catch(SQLException err){
            JOptionPane.showMessageDialog(null,"Erro ao buscar dados da tabela usuario: "+err);
        }
    return lista;

    }
}
