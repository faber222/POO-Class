public class PrimeNumber {
    public static void main(String[] args) {
        if (args.length > 0) {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            int x = number1, y = number2;
            if (number1 < number2) {
                x = number2;
                y = number1;
            }
            int j;

            for (int i = x; i <= y; i++) {
                for (j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        System.out.println("não é um numero primo " + i);
                    } else {
                        System.out.println("é um numero primo " + i);
                    }
                }
            }

        } else {
            System.out.println("Nothing to check!");
        }
    }
}
