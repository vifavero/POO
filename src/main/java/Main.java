// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

// um personagem pode ser um heroi mas tmb pode ser um vilao
//considerando isso, eu tenho que ter herois e vilões 

public class Main {
  public static void main(String[] args) {
    personagem h1 = new heroi1("Hulk", 10, 50, "força");
    personagem v1 = new vilao1("Thanos", 10, 50, "inteligencia");

    System.out.println(h1);
    System.out.println(v1);
  }

}