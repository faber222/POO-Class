package engetelecom.poo;

import java.util.Random;

public class BuzzLightYear {

    // atributos
    private boolean capaceteAberto;
    private boolean asaAberta;
    private String[] fala;

    private Laser laser;

    public BuzzLightYear() {
        this.asaAberta = false;
        this.capaceteAberto = false;
        this.fala = new String[] {
                "Isto não é voar. Isto é cair, com estilo!",
                "Ao infinito e além!",
                "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!",
                "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.",
                "Comando estelar, pronto para voar!",
                "Talvez não tenha vida inteligente por aqui!" };
        this.laser = new Laser(1, 3, "Verde", 100);
    }

    public boolean isCapaceteAberto() {
        return capaceteAberto;
    }

    public boolean isAsaAberta() {
        return asaAberta;
    }

    public void abrirCapacete() {
        this.capaceteAberto = true;
    }

    public void fecharCapacete() {
        this.capaceteAberto = false;
    }

    public boolean abrirFecharAsa() {
        this.asaAberta = !this.asaAberta;
        return this.asaAberta;
    }

    // metodo laser
    public String dispararLaser() {
        return this.laser.disparar();
    }

    // dar golpe
    public String golpear() {
        return "Golpe";
    }

    public String falarFrase() {
        Random r = new Random();
        int number = r.nextInt(this.fala.length);
        return this.fala[number];
    }

}
