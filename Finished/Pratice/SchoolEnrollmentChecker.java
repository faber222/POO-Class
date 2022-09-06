public class SchoolEnrollmentChecker {

    public static void main(String[] args) {
        if (args.length > 0) {
            long enrollment = Long.parseLong(args[0]);
            
            if (enrollment == 10) {
                
            } else {
                System.out.println("Is not a valid enrollment!");
            }

        } else
            System.out.println("Nothing to check! Pls, enter a enrollment on args.");

    }
}
