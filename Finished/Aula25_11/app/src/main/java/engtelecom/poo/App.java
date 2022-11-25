package engtelecom.poo;

import java.awt.Color;

import org.checkerframework.checker.units.qual.C;

import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class App implements DrawListener {
    private Draw desenho;

    public App() {
        this.desenho = new Draw();
        this.desenho.setXscale(0, 800);
        this.desenho.setYscale(0, 800);
        this.desenho.enableDoubleBuffering();

        this.desenho.addListener(this);
    }

    public void desenharTela() {
        Circulo c = new Circulo(400, 400, 100, Cores.AZUL);
        this.desenho.clear();
        this.desenho.setPenColor(Color.RED);
        c.desenhar(desenho);
        this.desenho.show();
    }

    public static void main(String[] args) {
        App app = new App();
        Circulo circulo = new Circulo(400, 400, 100, Cores.AZUL);
        // app.desenharTela();
        Caixa c = new Caixa();
        String s = "Olá Mundo";
        c.set(s);
        String outra = (String) c.getDado();

        CaixaDois<Circulo> caixaDois = new CaixaDois<>();
        caixaDois.set(circulo);

        Circulo outroCirculo = (Circulo) caixaDois.getDado();
        System.out.println(outra);
    }

    @Override
    public void mousePressed(double x, double y) {
        Circulo c = new Circulo(x, y, 100, Cores.AZUL);
        c.desenhar(desenho);
        this.desenho.show();
    }

    @Override
    public void mouseDragged(double x, double y) {
        Circulo c = new Circulo(x, y, 10, Cores.VERDE);
        c.desenhar(desenho);
        this.desenho.show();

    }

    @Override
    public void mouseReleased(double x, double y) {
        Circulo c = new Circulo(x, y, 10, Cores.PRETO);
        c.desenhar(desenho);
        this.desenho.show();
    }

    @Override
    public void mouseClicked(double x, double y) {

    }

    @Override
    public void keyTyped(char c) {

    }

    @Override
    public void keyPressed(int keycode) {

    }

    @Override
    public void keyReleased(int keycode) {

    }
}
