package engetelecom.poo;

public class Carro {
    private int velocidadeAtual;
    private Motor propulsor;

    public Carro(Motor propulsor) {
        this.propulsor = propulsor;
        this.velocidadeAtual = 0;
    }

    public int acelerar(int intesidade) {
        return -1;
    }

}
