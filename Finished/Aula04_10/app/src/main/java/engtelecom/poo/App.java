package engtelecom.poo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.sound.sampled.BooleanControl;

// import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        /*
         * Scanner teclado = new Scanner(System.in);
         * 
         * Linha b = new Linha(new int[] { 10, 20 }, new int[] { 30, 20 }, 2, 3);
         * 
         * int e = 0;
         * 
         * do {
         * System.out.print("Entre com a espessura: ");
         * e = teclado.nextInt();
         * } while (e > Linha.ESPESSURA_MAX || e < Linha.ESPESSURA_MIN); // pegar o
         * valor da espessura maxima
         * 
         * Linha a = new Linha(new int[] { 1, 2 }, new int[] { 3, 2 }, 1, e);
         * // a.setEspessura(e);
         */
        Pessoa juca = new Pessoa("juca");
        Pessoa ana = new Pessoa("ana");
        Pessoa aa = new Pessoa("Ana");

        ArrayList<Pessoa> nomes = new ArrayList<>();

        nomes.add(juca);
        nomes.add(ana);
        nomes.add(aa);

        List<String> pessoas = new LinkedList<>();

        pessoas.add("faber");
        pessoas.add("bernardo");

        // igual ao auto& x : de c++
        for (Pessoa x : nomes) {
            System.out.println(x);
        }

        for (String y : pessoas) {
            System.out.println(y);
        }

        // função lambda ->
        nomes.forEach(p -> {
            System.out.println(p);
            System.out.println("faber");
        });

        // operador reference ::
        // a cada rodada, ele passa um elemento como parametro do método
        // ou seja, itera toda a lista nomes
        nomes.forEach(System.out::println);

        Boolean a = pessoas.contains("faber");

        System.out.println("");
        System.out.println(nomes);

        nomes.remove(ana);
        nomes.removeIf(p -> p.getNome().equals("ana"));

    }
}
