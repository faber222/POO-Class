package engtelecom.poo;

public class Contador {
    private int valorAtual;

    public Contador() {
        this.valorAtual = 0;
    }

    public String toString() {
        return "" + this.valorAtual;
    }

    public int getValorAtual() {
        return valorAtual;
    }

    public void setValorAtual(int valorAtual) {
        this.valorAtual = valorAtual;
    }

    public void incrementar() {
        this.valorAtual++;
    }
    
}
