package engtelecom.poo.Formas;

import java.awt.Color;

// não pode ser instanciada
public abstract class FormaGeometrica {
    protected double[] inicial = new double[2];
    protected Color cor;

    /**
     * @param inicial
     * @param cor
     */
    public FormaGeometrica(double[] inicial, Color cor) {
        this.inicial = inicial;
        this.cor = cor;
    }

    // metodo abstract não implementa nada, fica a cargo da classe filho
    public abstract void desenhar();
}
