import java.util.Scanner;

public class ProcessaEntrada {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        // enquanto houver linhas a serem fornecidas, ele imprime na tela
        while (keyboard.hasNext()) {
            // usando o nextLine.split, ajuda a separar as entradas até os :
            String[] loginVet = keyboard.nextLine().split(":");
            // com o loginVet[0], ele vai imprimir a primeira linha
            System.out.println(loginVet[0]);

        }
    }
}
