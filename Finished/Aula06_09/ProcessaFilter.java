import java.util.Scanner;

public class ProcessaFilter {
    public static void main(String[] args) {
        String filter = "filter";
        String up = "up";
        String down = "down";
        try {
            if (args.length > 0) {
                Scanner keyboard = new Scanner(System.in);
                if (args[0].equals(filter)) {
                    // enquanto houver linhas a serem fornecidas, ele imprime na tela
                    while (keyboard.hasNext()) {
                        String loginVet = keyboard.nextLine();
                        // imprime a linha que contem tal palavra
                        if (loginVet.contains(args[1])) {
                            System.out.println(loginVet);
                        }
                    }
                } else if (args[0].equals(up)) {
                    // enquanto houver linhas a serem fornecidas, ele imprime na tela
                    while (keyboard.hasNext()) {
                        // imprime maisculo
                        System.out.println(keyboard.nextLine().toUpperCase());
                    }
                } else if (args[0].equals(down)) {
                    while (keyboard.hasNext()) {
                        // imprime maisculo
                        System.out.println(keyboard.nextLine().toLowerCase());
                    }
                }
                keyboard.close();
            }
        } catch (Exception e) {
            System.out.println("Invalid parameter");
        }

    }
}
