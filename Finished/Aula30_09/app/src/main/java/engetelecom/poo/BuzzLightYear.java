package engetelecom.poo;

import java.util.Random;

public class BuzzLightYear {

    private String acao;
    private String fala;
    private String asa;
    private String laser;
    private String capacete;

    public void getAcao() {
        this.acao = "BuzzLightYear, golpe de karatê!";
        showOnTheScreen(acao);
    }

    public void getFala() {
        final Random r = new Random();
        final int sortNumber = r.nextInt(5) + 1;
        switch (sortNumber) {
            case 1:
                this.fala = "Isto não é voar. Isto é cair, com estilo!";
                break;
            case 2:
                this.fala = "Ao infinito e além!";
                break;
            case 3:
                this.fala = "Nunca duvidei de mim mesmo, Comandante, e não vou começar agora!";
                break;
            case 4:
                this.fala = "Embora você tenha tentado acabar comigo, a vingança não é um ideal que promovemos no meu planeta.";
                break;
            case 5:
                this.fala = "Comando estelar, pronto para voar!";
                break;
            case 6:
                this.fala = "Talvez não tenha vida inteligente por aqui!";
                break;
            default:
                break;
        }
        showOnTheScreen(fala);
        
    }

    public void getAsa() {
        this.asa = "BuzzLightYear, abrir asa!";
        showOnTheScreen(asa);
    }

    public void getLaser() {
        this.laser = "BuzzLightYear, disparar laser!";
        showOnTheScreen(laser);
    }

    public void getCapacete() {
        this.capacete = "BuzzLightYear, abrir capacete";
        showOnTheScreen(capacete);
    }

    private void showOnTheScreen(final String acao) {
        System.out.println(acao);
    }

}
