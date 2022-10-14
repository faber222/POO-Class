package engtelecom.poo;

public class App {

    public static void main(String[] args) {
        Tempo relogio = new Tempo(12, 20, 30);
        Tempo relogio2 = new Tempo(10, 20, 30);
        System.out.println(relogio);
        System.out.println(relogio.getSegundosTotais());
        System.out.println(relogio.diferencaTempo(relogio2));
        relogio.setHora(2);
        relogio.setMinuto(50);
        relogio.setSegundo(23);
        System.out.println(relogio);
    }
}
