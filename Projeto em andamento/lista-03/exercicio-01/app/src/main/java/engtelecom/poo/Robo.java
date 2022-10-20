package engtelecom.poo;

import java.util.List;
import java.util.Random;

public class Robo {
    private static final int MAX = 100;
    private static final int MIN = 0;
    private String id; // hash de identificação do robo
    private String orientacao; // Norte, Sul, Leste, Oeste
    private int tamanhoArea; // tamanho em m² do local
    private int coordenadaX; // coordenada inicial em x
    private int coordenadaY; // coordenada inicial em y
    private int movimentos; // numero de movimentos restantes
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
     * @param movimentos       Inteiro para representar a quantidade de
     *                         movimentos restantes
     * @param unidadesPorTurno Inteiro para representar a quantidade maxima de
     *                         unidades por turno
     */
    public Robo(String id, int tamanhoArea, int coordenadaX, int coordenadaY, String orientacao,
            int movimentos, int unidadesPorTurno) {
        this.id = id;
        this.movimentos = verificaMovimentos(movimentos);

        if (tamanhoArea >= MIN) {
            this.tamanhoArea = tamanhoArea;
        } else {
            this.tamanhoArea = MAX;
        }

        if (verificaOrientacao(orientacao)) {
            this.orientacao = orientacao;
        } else {
            this.orientacao = "Norte";
        }

        if (verificaCoordenada(coordenadaX, coordenadaY)) {
            this.coordenadaX = coordenadaX;
            this.coordenadaY = coordenadaY;
        } else {
            this.orientacao = "Norte";
            Random r = new Random(this.tamanhoArea++);
            Random r2 = new Random(this.tamanhoArea++);
            this.coordenadaX = r.nextInt();
            this.coordenadaY = r2.nextInt();
        }

        if (verificaTurnos(unidadesPorTurno)) {
            this.unidadesPorTurno = unidadesPorTurno;
        } else {
            this.unidadesPorTurno = MAX;
        }

    }

    public int verificaMovimentos(int movimentos) {
        if (movimentos >= MIN && movimentos <= MAX) {
            return movimentos;
        }
        if (movimentos > MAX) {
            return MAX;
        }
        return MIN;
    }

    /**
     * retorna o numero de movimentos ainda restantes
     * 
     * @return the movimentos
     */
    public int getMovimentos() {
        return movimentos;
    }

    /**
     * @return the plano
     */
    public String[] getPlano() {
        return plano;
    }

    /**
     * Função de verificação de strings passadas no construtor da função
     * 
     * @param orientacao String podendo ser "Sul, Norte, Leste, Oeste"
     * @return
     *         True caso a String corresponda a um nome valido,
     *         False caso a String passada seja invalida
     */
    public boolean verificaOrientacao(String orientacao) {
        return (orientacao == "Norte" || orientacao == "Sul" || orientacao == "Leste" || orientacao == "Oeste");
    }

    public boolean verificaCoordenada(int coordenadaX, int coordenadaY) {
        return true;
    }

    public boolean verificaTurnos(int unidadesPorTurno) {
        return true;
    }

    @Override
    public String toString() {
        return "coordenadaX=" + coordenadaX + ", coordenadaY=" + coordenadaY + ", " + orientacao + "";
    }

    public String getCoordenadaAnterior() {
        return "";
    }

    public String girarRobo(char comando) {
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
