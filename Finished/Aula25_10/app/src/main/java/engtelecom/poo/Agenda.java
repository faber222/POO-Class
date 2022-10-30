package engtelecom.poo;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contatos;

    public Agenda() {
    }

    public boolean addPessoa(Pessoa p) {
        return false;
    }
    
    public boolean removePessoa(String n, String s) {
        return false;
    }

    public boolean addEmail(String r, String e, int pIndex) {
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
    
    @Override
    public String toString() {
        return "Agenda [contatos=" + contatos + "]";
    }

    
}
