public abstract class heroi extends personagem {
  private int nSalvamentos;
  private String poderes;

  public heroi(String name, int nivel, int nSalvamentos, String poderes) {
    super(name, nivel); // pegando/adquirindo os atributos da classe personagem
    this.nSalvamentos = nSalvamentos;
    this.poderes = poderes;
  }

  public int getNSalvamentos() {
    return nSalvamentos;
  }

  public void setNSalvamentos(int nSalvamentos) {
    this.nSalvamentos = nSalvamentos;
  }

  public String getPoderes() {
    return poderes;
  }

  public void setPoderes(String poderes) {
    this.poderes = poderes;
  }

  public abstract void salvo();
}