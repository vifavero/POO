public abstract class vilao extends personagem {
  private int nVitimas;
  private String fraquezas;

  public vilao(String name, int nivel, int nVitimas, String fraqueza) {
    super(name, nivel);
  }

  public int getNVitimas() {
    return nVitimas;
  }

  public void setNVitimas(int nVitimas) {
    this.nVitimas = nVitimas;
  }

  public String getFraquezas() {
    return fraquezas;
  }

  public void setFraquezas(String fraquezas) {
    this.fraquezas = fraquezas;
  }

  public abstract void rouba();
}