public interface Criatura {
    String getNome();

    String getDescricao();

    int getVida();

    void updateVida(int iAnUpdate);

    int getAtaque();

    int getDefesa();

    int atacar();

    int defender();

    boolean estaVivo();

    void reset();
}