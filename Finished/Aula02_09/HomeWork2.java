import java.util.Scanner;

public class HomeWork2 {
    static float factorial(float n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return n;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a fact number: ");
        float number = keyboard.nextFloat();

        float factorial;
        factorial = factorial(number);
        System.out.println("The factorial of " + number + " is " + factorial);
        keyboard.close();
    }
}
