package engtelecom.poo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class App {
    public void sobreEscrever() {
        File arq = new File("saida.txt");
        // usando o FileWriter com new FileWriter(arq, true), vai concatenar e não
        // sobreescrever
        try (FileWriter fileWriter = new FileWriter(arq, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write("Ola mundo\n");
        } catch (Exception e) {
            System.err.println("Não foi possivel criar o arquivo " + e);
        }
    }

    public void ler() {
        File arq = new File("saida.txt");

        try (Scanner leitor = new Scanner(arq)) {
            while (leitor.hasNextLine()) {
                // String linha = leitor.nextLine();
                // String[] dispositivos = linha.split("--");
                // System.out.printf("Origem: %s -- Destino: %s\n", dispositivos[0],
                // dispositivos[1]);

                System.out.println(leitor.nextLine());
            }
        } catch (Exception e) {
            System.err.print("Não foi possivel criar o arquivo " + e);
        }
    }

    public void escrever() {
        // File arq = new File("saida.txt");

        // try (FileWriter fileWriter = new FileWriter(arq);
        // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
        // bufferedWriter.write("Ola mundo\n");
        // } catch (Exception e) {
        // System.err.println("Não foi possivel criar o arquivo " + e);
        // }
    }

    public void salvarPessoas(Pessoa p) {
        File arq = new File("contatos.dat");

        try (FileOutputStream fos = new FileOutputStream(arq, true);
                ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(p);
        } catch (Exception e) {
            System.err.println("Deu erro: " + e);
        }
    }

    public Pessoa lerPessoa() {
        Pessoa p = null;
        File arq = new File("contatos.dat");

        try (FileInputStream fis = new FileInputStream(arq);
                ObjectInputStream ois = new ObjectInputStream(fis)) {
            p = (Pessoa) ois.readObject();
        } catch (Exception e) {
            System.err.println("Deu erro: " + e);
        }

        return p;
    }

    public static void main(String[] args) {
        App app = new App();
        // app.sobreEscrever();
        app.ler();
        Pessoa p = new Pessoa("Faber", "110299079-51");
        app.salvarPessoas(p);
        System.out.println(app.lerPessoa());
    }
}
