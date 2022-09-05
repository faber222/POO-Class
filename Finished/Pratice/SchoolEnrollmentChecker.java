public class SchoolEnrollmentChecker {

    public static boolean divCheck(int x, int[] y) {
        int DV = (((y[0] * 10 + y[1] * 9 + y[2] * 8 + y[3] * 7 + y[4] * 6 + y[5] * 5 + y[6] * 4
                + y[7] * 3 + y[8] * 2) * 10) % 11);
        System.out.println("DV = " + DV + ", must be " + y[9]);
        return DV == x;
    }

    public static boolean zeroCheck(int[] y) {
        System.out.println("y[3] e y[4] = " + y[3] + ", must be 0");
        return (y[3] == 0 && y[4] == 0);
    }

    public static boolean semesterCheck(int[] y) {
        System.out.println("semester = " + y[2] + ", must be 1 or 2");
        return (y[2] == 1 || y[2] == 2);
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            long enrollment = Long.parseLong(args[0]);
            String iterar = enrollment + "";
            String[] substrings = iterar.split("");
            int[] digit = new int[substrings.length];
            if (substrings.length == 10) {
                int i = 0;
                for (String ch : substrings) {
                    digit[i] = Integer.parseInt(ch);
                    i++;
                }
                boolean checkDv = divCheck(digit[9], digit);
                boolean zero = zeroCheck(digit);
                boolean semester = semesterCheck(digit);
                System.out.println(checkDv + " checkDv, " + zero + " zero, " + semester + " semester");
                if (checkDv != true || zero != true || semester != true) {
                    System.out.println("Is not a valid enrollment!");
                } else {
                    System.out.println("Is a valid enrollement!");
                }
            } else {
                System.out.println("Is not a valid enrollment!");
            }

        } else
            System.out.println("Nothing to check! Pls, enter a enrollment on args.");

    }
}
