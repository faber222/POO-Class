package engtelecom.poo;

public class App {

    public void imprimirFluxo1() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.err.println("fluxo1 : " + i);
            Thread.sleep(100);
        }
    }

    public void imprimirFluxo2() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.err.println("fluxo2 : " + i);
            Thread.sleep(100);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // App app = new App();
        // app.imprimirFluxo1();
        // app.imprimirFluxo2();
        Thread teste = new OlaMundoReverse("Ola Mundo", 0);

        // Thread f1 = new Fluxo1("faber");
        // Thread f2 = new Thread(new Fluxo2());
        System.err.println("Iniciando o programa");
        teste.start();
        teste.join();
        // f1.start();
        // f2.start();
        // try {
        //     // usado para que só execute a linha abaixo quando terminar de executar ambos
        //     f2.join();
        // } catch (InterruptedException e) {
        //     System.err.println("erro");
        // }

        System.err.println("Fim do programa");
    }
}
