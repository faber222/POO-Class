package engtelecom.poo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addEmail(String r, String e) {
        return false;
    }

    public boolean addTelefone(String r, String n) {
        return false;
    }

    public boolean removeEmail(String r) {
        return false;
    }

    public boolean removeTelefone(String r) {
        return false;
    }

    public boolean updateEmail(String r, String e) {
        return false;
    }

    public boolean updateTelefone(String r, String n) {
        return false;
    }

    @Override
    public String toString() {
        return "Pessoa [nome=" + nome + ", sobrenome=" + sobrenome + ", dataNasc=" + dataNasc + ", telefones="
                + telefones + ", emails=" + emails + "]";
    }

}
