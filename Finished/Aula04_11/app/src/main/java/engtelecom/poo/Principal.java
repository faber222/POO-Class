package engtelecom.poo;

import java.awt.Color;
import java.awt.Font;

import edu.princeton.cs.algs4.Draw;

public class Principal {
    private Draw desenho;

    public Principal() {
        this.desenho = new Draw();
        this.desenho.setXscale(0, 800);
        this.desenho.setYscale(0, 800);
        this.desenho.enableDoubleBuffering();
    }

    public void desenhaGrade() {
        int fator = 200;
        int grade = fator / 10;
        this.desenho.setPenColor(Draw.BLACK);
        for (int i = 0; i < 800; i += grade) {
            desenho.line(i, 0, i, 800);
        }

        for (int i = 0; i < 800; i += grade) {
            desenho.line(0, i, 800, i);
        }
    }

    public void desenhaTriangulo() {
        this.desenho.setPenColor(Draw.RED);
        double[] coordenadaX = {100,400,700};
        double[] coordenadaY = {100,500,100};
        this.desenho.filledPolygon(coordenadaX, coordenadaY);
    }

    public void desenhar() throws InterruptedException {
        Font font = this.desenho.getFont().deriveFont(1600);
        this.desenho.setFont(font);

        // limpando a tela
        for (int i = 0; i < 401; i++) {
            this.desenho.clear();

            this.desenhaGrade();
            this.desenhaTriangulo();
            this.desenho.setPenColor(Draw.BLACK);
            this.desenho.text(400, 400, "" + i);
            this.desenho.rectangle(400, 400, i, i);
            this.desenho.show();
            Thread.sleep(10);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Principal app = new Principal();
        app.desenhar();
    }
}
