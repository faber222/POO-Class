package engtelecom.poo;

import java.util.List;

public class Robo {
    private static final int MAX = 100;
    private static final int MIN = 0;
    private String id; // hash de identificação do robo
    private String orientacao; // Norte, Sul, Leste, Oeste
    private int tamanhoArea; // tamanho em m² do local
    private int coordenadaX; // coordenada inicial em x
    private int coordenadaY; // coordenada inicial em y
    private int maxMovimentos; // numero de movimentos restantes
    private int unidadesPorTurno; // maximo de movimentos por turno

    private String[] plano; // plano de exploração do robo

    /**
     * Ao instanciar um objeto dessa classe, deve-se indicar o identificador único
     * do robô (uma cadeia de caracteres), o tamanho da área a ser explorada
     * (obrigatoriamente um quadrado, ou seja m²), a coordenada inicial (x,y) do
     * robô dentro desta área, para onde está apontando sua frente (Norte, Sul,
     * Leste ou Oeste), a quantidade de movimentos que poderá fazer antes de acabar
     * sua bateria e um inteiro para representar quantas unidades irá
     * caminhar quando for solicitado que se movimente.
     * 
     * @param id               String de identificação do robo
     * @param orientacao       String para representar posicao
     * @param tamanhoArea      inteiro para representar o quadrado, deve-se
     *                         pensar em m²
     * @param coordenadaX      Inteiro para representar coordenada inicial x
     * @param coordenadaY      Inteiro para representar coordenada inicial y
     * @param maxMovimentos    Inteiro para representar a quantidade de
     *                         movimentos restantes
     * @param unidadesPorTurno Inteiro para representar a quantidade maxima de
     *                         unidades por turno
     */
    public Robo(String id, int tamanhoArea, int coordenadaX, int coordenadaY, String orientacao,
            int maxMovimentos, int unidadesPorTurno) {
        this.maxMovimentos = verificaMovimentos(maxMovimentos);

        if (tamanhoArea >= MIN) {
            this.tamanhoArea = tamanhoArea;
        }

        if (verificaOrientacao(orientacao)) {
            this.orientacao = orientacao;
        } else {
            this.orientacao = "Norte";
        }

        this.id = id;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.unidadesPorTurno = unidadesPorTurno;
    }

    private int verificaMovimentos(int maxMovimentos) {
        if (maxMovimentos >= MIN && maxMovimentos <= MAX) {
            return maxMovimentos;
        }
        if (maxMovimentos > MAX) {
            return MAX;
        }
        return MIN;
    }

    /**
     * @return the maxMovimentos
     */
    public int getMaxMovimentos() {
        return maxMovimentos;
    }

    private boolean verificaOrientacao(String orientacao) {
        return (orientacao == "Norte" || orientacao == "Sul" || orientacao == "Leste" || orientacao == "Oeste");
    }

    private boolean verificaCoordenada(int coordenadaX, int coordenadaY) {
        return true;
    }

    private boolean verificaTurnos(int unidadesPorTurno) {
        return true;
    }

    @Override
    public String toString() {
        return "coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", " + orientacao + "";
    }

    public String getCoordenadaAnterior() {
        return "";
    }

    public String girarRobo() {
        return "";
    }

    public boolean moverRobo() {
        return true;
    }

    /**
     * 
     * @param planoRobo String para plano de exploração
     * @return true/false
     */
    public boolean carregaPlanos(String planoRobo) {
        this.plano = planoRobo.split("");
        return true;
    }

    public boolean executaPlano() {
        return true;
    }

}
