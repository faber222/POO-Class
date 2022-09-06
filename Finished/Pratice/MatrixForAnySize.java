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
        if (args.length > 0) {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            String[][] vet = new String[x][y];

            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    vet[i][j] = matrixValues(i, j);
                    // System.out.print("[" + i + "]" + "[" + j + "]:");
                    System.out.print(vet[i][j]);
                }
                System.out.println("");
            }
        }

    }
}
