package engtelecom.poo;

public class Carro {
    // Atributos
    private double velocidade;
    private String modelo;

    // metodo contrustor 
    public Carro(double velocidade, String modelo) {
        this.velocidade = velocidade;
        this.modelo = modelo;
    }

    // metodo construtor padrão
    public Carro() {
        this.modelo = "fusca";
        this.setVelocidade(10);
    }

    public String toString() {
        return "Carro " + modelo + ", velocidade: " + velocidade;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    ////////////////////////////////////////////////
    ////////////////////////////////////////////////

    // // Métodos
    // public void acelerar(double intensidade) {
    // if (intensidade > 0) {
    // if (this.getVelocidade() <= 100) {
    // this.setVelocidade(this.getVelocidade() + intensidade);
    // if (this.getVelocidade() > 100) {
    // this.setVelocidade(100);
    // }
    // }
    // }
    // }

    // /**
    // * @return the modelo
    // */
    // public String getModelo() {
    // return modelo;
    // }

    // /**
    // * @param modelo the modelo to set
    // */
    // public void setModelo(String modelo) {
    // this.modelo = modelo;
    // }

    // /**
    // * @return the velocidade
    // */
    // public double getVelocidade() {
    // return velocidade;
    // }

    // /**
    // * @param velocidade the velocidade to set
    // */
    // public void setVelocidade(double velocidade) {
    // this.velocidade = velocidade;
    // }

    // public String obterModelo() {
    // return this.getModelo();
    // }

    // public double obterVelocidade() {
    // return this.getVelocidade();
    // }
}
