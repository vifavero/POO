
public class heroi1 extends heroi {
  public heroi1(String name, int nivel, int nSalvamentos, String poderes) {
    super(name, nivel, nSalvamentos, poderes);
  }

  @Override
  public void fala() {
    System.out.println("Vamos salvar vidas!!!");
  }

  @Override
  public void salvo() {
    System.out.println("Eu sou " + getName() + "e estou salvando pessoas!");
  }

}
