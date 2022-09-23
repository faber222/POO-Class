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
        int numberWinner = 0;
        while (numberWinner != number) {
            System.out.print("Enter a number: ");
            numberWinner = keyboard.nextInt();
            System.out.println("Wrong! Try again...");
        }
        System.out.println("You win!");
        keyboard.close();
    }
}
