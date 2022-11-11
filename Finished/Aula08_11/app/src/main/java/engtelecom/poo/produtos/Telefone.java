package engtelecom.poo.produtos;

import java.util.Arrays;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Arrays.hashCode(dimensoes);
        result = prime * result + Objects.hash(codigo, serialNumber, modelo, cor, peso);
        return result;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof Telefone))
            return false;
        Telefone other = (Telefone) obj;
        return codigo == other.codigo && serialNumber == other.serialNumber && Objects.equals(modelo, other.modelo)
                && Objects.equals(cor, other.cor)
                && Double.doubleToLongBits(peso) == Double.doubleToLongBits(other.peso)
                && Arrays.equals(dimensoes, other.dimensoes);
    }

    public String toString() {
        return "Telefone [codigo=" + codigo + ", serialNumber=" + serialNumber + ", modelo=" + modelo + ", cor=" + cor
                + ", peso=" + peso + ", dimensoes=" + Arrays.toString(dimensoes) + "]";
    }

    public String tocar() {
        return "Trim Trimmmm";
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the serialNumber
     */
    public int getSerialNumber() {
        return serialNumber;
    }

    /**
     * @param serialNumber the serialNumber to set
     */
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the cor
     */
    public String getCor() {
        return cor;
    }

    /**
     * @param cor the cor to set
     */
    public void setCor(String cor) {
        this.cor = cor;
    }

    /**
     * @return the peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * @return the dimensoes
     */
    public double[] getDimensoes() {
        return dimensoes;
    }

    /**
     * @param dimensoes the dimensoes to set
     */
    public void setDimensoes(double[] dimensoes) {
        this.dimensoes = dimensoes;
    }

    

}
