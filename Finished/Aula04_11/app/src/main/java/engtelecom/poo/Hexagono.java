package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class Hexagono {

    // Não iremos tratar as possíveis exceções de execução
    public static void main(String[] args) throws Exception {
        Draw desenho = new Draw();
        // dimensão da área de desenho (canvas)
        int dimensao = 800;
        desenho.setXscale(0, 800);
        desenho.setYscale(0, 800);
        // Toda ação de desenho acontecerá em um buffer secundário e este só será visto
        // depois que for invocado o método show()
        desenho.enableDoubleBuffering();

        // determina a proporção que será usada para desenhar todos os elementos
        double fator = 200;

        // Desenhando grade quadriculada
        int grade = (int) fator / 10;
        desenho.setPenColor(desenho.DARK_GRAY);
        for (int i = 0; i <= dimensao; i += grade)
            desenho.line(i, 0, i, dimensao);
        for (int j = 0; j <= dimensao; j += grade)
            desenho.line(0, j, dimensao, j);

        double xInicial = 300;
        double yInicial = 400;

        // ---------------------------------------- //
        // Montando vetores com os pontos em X e em Y para desenhar um segmento
        // horizontal
        yInicial = 180;
        double[] xHorizontal = { 0.1 * fator + xInicial, 0.2 * fator + xInicial, 1.0 * fator + xInicial,
                1.1 * fator + xInicial, 1.0 * fator + xInicial, 0.2 * fator + xInicial };
        double[] yHorizontal = { 0.2 * fator + yInicial, 0.3 * fator + yInicial, 0.3 * fator + yInicial,
                0.2 * fator + yInicial, 0.1 * fator + yInicial, 0.1 * fator + yInicial };

        desenho.setPenColor(desenho.RED);
        desenho.filledPolygon(xHorizontal, yHorizontal);
        // ---------------------------------------- //

        // ---------------------------------------- //
        // Montando vetores com os pontos em X e em Y para desenhar um segmento vertical
        yInicial = 200;
        double[] xVertical = { 0.1 * fator + xInicial, 0.2 * fator + xInicial, 0.2 * fator + xInicial,
                0.1 * fator + xInicial, 0 * fator + xInicial, 0 * fator + xInicial };
        double[] yVertical = { 0.2 * fator + yInicial, 0.3 * fator + yInicial, 1.0 * fator + yInicial,
                1.1 * fator + yInicial, 1.0 * fator + yInicial, 0.3 * fator + yInicial };

        desenho.setPenColor(desenho.GRAY);
        desenho.filledPolygon(xVertical, yVertical);

        // Desenhando outro segmento vertical com um espaço de 200 pixels em X
        for (int i = 0; i < xVertical.length; i++) {
            xVertical[i] += 200;
        }
        desenho.filledPolygon(xVertical, yVertical);
        // ---------------------------------------- //

        // Trocando o buffer para exibir o que foi desenhado
        desenho.show();
    } // fim do main
}// fim da classe