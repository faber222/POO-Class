package engtelecom.poo.Formas;

import java.awt.Color;

public class Retangulo extends Bidimensional {
    private double dimensao;

    /**
     * @param inicial
     * @param cor
     * @param corFundo
     * @param dimensao
     */
    public Retangulo(double[] inicial, Color cor, Color corFundo, double dimensao) {
        super(inicial, cor, corFundo);
        this.dimensao = dimensao;
    }

    @Override
    public void desenhar() {
        System.out.println("desenha um retangulo com cor: " + this.cor + " e corFundo: " + this.corFundo);
    }

    @Override
    public double calcArea() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double calcPerimetro() {
        // TODO Auto-generated method stub
        return 0;
    }

}
