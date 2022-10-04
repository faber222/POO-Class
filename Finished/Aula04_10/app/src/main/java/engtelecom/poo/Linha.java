package engtelecom.poo;

public class Linha {

    public static final int ESPESSURA_MAX = 10;
    public static final int ESPESSURA_MIN = 0;

    // posicao 0 é o x
    private int[] coordenadaInicial;
    private int[] coordenadaFinal;

    // 0 preto - 7 branco
    private int cor;
    private int espessura; // maximo 10

    public Linha(int[] coordenadaInicial, int[] coordenadaFinal, int cor, int espessura) {
        this.coordenadaInicial = coordenadaInicial;
        this.coordenadaFinal = coordenadaFinal;
        this.cor = cor;
        this.espessura = espessura;
    }

    public void setEspessura(int espessura) {
        this.espessura = ((espessura <= ESPESSURA_MAX) && (espessura >= ESPESSURA_MIN)) ? espessura : this.espessura;
    }

    public boolean maior(Linha outra) {
        int tamanhoX = this.coordenadaFinal[0] - this.coordenadaInicial[0];
        int tamanhoY = this.coordenadaFinal[1] - this.coordenadaInicial[1];

        int tamanhoOutraX = outra.coordenadaFinal[0] - outra.coordenadaInicial[0];
        int tamanhoOutraY = outra.coordenadaFinal[1] - outra.coordenadaInicial[1];

        if (tamanhoX > tamanhoOutraX || tamanhoY > tamanhoOutraY) {
            return true;
        }
        return false;

    }

}
