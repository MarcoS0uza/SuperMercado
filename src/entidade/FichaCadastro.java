
package entidade;

import java.util.Date;
import java.text.SimpleDateFormat;

public class FichaCadastro {
    public enum UF{AC, AL, AP, AM, BA, CE, DF, ES, GO, MA, 
            MT, MS, MG, PA, PB, PR, PE, PI, RR, RO, 
            RJ, RN, RS,SC, SP,SE,TO};

    protected int código,numero;
    protected String nome,data_cadastro,n_documento,endereço,bairro,telefone,cep,estado,cidade,email;

    public FichaCadastro(int código, int numero, String nome, String data_cadastro, String n_documento, String endereço, String bairro, String telefone, String cep, String estado, String cidade, String email) {
        this.código = código;
        this.numero = numero;
        this.nome = nome;
        this.data_cadastro = data_cadastro;
        this.n_documento = n_documento;
        this.endereço = endereço;
        this.bairro = bairro;
        this.telefone = telefone;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.email = email;
    }


//Construtor para ser mostrado na tabela
    public FichaCadastro(int código, String nome, String data_cadastro, String n_documento) {
        this.código = código;
        this.nome = nome;
        this.data_cadastro = data_cadastro;
        this.n_documento = n_documento;
    }
    
    public static String getDataAtual(){
      SimpleDateFormat  dataAtual = new SimpleDateFormat("dd/MM/yyyy");
      return dataAtual.format(new Date());
    }
    public static String getHoraAtual(){
       SimpleDateFormat  horaAtual = new SimpleDateFormat("hh:mm:ss"); 
       return horaAtual.format(new Date());
    }
    //retorna um array de UF para ser mostrado no comboBox
    public static UF[] getUf(){
       return  UF.values();
    }
    
}
