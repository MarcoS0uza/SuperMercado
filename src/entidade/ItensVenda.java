
package entidade;

public class ItensVenda {
    int código;
    float quantidade, valor_unit, valor_total_itens;
    Venda venda;
    Produto produto;

    public ItensVenda(int código, float quantidade, float valor_unit, float valor_total_itens, Venda venda, Produto produto) {
        this.código = código;
        this.quantidade = quantidade;
        this.valor_unit = valor_unit;
        this.valor_total_itens = valor_total_itens;
        this.venda = venda;
        this.produto = produto;
    }

    public int getCódigo() {
        return código;
    }

    public float getQuantidade() {
        return quantidade;
    }

    public float getValor_unit() {
        return valor_unit;
    }

    public float getValor_total_itens() {
        return valor_total_itens;
    }

    public Venda getVenda() {
        return venda;
    }

    public Produto getProduto() {
        return produto;
    }
    
   // Métodos para inserção,alteração,remoção e consulta no BD. 
    
}
