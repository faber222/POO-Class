package engtelecom.poo;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobrenome, LocalDate dataNasc) {
        if (verificaNomeSobrenome(nome) && verificaNomeSobrenome(sobrenome)) {
            this.nome = nome;
            this.sobrenome = sobrenome;
        } else {
            this.nome = "Sr";
            this.sobrenome = "Maneca";
        }
        this.dataNasc = dataNasc;
        this.telefones = new Telefone();
        this.emails = new Email();
    }

    public boolean addEmail(String r, String e) {
        return this.emails.add(r, e);
    }

    public boolean addTelefone(String r, String n) {
        return this.telefones.add(r, n);
    }

    public boolean removeEmail(String r) {
        return this.emails.remover(r);
    }

    public boolean removeTelefone(String r) {
        return this.telefones.remover(r);
    }

    public boolean updateEmail(String r, String e) {
        return this.emails.update(r, e);
    }

    public boolean updateTelefone(String r, String n) {
        return this.telefones.update(r, n);
    }

    private boolean verificaNomeSobrenome(String nome) {
        return (!nome.isEmpty() && nome.matches("^[a-zA-Z]*$"));
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return "Nome : " + nome + ", sobrenome : " + sobrenome + ", dataNasc : " + dataNasc + ", telefone : "
                + telefones + ", email : " + emails + "";
    }

}
