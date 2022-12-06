package controller;

import dao.DaoUsuario;
import javax.swing.JOptionPane;

public class ControllerUsuario {
    DaoUsuario dao = new DaoUsuario();
    List<Usuario> lista = new ArrayList<Usuario>();
    
    
    
    public void inserirUsuario(Usuario u){
    
        if(!u.nome.equals("") && !u.senha.equals("") && !u.email.equals("") && u.tipo!=0){
            dao.salvarUsuario(u);
            JOptionPane.showMessageDialog(null,"Usuário salvo com sucesso!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Todos os campos são de preenchimento obrigatório");
        }
    }
    

    public void editarUsuario(Usuario u){
    
        if(!u.nome.equals("") && !u.senha.equals("") && !u.email.equals("") && u.tipo!=0){
            dao.salvarUsuario(u);
            JOptionPane.showMessageDialog(null,"Usuário alterado com sucesso!");
        }
    }
    
    
    public void deletarUsuario(Usuario u){
    
        int op = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o usuário?");
        if (op==1)
        {
            dao.excluirUsuario(id);
            JOptionPane.showMessageDialog(null,"Usuário excluído com sucesso!");
        }
        else{
            return; 
        }
    }
    
    public List<Usuario> recarregarLista();
    {
        recarregarLista().clear();
        lista = dao.getUsuarios();
        return lista;
    }
   
    
}
