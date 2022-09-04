public class OddNumber {
    public static void main(String[] args) {
        if (args.length > 0) {
            int number[] = new int[2];
            for (int i = 0; i < 2; i++) {
                number[i] = Integer.parseInt(args[i]);
            }
            int x = number[0], y = number[1];
            if (x > y) {
                x = number[1];
                y = number[0];
            }
            for (int i = x; i <= y; i++) {
                if ((i % 2) != 0) {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Nothing to check!");
        }
    }
}
