package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addPessoa(Pessoa p) {
        if (!verificaExistencia(this.contatos, p)) {
            this.contatos.add(p);
            return true;
        }
        return false;
    }

    public boolean removePessoa(String n, String s) {
        int i = 0;
        for (Pessoa x : this.contatos) {
            if (x.getNome() == n && x.getSobrenome() == s) {
                this.contatos.remove(i);
                return true;
            }
            i++;
        }
        return false;
    }

    public boolean addEmail(String r, String e, int pIndex) {
        int x = 0;
        if (!this.contatos.isEmpty()) {
            for (Pessoa list : this.contatos) {
                if (x == pIndex) {
                    if (list.addEmail(r, e)) {
                        this.contatos.set(pIndex, list);
                        return true;
                    }
                }
                x++;
            }
        }
        return false;
    }

    public boolean addTelefone(String r, String n, int pIndex) {
        return false;
    }

    public boolean removeEmail(String r, int pIndex) {
        return false;
    }

    public boolean removeTelefone(String r, int pIndex) {
        return false;
    }

    public boolean updateEmail(String r, String e, int pIndex) {
        return false;
    }

    public boolean updateTelefone(String r, String n, int pIndex) {
        return false;
    }

    private boolean verificaExistencia(ArrayList<Pessoa> lista, Pessoa p) {
        for (Pessoa x : this.contatos) {
            if (x.getNome() == p.getNome() && x.getSobrenome() == p.getSobrenome()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
