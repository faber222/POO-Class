package engtelecom.poo;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

import org.fusesource.jansi.Ansi;

public class Barra {
    private int tamanho;
    private Ansi.Color corTamanho;
    private String caracterTamanho;
    private Ansi.Color corProgresso;
    private String caracterProgresso;

    public Barra(int tamanho, Ansi.Color corTamanho, String caracterTamanho, Ansi.Color corProgresso,
            String caracterProgresso) {
        if (tamanho >= 20 && tamanho <= 100) {
            this.tamanho = tamanho;
            this.corTamanho = corTamanho;
            this.caracterTamanho = caracterTamanho;
            this.corProgresso = corProgresso;
            this.caracterProgresso = caracterProgresso;
        }
    }

    public void iniciar() throws InterruptedException {
        AnsiConsole.systemInstall();
        System.out.print(ansi().reset().eraseScreen().cursor(1, 1));

        String barra = "[";
        for (int i = 0; i < this.tamanho; i++) {
            barra += this.caracterTamanho;
        }
        barra += "]";

        System.out.print(ansi().fg(this.corTamanho).a(barra));
        for (int i = 2; i < 22; i++) {
            System.out.print(ansi().reset().cursor(1, i).fg(this.corProgresso).a(this.caracterProgresso));
            Thread.sleep(100); // dormindo 100ms
        }
        System.out.println();
        AnsiConsole.systemUninstall();
    }
}
