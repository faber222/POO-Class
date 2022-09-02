import java.util.Scanner;

public class HomeWork3 {

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
        System.out.print("Enter a factorial number: ");
        float number = keyboard.nextFloat();

        System.out.print("Enter a second factorial number: ");
        float number2 = keyboard.nextFloat();

        float factorial = factorial(number);
        float factorial2 = factorial(number2);
        float result = factorial + factorial2;
        System.out.println("The factorial between the numbers " + number + " and " + number2
                + " is " + result);
        keyboard.close();
    }
}
