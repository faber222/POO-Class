public class ArgumentoLinha {
    public static void main(String[] args) {
        // verificando se foram passados argumentos
        // de linha de comando
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(i + 1 + "º argumento: " + args[i]);
            }
            // converte string para inteiro
            // Integer.parseInt
            // converte string para double
            // Double.parseDouble
            int number = Integer.parseInt(args[0]);
            System.out.println(number);
            
        }
        System.out.println("Fim do programa!");
    }
}
