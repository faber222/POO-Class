package engetelecom.poo;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        BuzzLightYear brinquedo1 = new BuzzLightYear();
        BuzzLightYear brinquedo2 = new BuzzLightYear();
        BuzzLightYear brinquedo3 = new BuzzLightYear();
        int nextNumber = -2;
        Scanner keyboard = new Scanner(System.in);
        while (nextNumber != -1) {
            System.out.println("O que deseja fazer?");
            System.out.println("0 - falas");
            System.out.println("1 - asas");
            System.out.println("2 - capacete");
            System.out.println("3 - acao");
            System.out.println("4 - laser");
            System.out.println("5 - voltar");
            nextNumber = keyboard.nextInt();
            switch (nextNumber) {
                case 1:
                    brinquedo1.getAsa();
                    break;
                case 2:
                    brinquedo1.getCapacete();
                    break;
                case 3:
                    brinquedo1.getAcao();
                    break;
                case 4:
                    brinquedo1.getLaser();
                    break;
                case 0:
                    brinquedo1.getFala();
                    break;
                case 5:
                    nextNumber = -1;
                    break;

                default:
                    nextNumber = -1;
                    break;
            }
        }
        keyboard.close();

    }
}
