
package conexao;
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {
    
    Connection conexao;
    
    private final String driver = "com.mysql.cj.jdbc.Driver";
    private final String url ="jdbc:mysql://localhost:3306/db_tadsifg";
    private final String usuario ="root";
    private final String senha ="";
    
 public Connection conectarBanco(){  
  try{
    Class.forName(driver);
    conexao = DriverManager.getConnection(url,usuario,senha);
    JOptionPane.showMessageDialog(null, "Parabens vc foi conectado!!!");
} catch(ClassNotFoundException drive){
    
    JOptionPane.showMessageDialog(null, "Driver não encontrado"+drive);
} catch(SQLException fonte){
    
    JOptionPane.showMessageDialog(null, "Banco de dados não encontrado"+fonte);
    }
    return conexao;
}}
