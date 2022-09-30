package engtelecom.poo;

public class Tempo {
    private int hora;
    private int minuto;
    private int segundo;

    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Tempo(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }

    public Tempo(int hora) {
        this.hora = hora;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Tempo() {
        this.hora = 0;
        this.minuto = 0;
        this.segundo = 0;
    }

    public boolean setHora(int hora) {
        if (hora < 24 && hora >= 0) {
            this.hora = hora;
            return true;
        }
        return false;
    }

    public boolean setMinuto(int minuto) {
        if (minuto <= 59 && minuto >= 0) {
            this.minuto = minuto;
            return true;
        }
        return false;
    }

    public boolean setSegundo(int segundo) {
        if (segundo <= 59 && segundo >= 0) {
            this.segundo = segundo;
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.hora, this.minuto, this.segundo);
    }

    public long getSegundosTotais() {
        return (minuto * 60) + (hora * 3600) + segundo;
    }

    public long diferencaTempo(Tempo valor) {
        return this.getSegundosTotais() - valor.getSegundosTotais();
    }

}
