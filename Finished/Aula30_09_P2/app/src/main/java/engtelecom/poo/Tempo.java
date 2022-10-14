package engtelecom.poo;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    /**
     * @param hora    valor int hora
     * @param minuto  valor int minuto
     * @param segundo valor int segundo
     */
    public Tempo(int hora, int minuto, int segundo) {
        if (checkHora(hora, minuto, segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            this.hora = 0;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    /**
     * @param hora   valor int hora
     * @param minuto valor int minuto
     */
    public Tempo(int hora, int minuto) {
        if (checkHora(hora, minuto, 0)) {
            this.hora = hora;
            this.minuto = minuto;
        } else {
            this.hora = 0;
            this.minuto = 0;
        }
        this.segundo = 0;
    }

    /**
     * Instancia a classe tempo
     * 
     * @param hora valor int hora
     */
    public Tempo(int hora) {
        if (checkHora(hora, 0, 0)) {
            this.hora = hora;
        } else {
            this.hora = 0;
        }
        this.minuto = 0;
        this.segundo = 0;
    }

    /**
     * Instancia a classe tempo
     */
    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    /**
     * Verifica se a construção é valida para a classe tempo
     * 
     * @param horas    valor int horas
     * @param minutos  valor int minutos
     * @param segundos valor int segundos
     * @return true/false
     */
    private boolean checkHora(int horas, int minutos, int segundos) {
        return (horas <= 23 && horas >= 0 && minutos <= 59 && minutos >= 0 && segundos <= 59 && segundos >= 0);
    }

    /**
     * Metodo que define as horas
     * 
     * @param hora valor int hora
     * @return true/false
     */
    public boolean setHora(int hora) {
        if (hora < 24 && hora >= 0) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    /**
     * Metodo que define os minutos
     * 
     * @param minuto valor int minuto
     * @return true/false
     */
    public boolean setMinuto(int minuto) {
        if (minuto <= 59 && minuto >= 0) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    /**
     * Metodo que define os segundos
     * 
     * @param segundo valor int segundo
     * @return true/false
     */
    public boolean setSegundo(int segundo) {
        if (segundo <= 59 && segundo >= 0) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    /**
     * Metodo que retorna as horas em string
     */
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    /**
     * Retorna o valor de horas em segundos
     * 
     * @return long
     */
    public long getSegundosTotais() {
        return (minuto * 60) + (hora * 3600) + segundo;
    }

    /**
     * Retorna a diferenca de tempo entre duas classes
     * 
     * @param relogio classe Tempo
     * @return long
     */
    public long diferencaTempo(Tempo relogio) {
        return this.getSegundosTotais() - relogio.getSegundosTotais();
    }

}
