import java.util.Scanner;

public class HomeWork4 {

    static double factorial(int n) {
        if (n == 0)
            return 1;
        if (n < 0)
            return n;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number[] = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Enter a fact number: ");
            number[i] = keyboard.nextInt();
        }
        for (int i = 0; i < 4; i++) {
            System.out.println(factorial(number[i]));
        }
        keyboard.close();
    }
}
