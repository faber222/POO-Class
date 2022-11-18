package engtelecom.poo.Formas;

import java.awt.Color;

public class Elipse extends Bidimensional {
    private double menor;
    private double maior;
    private double foco;

    /**
     * @param inicial
     * @param cor
     * @param corFundo
     * @param menor
     * @param maior
     * @param foco
     */
    public Elipse(double[] inicial, Color cor, Color corFundo, double menor, double maior, double foco) {
        super(inicial, cor, corFundo);
        this.menor = menor;
        this.maior = maior;
        this.foco = foco;
    }

    @Override
    public void desenhar() {
        System.out.println("desenha uma elipse com cor: " + this.cor + " e corFundo: " + this.corFundo);
        System.out.println("desenha uma elipse com tamanhos maior: " + this.maior + " + menor: " + this.menor);
    }

    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public double calcPerimetro() {
        return 0;
    }

}
