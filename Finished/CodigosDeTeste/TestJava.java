public class TestJava {

    public static void traverseString(String str) {
        // Split str around matches of empty string ""
        String[] substrings = str.split("");
        int[] number = new int[substrings.length];
        int i = 0;
        for (String ch : substrings) {
            number[i] = Integer.parseInt(ch);
            System.out.print(ch + " ");
            i++;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        long x = 1820012344;
        String iterar = x + "";
        traverseString(iterar);
    }
}
