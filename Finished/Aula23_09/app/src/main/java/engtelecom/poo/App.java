package engtelecom.poo;

public class App {

    public static void main(String[] args) {
        Carro fusca = new Carro();
        Carro ferrari = new Carro();

        System.out.println(fusca.obterVelocidade() + " :fusca e ferrari: " + ferrari.obterVelocidade());
        fusca.acelerar(10);
        fusca.acelerar(100);
        ferrari.acelerar(200);

        System.out.println(fusca.obterVelocidade() + " :fusca e ferrari: " + ferrari.obterVelocidade());
    }
}
