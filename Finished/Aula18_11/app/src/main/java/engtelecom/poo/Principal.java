package engtelecom.poo;

import java.awt.Color;
import java.util.ArrayList;

import engtelecom.poo.Formas.Circulo;
import engtelecom.poo.Formas.Elipse;
import engtelecom.poo.Formas.FormaGeometrica;
import engtelecom.poo.Formas.Linha;
import engtelecom.poo.Formas.Retangulo;

public class Principal {
    public static void main(String[] args) {
        double[] i = new double[] { 1, 2 };
        double[] f = new double[] { 2, 4 };

        Linha l = new Linha(i, Color.BLACK, f);

        l.desenhar();
        Retangulo r = new Retangulo(i, Color.CYAN, Color.GRAY, 10);
        Circulo c = new Circulo(i, Color.RED, Color.WHITE, 1);
        Elipse e = new Elipse(i, Color.MAGENTA, Color.BLUE, 1, 10, 10);

        ArrayList<FormaGeometrica> formas = new ArrayList<>();

        formas.add(r);
        formas.add(c);
        formas.add(e);

        formas.forEach(fo -> fo.desenhar());
        // polimorfismo
        for (FormaGeometrica fo : formas) {
            fo.desenhar();
        }

    }
}
