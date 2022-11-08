
package dao; //Data Acess Object
import java.sql.*;
import java.util.List;
import model.Usuario;
import Conexao.Conexao;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DaoUsuario {
    
    Connection con = null;
    PreparedStatement pstm = null;  // Preparando o caminho. statement é estrada. 
    
    public List<Usuario> getUsuarios()
    {
        List<Usuario> lista = new ArrayList<Usuario>();
        con = new Conexao().conectarBanco(); //Método para conectar com o Banco
        try{
        pstm = con.prepareStatement("SELECT * FROM tb_usuario",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = pstm.executeQuery();
        if(rs.first()){
            do{
               Usuario usuario = new Usuario();
               usuario.id = rs.getInt("id_usuario");
               usuario.nome = rs.getString("nome_usuario");
               usuario.senha = rs.getString("senha_usuario");
               usuario.email = rs.getString("email");
               usuario.tipo = rs.getInt("tipo");
               
               lista.add(usuario);
                
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
