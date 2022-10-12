package engtelecom.poo;

public class Termometro {
    private double max;
    private double min;
    private double atual;
    private char sigla;

    /**
     * Instancia um novo objeto para relogio
     * 
     * @param max   temperatura maxima
     * @param min   temperatura minima
     * @param atual temperatura atual
     */
    public Termometro(double max, double min, double atual) {
        this.max = max;
        this.min = min;
        this.atual = atual;
    }

    /**
     * a temperatura maxima
     * 
     * @return double
     */
    public double getMax(char sigla) {
        return max;
    }

    /**
     * a temperatura minima
     * 
     * @return double
     */
    public double getMin(char sigla) {
        return min;
    }

    /**
     * a temperatura atual
     * 
     * @return double
     */
    public double getAtual(char sigla) {
        return atual;
    }

    /**
     * Imprime a temperatura em celsius
     * 
     * @return double
     */
    public double celsius() {
        return 0;
    }

    /**
     * Imprime a temperatura em fahrenheit
     * 
     * @return double
     */
    public double fahrenheit() {
        return 0;
    }

    /**
     * Imprime a temperatura em kelvin
     * 
     * @return double
     */
    public double kelvin() {
        return 0;
    }

    /**
     * Metodo que retorna a diferenca entre as temperaturas
     * 
     * @param temperatura um objeto da classe Temperatura
     * @param sigla       sigla de cada sistema metrico de temperatura
     * @return double
     */
    public double diferenca(Termometro temperatura, char sigla) {
        return -1;
    }

}
