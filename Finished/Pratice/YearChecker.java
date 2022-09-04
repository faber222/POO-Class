public abstract class YearChecker {
    public static void main(String[] args) {
        if (args.length > 0) {
            int year = Integer.parseInt(args[0]);
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                System.out.println("It's a leap year " + year);
            } else {
                System.out.println("It's not a leap year " + year);
            }
        } else {
            System.out.println("Nothing to check!");
        }

    }
}
