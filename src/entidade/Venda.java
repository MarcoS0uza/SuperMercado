
package entidade;

public class Venda {
    int código;
    String data_venda,hora_venda;
    float total_venda;
    Cliente cliente;

    public Venda(int código, String data_venda, String hora_venda, float total_venda, Cliente cliente) {
        this.código = código;
        this.data_venda = data_venda;
        this.hora_venda = hora_venda;
        this.total_venda = total_venda;
        this.cliente = cliente;
    }

    public int getCódigo() {
        return código;
    }

    public String getData_venda() {
        return data_venda;
    }

    public String getHora_venda() {
        return hora_venda;
    }

    public float getTotal_venda() {
        return total_venda;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    // Métodos para inserção,alteração,remoção e consulta no BD.
    
}
