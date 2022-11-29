package execc;

import conexao.Conexao;

import view.FrmLogin;

public class Execc {

    public static void main(String[] args) {
        
        Conexao con = new Conexao();
        con.conectarBanco();
        
        new FrmLogin().setVisible(true);
    }
    
}
