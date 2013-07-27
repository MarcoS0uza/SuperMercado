
package controle;

import entidade.Cliente;
import interfaces.JanelaCadastroCliente;


public class ControladorCadastroCliente {
    public ControladorCadastroCliente()
  {
    new JanelaCadastroCliente(this).setVisible(true);
  }
    
   /* 
  public String inserirCliente(Cliente cliente)
  {
    Cliente cliente1;
    cliente1 = Cliente.buscarCliente(cliente.getCódigo());
    if (cliente1 == null)
    {
      return Cliente.inserirCliente(cliente);
    } else
    {
      return "Cliente já Cadastrado";
    }
  }*/
    
}
