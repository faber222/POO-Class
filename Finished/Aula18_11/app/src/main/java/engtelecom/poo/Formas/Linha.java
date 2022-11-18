package engtelecom.poo.Formas;

import java.awt.Color;

public class Linha extends FormaGeometrica {

    private double[] fim = new double[2];

    /**
     * @param inicial
     * @param cor
     * @param fim
     */
    public Linha(double[] inicial, Color cor, double[] fim) {
        super(inicial, cor);
        this.fim = fim;
    }

    @Override
    public void desenhar() {
        System.out.println("desenha linha com cor: " + this.cor);
    }

}
