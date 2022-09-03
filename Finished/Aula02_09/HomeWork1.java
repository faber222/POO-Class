import java.util.Scanner;

public class HomeWork1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();

        System.out.print("Enter the year you were born: ");
        int year = keyboard.nextInt();

        System.out.print("Enter the current year: ");
        int currentYear = keyboard.nextInt();

        System.out.println(name + " has " + yearCalc(year, currentYear));
        keyboard.close();
    }

    public static int yearCalc(int year, int currentYear) {
        return currentYear - year;
    }
}
