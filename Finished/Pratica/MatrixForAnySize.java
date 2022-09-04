import java.util.Scanner;

public class MatrixForAnySize {
    public static String matrixValues(int x, int y) {
        String aster = "*";
        if (x == 0 || y == 0) {
            return aster;
        }
        if ((x % y) == 0 || (y % x) == 0) {
            return aster;
        } else {
            return " ";
        }
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the value for x: ");
        int x = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter the value for y: ");
        int y = keyboard.nextInt();
        keyboard.nextLine();

        String[][] vet = new String[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                vet[i][j] = matrixValues(i, j);
                System.out.print("[" + i + "]" + "[" + j + "]:");
                System.out.println(vet[i][j]);
            }
        }
    }
}
