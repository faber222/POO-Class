package engtelecom.poo.produtos;

import java.util.Arrays;

public class Telefone {
    protected int codigo;
    protected int serialNumber;
    protected String modelo;
    protected String cor;
    protected double peso;
    protected double dimensoes[];
    
    /**
     * @param codigo
     * @param serialNumber
     * @param modelo
     * @param cor
     * @param peso
     * @param dimensoes
     */
    public Telefone(int codigo, int serialNumber, String modelo, String cor, double peso, double[] dimensoes) {
        this.codigo = codigo;
        this.serialNumber = serialNumber;
        this.modelo = modelo;
        this.cor = cor;
        this.peso = peso;
        this.dimensoes = dimensoes;
    }

    public String toString() {
        return "Telefone [codigo=" + codigo + ", serialNumber=" + serialNumber + ", modelo=" + modelo + ", cor=" + cor
                + ", peso=" + peso + ", dimensoes=" + Arrays.toString(dimensoes) + "]";
    }

    public String tocar() {
        return "Trim Trimmmm";
    }

}
