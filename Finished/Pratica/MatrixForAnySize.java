import java.util.Scanner;

public class MatrixForAnySize {
    public static int matrixValues(int x, int y) {
        Scanner keyboard2 = new Scanner(System.in);
        System.out.print("Enter the matrix value: [" + x + "]" + "[" + y + "]:");
        int matrix = keyboard2.nextInt();
        keyboard2.nextLine();
        return matrix;
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the value for x: ");
        int x = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Enter the value for y: ");
        int y = keyboard.nextInt();
        keyboard.nextLine();

        int[][] vet = new int[x][y];

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                vet[i][j] = matrixValues(i, j);
                System.out.println(vet[i][j]);
            }
        }
    }
}
