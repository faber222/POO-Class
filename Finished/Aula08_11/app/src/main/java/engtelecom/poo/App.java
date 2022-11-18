package engtelecom.poo;

import engtelecom.poo.produtos.SemFio;
import engtelecom.poo.produtos.Telefone;

public class App {
    public static void main(String[] args) {
        Telefone banana = new Telefone(1010, 9999, "samsung-1", "azulCobalto",
                150, new double[] { 10, 20 });

        SemFio uva = new SemFio(10101010, 101010, "samsung", "azul",
                150, new double[] { 10, 20 }, 90, 2, 100);
        System.out.println(uva.toString());

        Telefone caju = uva;

        Telefone a = new Telefone(0, 0, null, null, 0, null);
        Telefone b = new Telefone(0, 0, null, null, 0, null);

        Telefone c = a;

        if (a.equals(b)) {
            System.out.println("a btelefones iguais");
        }

        if (a == c) {
            System.out.println("a cString iguais");
        }

        // // usado para acessar os metodos de SemFio
        // ((SemFio) caju).setNumCanais(10);
        // // usado para armazenar um telefone dentro de sem fio, igual a int x = (int) e
        // SemFio manga = (SemFio) caju;
        // // não vai funcionar devido a ser um telefone puro
        // SemFio mamao = (SemFio) banana;

    }
}
