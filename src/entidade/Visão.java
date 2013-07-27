package entidade;

public class Visão{
  int chave;
  String info;

    public Visão(int chave, String info) {
        this.chave = chave;
        this.info = info;
    }

    public int getChave() {
        return chave;
    }

    public String getInfo() {
        return info;
    }

  @Override
  public String toString()
  {
    return info;
  }
  
}

