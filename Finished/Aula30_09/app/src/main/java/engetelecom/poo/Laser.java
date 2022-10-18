package engetelecom.poo;

public class Laser {
    private final int PONTENCIA_MAX = 100;
    private final int PORTENCIA_MIN = 100;
    private final String[] cores = { "Verde", "Azul", "Vermelho" };
    private final int TEMPO_ARREFECIMENTO; // 1 segundo
    private final int MAX_DISPARO; // por segundo
    private final String COR;

    private int inicioDoDisparo = 0;
    private int fimDoDisparo = 0;
    private int totalDeDisparo = 0;
    private int potencia;

    /**
     * @param tEMPO_ARREFECIMENTO
     * @param mAX_DISPARO
     * @param cor
     * @param potencia
     */
    public Laser(int tEMPO_ARREFECIMENTO, int mAX_DISPARO, String cor, int potencia) {
        TEMPO_ARREFECIMENTO = tEMPO_ARREFECIMENTO;
        MAX_DISPARO = mAX_DISPARO;
        this.COR = cor;
        this.potencia = potencia;
    }

    public String disparar() {
        return "disparando na cor " + this.COR;
    }

}
