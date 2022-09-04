import java.util.Scanner;

public class DigVer {
    public static void main(String[] args) {
        int[] digito = new int[10];
        for (int i = 0; i < digito.length; i++) {
            Scanner keyboard = new Scanner(System.in);
            System.out.print("value" + (i + 1) + ": ");
            digito[i] = keyboard.nextInt();
            keyboard.close();
        }
        // 1710009012
        //
        int DV = (((digito[0] * 10 + digito[1] * 9 + digito[2] * 8 + digito[3] * 7 + digito[4] * 6
                + digito[5] * 5 + digito[6] * 4 + digito[7] * 3 + digito[8] * 2) * 10) % 11);
        System.out.println(DV);
        for (Integer show : digito) {
            System.out.print(show);
        }

    }
}
