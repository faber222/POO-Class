package engtelecom.poo;

public class App {
    // atributo
    private String nome = "POO";

    // ou
    public App(String n) {
        this.nome = n;
    }

    // método
    public void falar() {
        System.out.println("oi: " + this.nome);
    }

    public String getNome() {
        return this.nome;
    }

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

        // como App é uma classe, podemos criar objetos, e atribuir métodos e atributos
        App a = new App("STD");
        App b = new App(a.getNome());
        a.falar();
        b.falar();
    }
}
