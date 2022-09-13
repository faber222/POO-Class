public class SwitchCase {

    public static double soma(int x, int y) {
        return x + y;
    }

    public static double sub(int x, int y) {
        return x - y;
    }

    public static double multi(int x, int y) {
        return x * y;
    }

    public static double div(int x, int y) {
        return (double) x / y;
    }

    public static void mostra(double rest) {
        System.out.println("Resultado = " + rest);
    }

    public static void main(String[] args) {
        // Receba 3 argumentos de linha de comando
        // operando operador operando
        // faça a operacao e imprima os resultados da soma
        if (args.length < 3) {
            System.out.println("Erro de sintaxe. \nInforme 2 argumentos");
        } else {
            String oper = args[1];
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[2]);
            switch (oper) {
                case "+":
                    double rest = soma(x, y);
                    mostra(rest);
                    break;
                case "/":
                    double rest1 = div(x, y);
                    mostra(rest1);
                    break;
                case "-":
                    double rest2 = sub(x, y);
                    mostra(rest2);
                    break;
                case "X":
                    double rest3 = multi(x, y);
                    mostra(rest3);
                    break;

                default:
                    // nothing to do
            }
        }

    }
}