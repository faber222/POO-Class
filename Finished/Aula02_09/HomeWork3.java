public class HomeWork3 {

    static long factorial(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return n;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);

        long factorial = factorial(number);
        long factorial2 = factorial(number2);
        long result = factorial + factorial2;
        System.out.println("The factorial between the numbers " + number + " and " + number2
                + " is " + result);
    }
}
