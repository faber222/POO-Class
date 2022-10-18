package engetelecom.poo;

import java.time.Instant;

public class App {

    public static void main(String[] args) throws InterruptedException {
        BuzzLightYear boneco1 = new BuzzLightYear();

        // Instant inicio = Instant.now(); // obtem o tempo atual em epoch
        // Thread.sleep(1000); // pausa 1 segundo
        // Instant fim = Instant.now();

        // long diferenca = fim.getEpochSecond() - inicio.getEpochSecond();
        // System.out.println(diferenca);

        // Laser simples = new Laser((int) diferenca, 3, "Azul", 50);

        boneco1 = null;

        Motor m1000 = new Motor(5000);
        Motor v8 = new Motor(9000);

        Carro fusca = new Carro(m1000);
        fusca = null;
        
        Carro ferrari = new Carro(m1000);

        /*
         * boneco1.abrirCapacete();
         * System.out.println("Capacete está " + ((boneco1.isCapaceteAberto()) ?
         * "aberto" : "fechado"));
         * System.out.println("Asa está " + ((boneco1.isAsaAberta()) ? "aberta" :
         * "fechado"));
         * System.out.println(boneco1.dispararLaser());
         * System.out.println(boneco1.falarFrase());
         */

    }
}
