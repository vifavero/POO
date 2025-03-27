
public class vilao1 extends vilao {
  public vilao1(String name, int nivel, int nSalvamentos, String poderes) {
    super(name, nivel, nSalvamentos, poderes);
  }

  @Override
  public void fala() {
    System.out.println("Essa será minha obra de arte!");
  }

  @Override
  public void rouba() {
    System.out.println("Eu sou " + getName() + " e essa é a minha vingança!");
  }

}
