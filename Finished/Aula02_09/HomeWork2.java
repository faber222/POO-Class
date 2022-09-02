public class HomeWork2 {
    
    static long factorial(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return n;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        int number = 0;
        if (args.length > 0) {
            number = Integer.parseInt(args[0]);
        }

        long factorial;
        factorial = factorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);

    }
}
