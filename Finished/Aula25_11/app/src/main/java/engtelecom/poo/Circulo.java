package engtelecom.poo;

import edu.princeton.cs.algs4.Draw;

public class Circulo {
    private double x;
    private double y;
    private double r;
    private Cores cor; // VERDE, PRETO, AZUL1

    /**
     * @param x
     * @param y
     */
    public Circulo(double x, double y, double r, Cores cor) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.cor = cor;
    }

    /**
     * 
     * @return
     */
    public double getR() {
        return this.r;
    }

    /**
     * 
     * @param r
     */
    public void setR(int r) {
        this.r = r;
    }

    public void desenhar(Draw d) {
        // switch (this.cor) {
        // case AZUL:
        // d.setPenColor(Draw.BLUE);
        // break;
        // case VERDE:
        // d.setPenColor(Draw.GREEN);
        // break;
        // default:
        // d.setPenColor(Draw.BLACK);
        // break;
        // }

        d.setPenColor(cor.cores);
        d.filledCircle(this.x, this.y, this.r);
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

}
