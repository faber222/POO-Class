package engtelecom.poo;

public interface Carro {
    public static final String nome = "carro";

    void frear(int intensidade);

    default void desligar() {
        System.out.println("Desligando carro.");
    }
}
