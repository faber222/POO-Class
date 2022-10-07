package engtelecom.poo;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

/**
 * Esta classe depende da biblioteca jansi. Coloque-a como dependência em teu
 * projeto gradle ou maven
 * https://mvnrepository.com/artifact/org.fusesource.jansi/jansi
 */
public class ExemploJansi {

    /**
     * Retorna uma String para representar uma barra de progresso
     * 
     * @param fundo   caractere que será usado como fundo da barra
     * @param tamanho tamanho da barra de progresso
     * @return String para representar uma barra de progresso
     */
    public static String montaBarraDeFundo(char fundo, int tamanho) {
        char[] barra = new char[22];
        barra[0] = '[';
        barra[21] = ']';
        for (int i = 1; i < barra.length - 1; i++) {
            barra[i] = fundo;
        }
        return new String(barra);
    }

    // Thread.sleep pode gerar exceção e não irá tratá-la.
    // Por isso o trows Exception na declaração do método main
    public static void main(String[] args) throws Exception {
        Thread.sleep(1000);

        // para funcionar cores no terminal do IntelliJ, porém não funciona coordenadas
        // Para quem usa IntelliJ o ideal seria executar este código no terminal com o
        // gradle
        // ex: ./gradlew installDist && ./app/build/install/app/bin/app
        System.setProperty("jansi.passthrough", "true");

        // Usando código Unicode - https://en.wikipedia.org/wiki/Box-drawing_character
        char progresso = '\u2593'; // equivale ao caractere: ▓

        AnsiConsole.systemInstall();
        System.out.print(ansi().reset().eraseScreen().cursor(1, 1));

        // Que tal trocar na linha abaixo o caractere '-' por '\u2591'?
        String barraDeFundo = montaBarraDeFundo('-', 20);
        System.out.print(ansi().a(Attribute.INTENSITY_FAINT).fg(BLUE).a(barraDeFundo));

        for (int i = 2; i < 22; i++) {
            System.out.print(ansi().reset().cursor(1, i).fg(RED).a(progresso));
            Thread.sleep(100);
        }

        System.out.println();
        ansi().reset();
        AnsiConsole.systemUninstall();
    }
}