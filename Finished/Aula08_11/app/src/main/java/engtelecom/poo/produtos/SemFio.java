package engtelecom.poo.produtos;

public class SemFio extends Telefone {
    private double frequencia;
    private int numCanais;
    private double distOpe;

    public SemFio(int codigo, int serialNumber, String modelo, String cor, double peso, double[] dimensoes,
            double frequencia, int numCanais, double distOpe) {
        super(codigo, serialNumber, modelo, cor, peso, dimensoes);
        this.frequencia = frequencia;
        this.numCanais = numCanais;
        this.distOpe = distOpe;
    }

    public String toString() {
        return super.toString() + "SemFio [frequencia=" + frequencia + ", numCanais=" + numCanais + ", distOpe="
                + distOpe + "]";
    }

    /**
     * @param numCanais the numCanais to set
     */
    public void setNumCanais(int numCanais) {
        this.numCanais = numCanais;
    }
    
}
