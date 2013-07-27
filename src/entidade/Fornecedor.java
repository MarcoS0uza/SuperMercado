
package entidade;

public class Fornecedor extends FichaCadastro{

    public Fornecedor(int código, int numero, String nome, String data_cadastro, String n_documento, String endereço, String bairro, String telefone, String cep, String estado, String cidade, String email) {
        super(código, numero, nome, data_cadastro, n_documento, endereço, bairro, telefone, cep, estado, cidade, email);
    }

    //Construtor para ser mostrado na tabela
    public Fornecedor(int código, String nome, String data_cadastro, String n_documento) {
        super(código, nome, data_cadastro, n_documento);
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

    public String getEstado() {
        return estado;
    }

    public String getCidade() {
        return cidade;
    }

    // Métodos para inserção,alteração,remoção e consulta no BD.
    
    
    
}
