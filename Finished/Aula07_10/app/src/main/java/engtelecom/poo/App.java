package engtelecom.poo;

import org.fusesource.jansi.AnsiConsole;
import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color.*;

public class App {
    // Atente-se ao throws Exception na declara ̧c~ao do m ́etodo
    public static void main(String[] args) throws Exception {
        Barra progresso = new Barra(20, GREEN, "=", RED, "+");

        progresso.iniciar(true);
    }
}