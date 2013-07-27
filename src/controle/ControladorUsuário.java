
package controle;

import entidade.Usuário;
import interfaces.JanelaLogin;


public class ControladorUsuário {
    
    public static void main(String args[]){
        new ControladorUsuário();
    }
    
    public ControladorUsuário()
  {
    new JanelaLogin(this).setVisible(true);
  }
  public String autenticaçãoUsuário(Usuário user){
      int loginSenhaOk = Usuário.autenticaçaoUsuário(user);
      if(loginSenhaOk >= 0){
          if(loginSenhaOk == 0){
              return "Dados incorretos ou usuário não Cadastrado";
          }else if (loginSenhaOk == 1){
              return null;
          }
      }else{
          return "Erro na autenticação do usuário";
      }  
        return null;
  } 
}
