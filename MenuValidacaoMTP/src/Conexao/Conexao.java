
package Conexao;
import java.sql.*; //Conection é uma classe do pacote sql responsável pela conexão;
import javax.swing.JOptionPane;



public class Conexao {
    Connection conexao;
    
    private final String driver  = "com.mysql.cj.jdbc.Driver";  //Uma variável final é um tipo que eu não posso modificar depois
    //      se fosse no postgres = "org.postgressql.Driver"
    private final String url     = "jdbc:mysql://localhost:3306/db_tadsifg";
    //      se fosse no postgres = "jdbc:postgresql://localhost:5432/db_tadsifg"
    private final String usuario = "root";
    private final String senha   = "";
    
    public void conectarBanco()
    {
    try
    {
        Class.forName(driver);
        DriverManager.getConnection(url,usuario,senha); //É um só try com 2 catchs.
        JOptionPane.showMessageDialog(null,"Conectado com sucesso.");
    }catch(ClassNotFoundException drive)
        {
        JOptionPane.showMessageDialog(null,"Driver não encontrado" + drive);
        }
     catch(SQLException fonte)
     {
         JOptionPane.showMessageDialog(null,"Banco de dados não encontrados" + fonte);
     }
        
    }
}
