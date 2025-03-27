public abstract class personagem implements Criatura {
  private String name;
  private int nivel;

  public personagem(String name, int nivel) {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

  public abstract void fala();
}