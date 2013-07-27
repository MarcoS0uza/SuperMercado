
package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import persistencia.BD;

public class Cliente extends FichaCadastro{
    private String tipo_cliente,sexo;

    public Cliente(String tipo_cliente, String sexo, int código, int numero, String nome, String data_cadastro, String n_documento, String endereço, String bairro, String telefone, String cep, String estado, String cidade, String email) {
        super(código, numero, nome, data_cadastro, n_documento, endereço, bairro, telefone, cep, estado, cidade, email);
        this.tipo_cliente = tipo_cliente;
        this.sexo = sexo;
    }


    
    //Construtor para ser mostrado na tabela
    public Cliente(int código, String nome, String data_cadastro, String n_documento) {
        super(código, nome, data_cadastro, n_documento);
    }

    public String getTipo_cliente() {
        return tipo_cliente;
    }

    public String getSexo() {
        return sexo;
    }

    public int getCódigo() {
        return código;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public String getN_documento() {
        return n_documento;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getBairro() {
        return bairro;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }
    
    // Métodos para inserção,alteração,remoção e consulta no BD.
    
    public static Cliente buscarCliente(int código)
  {
    String sql = "SELECT * FROM clientes WHERE cod_cliente = '" + código + "'";
    ResultSet lista_resultados;
    Cliente cliente = null;
    try
    {
      lista_resultados = BD.comando.executeQuery(sql);
      while (lista_resultados.next())
      {

        cliente = new Cliente(
                    lista_resultados.getString("tipo_cliente"),
                    lista_resultados.getString("sexo"),
                    lista_resultados.getInt("cod_cliente"),               
                    lista_resultados.getInt("numero_cliente"),
                    lista_resultados.getString("nome_cliente"),
                    lista_resultados.getString("data_cadastro_cliente"),
                    lista_resultados.getString("n_documento_cliente"),
                    lista_resultados.getString("endereço_cliente"),
                    lista_resultados.getString("bairro_cliente"),
                    lista_resultados.getString("telefone_cliente"),
                    lista_resultados.getString("cep_cliente"),
                    lista_resultados.getString("estado_cliente"),
                    lista_resultados.getString("cidade_cliente"),
                    lista_resultados.getString("email_cliente"));
      }
      lista_resultados.close();
    } catch (SQLException sqle)
    {
      sqle.printStackTrace();
      cliente = null;
    }
    return cliente;
  }
}
