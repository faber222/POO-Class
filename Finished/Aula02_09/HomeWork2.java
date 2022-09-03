public class HomeWork2 {

    // use double values, implict that the max number is 170
    // using float values, implict that the max number is 80
    // using long values, implict that the max number is 30
    
    static double factorial(int n) {
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

        double factorial;
        factorial = factorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);

    }
}
