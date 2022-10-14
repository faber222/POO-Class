package engtelecom.poo;

public class Termometro {
    private double max;
    private double min;
    private double atual;
    private char escala;

    /**
     * Instancia um novo objeto para relogio
     * 
     * @param max   temperatura maxima
     * @param min   temperatura minima
     * @param atual temperatura atual
     */
    public Termometro(double max, double min, double atual) {
        if (max > min && atual < max && atual > min) {
            this.max = max;
            this.min = min;
            this.atual = atual;
        } else {
            this.max = 100;
            this.min = 0;
            this.atual = 32;
        }
        this.escala = 'C';
    }

    /**
     * a temperatura maxima
     * 
     * @param sigla char de escala de temperatura
     * @return double
     */
    public double getMax(char sigla) {
        double maxTemp = 0;
        switch (sigla) {
            case 'K':
                maxTemp = celsiusKelvin(this.max);
                break;
            case 'F':
                maxTemp = celsiusFahrenheit(this.max);
                break;
            default:
                maxTemp = this.max;
                break;
        }
        return maxTemp;
    }

    /**
     * a temperatura minima
     * 
     * @param sigla char de escala de temperatura
     * @return double
     */
    public double getMin(char sigla) {
        double minTemp = 0;
        switch (sigla) {
            case 'K':
                minTemp = celsiusKelvin(this.min);
                break;
            case 'F':
                minTemp = celsiusFahrenheit(this.min);
                break;
            default:
                minTemp = this.min;
                break;
        }
        return minTemp;
    }

    /**
     * a temperatura atual
     * 
     * @param sigla char de escala de temperatura
     * @return double
     */
    public double getAtual(char sigla) {
        double temp = 0;
        switch (sigla) {
            case 'K':
                temp = celsiusKelvin(this.atual);
                break;
            case 'F':
                temp = celsiusFahrenheit(this.atual);
                break;
            default:
                temp = this.atual;
                break;
        }
        return temp;
    }

    /**
     * Converte de celsius para fahrenheit
     * 
     * @param valorTemperatura um double para temperatura
     * @return double
     */
    private double celsiusFahrenheit(double valorTemperatura) {
        return (valorTemperatura * 9 / 5) + 32;
    }

    /**
     * Converte de celsius para kelvin
     * 
     * @param valorTemperatura um double para temperatura
     * @return double
     */
    private double celsiusKelvin(double valorTemperatura) {
        return (valorTemperatura + 273.15);
    }

    /**
     * Metodo que retorna a diferenca entre as temperaturas
     * 
     * @param temperatura um objeto da classe Temperatura
     * @param sigla       sigla de cada sistema metrico de temperatura
     * @return double
     */
    public double diferenca(Termometro temperatura, char sigla) {
        double diferencaTemperatura;
        switch (sigla) {
            case 'F':
                diferencaTemperatura = celsiusFahrenheit(this.atual) - celsiusFahrenheit(temperatura.atual);
                break;
            case 'K':
                diferencaTemperatura = celsiusKelvin(this.atual) - celsiusKelvin(temperatura.atual);
                break;
            default:
                diferencaTemperatura = this.atual - temperatura.atual;
                break;
        }
        return diferencaTemperatura;
    }

}
