public class SchoolEnrollmentChecker {

    public static boolean divCheck(long x, long[] y) {
        long DV = (((y[9] * 10 + y[8] * 9 + y[7] * 8 + y[6] * 7 + y[5] * 6 + y[4] * 5 + y[3] * 4
                + y[2] * 3 + y[1] * 2) * 10) % 11);
        System.out.println("DV = " + DV + ", must be " + y[0]);
        return DV == x;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            long enrollment = Long.parseLong(args[0]);
            long x = enrollment;
            long[] vet = new long[10];
            for (int i = 0; i < 10; i++) {
                vet[i] = x % 10;
                x = x / 10;
            }
            boolean checkDv = divCheck(vet[0], vet);

            if (checkDv != true) {
                System.out.println("Is not a valid enrollment!");
            } else {
                System.out.println("Is a valid enrollement!");
            }

        } else
            System.out.println("Nothing to check! Pls, enter a enrollment on args.");

    }
}
