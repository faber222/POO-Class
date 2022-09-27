package engtelecom.poo;

public class App {

    public static void main(String[] args) {
        Contador contador = new Contador();
        contador.setValorAtual(0);
        contador.incrementar();
        contador.incrementar();
        contador.incrementar();
        System.out.println(contador);

    }
}
