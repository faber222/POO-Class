package engtelecom.poo;

import java.io.Serializable;

public class Pessoa implements Serializable {
    private String nome;
    private String cpf;

    // com o Serializable, vai carregar os dados via serial

    /**
     * @param nome
     * @param cpf
     */
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + '\'' +
                ", cpf=" + cpf + '\'' +
                "]";
    }

}
