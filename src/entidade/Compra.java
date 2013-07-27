
package entidade;


public class Compra {
    int código;
    String data_compra,hora_compra;
    float total_compra;
    Fornecedor fornecedor;

    public Compra(int código, String data_compra, String hora_compra, float total_compra, Fornecedor fornecedor) {
        this.código = código;
        this.data_compra = data_compra;
        this.hora_compra = hora_compra;
        this.total_compra = total_compra;
        this.fornecedor = fornecedor;
    }

    public int getCódigo() {
        return código;
    }

    public String getData_compra() {
        return data_compra;
    }

    public String getHora_compra() {
        return hora_compra;
    }

    public float getTotal_compra() {
        return total_compra;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    
    // Métodos para inserção,alteração,remoção e consulta no BD.
    
}
