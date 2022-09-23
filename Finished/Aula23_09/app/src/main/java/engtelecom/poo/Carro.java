package engtelecom.poo;

public class Carro {
    // Atributos
    private double velocidade;
    private String modelo;

    // Métodos
    public void acelerar(double intensidade) {
        if (intensidade > 0) {
            if (this.velocidade <= 100) {
                this.velocidade += intensidade;
                if (this.velocidade > 100) {
                    this.velocidade = 100;
                }
            }
        }
    }

    public String obterModelo() {
        return this.modelo;
    }

    public double obterVelocidade() {
        return this.velocidade;
    }
}
