
package entidade;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import persistencia.BD;


public class Produto {
    private int código,estoque;
    private float preço_custo,preço_venda;
    private String nome,url_imagem,unidade,marca,quantidade_embalagem;

    public Produto(int código, int estoque, float preço_custo, float preço_venda, String nome, String url_imagem, String unidade, String marca, String quantidade_embalagem) {
        this.código = código;
        this.estoque = estoque;
        this.preço_custo = preço_custo;
        this.preço_venda = preço_venda;
        this.nome = nome;
        this.url_imagem = url_imagem;
        this.unidade = unidade;
        this.marca = marca;
        this.quantidade_embalagem = quantidade_embalagem;
    }

    public String getQuantidade_embalagem() {
        return quantidade_embalagem;
    }

    public int getCódigo() {
        return código;
    }

    public int getEstoque() {
        return estoque;
    }

    public float getPreço_custo() {
        return preço_custo;
    }

    public float getPreço_venda() {
        return preço_venda;
    }

    public String getNome() {
        return nome;
    }

    public String getUrl_imagem() {
        return url_imagem;
    }

    public String getUnidade() {
        return unidade;
    }

    public String getMarca() {
        return marca;
    }
    
    public Visão getVisão(){
        return new Visão(código,"["+código+"]"+nome+" - "+marca+" - "+quantidade_embalagem);
    }
    public static ArrayList<Visão> getVisoes()
  {
    String sql = "SELECT cod_produto,nome_produto,quantidade_embalagem,marca_produto FROM produtos";
    ResultSet lista_resultados = null;
    ArrayList<Visão> visões = new ArrayList<Visão>();
    int código;
    try
    {
      lista_resultados = BD.comando.executeQuery(sql);
      while (lista_resultados.next())
      {
        código = lista_resultados.getInt("cod_produto");
        visões.add(new Visão(código,"["+código+"]"+lista_resultados.getString("nome_produto")+" - "+
                lista_resultados.getString("marca_produto")+" - "+lista_resultados.getString("quantidade_embalagem")));
      }
      lista_resultados.close();
    } catch (SQLException sqle)
    {
      sqle.printStackTrace();
    }
    return visões;
  }
}
