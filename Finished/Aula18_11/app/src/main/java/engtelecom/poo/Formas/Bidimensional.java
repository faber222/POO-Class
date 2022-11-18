package engtelecom.poo.Formas;

import java.awt.Color;

public abstract class Bidimensional extends FormaGeometrica {
    protected Color corFundo;

    public abstract double calcArea();

    public abstract double calcPerimetro();

    /**
     * @param inicial
     * @param cor
     * @param corFundo
     */
    public Bidimensional(double[] inicial, Color cor, Color corFundo) {
        super(inicial, cor);
        this.corFundo = corFundo;
    }

}
