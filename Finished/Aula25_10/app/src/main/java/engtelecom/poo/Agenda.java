package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contatos;

    public Agenda() {
        this.contatos = new ArrayList<>();
    }

    public boolean addPessoa(Pessoa p) {
        if (!verificaExistencia(p)) {
            return this.contatos.add(p);
        }
        return false;
    }

    public boolean removePessoa(String n, String s) {
        int i = 0;
        for (Pessoa x : this.contatos) {
            if (x.getNome().equals(n) && x.getSobrenome().equals(s)) {
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
                        list.addEmail(r, e);
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
        int i = 0;
        if (!this.contatos.isEmpty()) {
            for (Pessoa list : this.contatos) {
                if (i == pIndex) {
                    if (list.addTelefone(r, n)) {
                        list.addTelefone(r, n);
                        this.contatos.set(pIndex, list);
                        return true;
                    }
                }
                i++;
            }
        }
        return false;
    }

    public boolean removeEmail(String r, int pIndex) {
        int i = 0;
        for (Pessoa list : this.contatos) {
            if (i == pIndex) {
                if (list.removeEmail(r)) {
                    list.removeEmail(r);
                    this.contatos.set(pIndex, list);
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    public boolean removeTelefones(String r, int pIndex) {
        int i = 0;
        for (Pessoa list : this.contatos) {
            if (i == pIndex) {
                if (list.removeTelefone(r)) {
                    list.removeTelefone(r);
                    this.contatos.set(pIndex, list);
                    return true;
                }
            }
            i++;
        }
        return false;
    }

    public boolean updateEmail(String r, String e, int pIndex) {
        int i = 0;
        if (!this.contatos.isEmpty()) {
            for (Pessoa list : this.contatos) {
                if (i == pIndex) {
                    if (list.updateEmail(r, e)) {
                        list.updateEmail(r, e);
                        this.contatos.set(pIndex, list);
                        return true;
                    }
                }
                i++;
            }
        }
        return false;
    }

    public boolean updateTelefone(String r, String n, int pIndex) {
        int i = 0;
        if (!this.contatos.isEmpty()) {
            for (Pessoa list : this.contatos) {
                if (i == pIndex) {
                    if (list.updateTelefone(r, n)) {
                        list.updateTelefone(r, n);
                        this.contatos.set(pIndex, list);
                        return true;
                    }
                }
                i++;
            }
        }
        return false;
    }

    private boolean verificaExistencia(Pessoa p) {
        for (Pessoa x : this.contatos) {
            if (x.getNome().equals(p.getNome()) && x.getSobrenome().equals(p.getSobrenome())) {
                return true;
            }
        }
        return false;
    }

    

    @Override
    public String toString() {
        return "Contatos : " + contatos + "";
    }
    
    public ArrayList<Pessoa> getContatos() {
        return contatos;
    }

}
