package engtelecom.poo;

public class Fluxo1 extends Thread {
    public void imprimirFluxo1() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            System.err.println("fluxo1 : " + i);
            Thread.sleep(100);
        }
    }

    public Fluxo1(String name) {
        super(name);
    }

    @Override
    public void run() {
        try {
            this.imprimirFluxo1();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
