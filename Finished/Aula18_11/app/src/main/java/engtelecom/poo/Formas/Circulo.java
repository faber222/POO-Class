package engtelecom.poo.Formas;

import java.awt.Color;

public class Circulo extends Bidimensional {
    private double raio;

    /**
     * @param inicial
     * @param cor
     * @param corFundo
     * @param raio
     */
    public Circulo(double[] inicial, Color cor, Color corFundo, double raio) {
        super(inicial, cor, corFundo);
        this.raio = raio;
    }

    @Override
    public void desenhar() {
        System.out.println(
                "desenha um circulo com cor: " + this.cor + " e raio: " + this.raio + " e corFundo: " + this.corFundo);
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
