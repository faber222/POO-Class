import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(11);
        if (number == 0) {
            number++;
        }

        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            int numberWinner = keyboard.nextInt();
            if (numberWinner == number) {
                System.out.println("You win!");
                break;
            }
            System.out.println("Wrong! Try again...");

        }
        keyboard.close();
    }
}
