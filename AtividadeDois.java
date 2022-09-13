import java.util.Random;

public class AtividadeDois {

    public static void main(String[] args) {
        char[][] tabuleiro = new char[9][9];
        int[][] minas = new int[9][9];
        int linha = 0, coluna = 0;
        boolean sorteado;
        Random random = new Random();

        for (int i = 0; i < minas.length; i++) {
            for (int j = 0; j < minas.length; j++) {
                minas[i][j] = 0;
            }
        }

        for (int i = 0; i < 10; i++) {
            do {
                linha = random.nextInt(8) + 1;
                coluna = random.nextInt(8) + 1;
                if (minas[linha][coluna] == -1) {
                    sorteado = true;
                } else {
                    sorteado = false;
                }
            } while (sorteado);
            minas[linha][coluna] = -1;
        }
        exibe(tabuleiro, minas, linha, coluna);
    }

    public static void exibe(char[][] tabuleiro, int[][] minas, int linha, int coluna) {

        for (int i = 1; i < minas.length; i++) {
            for (int j = 1; j < minas.length; j++) {
                tabuleiro[i][j] = '.';
            }
        }

        preencheDicas(minas);

        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (minas[i][j] == -1) {
                    tabuleiro[i][j] = '*';
                }
            }
        }

        for (int i = 1; i < minas.length - 1; i++) {
            for (int j = 1; j < minas.length - 1; j++) {
                abrirVizinhas(minas, tabuleiro, i, j);
            }
        }

        for (int linha1 = 8; linha1 > 0; linha1--) {
            for (int coluna1 = 1; coluna1 < 9; coluna1++) {
                System.out.print(tabuleiro[linha1][coluna1]);
            }
            System.out.println();
        }
    }

    public static void abrirVizinhas(int[][] minas, char[][] tabuleiro, int linha, int coluna) {
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if ((minas[linha + i][coluna + j] != -1)) {
                    tabuleiro[linha + i][coluna + j] = Character.forDigit(minas[linha + i][coluna + j], 10);
                }
            }
        }

    }

    public static void preencheDicas(int[][] minas) {
        for (int line = 1; line < 8; line++) {
            for (int column = 1; column < 8; column++) {
                for (int i = -1; i <= 1; i++) {
                    for (int j = -1; j <= 1; j++) {
                        if (minas[line][column] != -1) {
                            if (minas[line + i][column + j] == -1) {
                                minas[line][column]++;
                            }
                        }
                    }
                }
            }
        }
    }
}
