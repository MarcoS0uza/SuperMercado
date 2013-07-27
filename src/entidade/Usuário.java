
package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.BD;


public class Usuário {
    public static enum CARGO{Caixa, Gerente, Administrador};
    private int código;
    private String nome,senha;
    private CARGO cargo;

    public Usuário(int código, String nome, String senha, CARGO cargo) {
        this.código = código;
        this.nome = nome;
        this.senha = senha;
        this.cargo = cargo;
    }

    public Usuário(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
    

    public int getCódigo() {
        return código;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public CARGO getCargo() {
        return cargo;
    }

  public static int autenticaçaoUsuário(Usuário user){
      String sql = "SELECT COUNT(nome_user)FROM usuario WHERE nome_user='"+user.getNome()+"' AND senha_user='"+user.getSenha()+"';";
      int resultado = 0;
        try {
            ResultSet resultado_busca = BD.comando.executeQuery(sql);
            while(resultado_busca.next()){
               resultado = resultado_busca.getInt(1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return -1;
        }
      return resultado;
  }   
    
}
