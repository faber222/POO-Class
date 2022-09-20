// para fazer o zip do arquivo, usar o distZip

package engtelecom.poo;

import static org.fusesource.jansi.Ansi.*;
import org.fusesource.jansi.AnsiConsole;

// import barcode.CodigoDeBarra;

public class App {
    public static void main(String[] args) throws Exception {
        // CodigoDeBarra.gerarCodigoDeBarra(123456, "saida.png");
        AnsiConsole.systemInstall();

        System.out.println(ansi().reset().eraseScreen().cursor(1, 1));

        System.out.println(ansi().fgBlue().a("Primiera"));
        System.out.println(ansi().fgRed().a("Segunda"));
        System.out.println(ansi().fgGreen().a("Terceira"));
        System.out.println(ansi().cursor(5, 10).fgCyan().a("123"));

        AnsiConsole.systemUninstall();
    }
}
