package engtelecom.poo;

import java.util.HashMap;

public class Telefone {
    private HashMap<String, String> dados = new HashMap<>();

    /**
     * @param dados
     */
    public Telefone() {
        
    }

    public boolean add(String rotulo, String numero) {
        return false;
    }

    public boolean remover(String rotulo) {
        return false;
    }

    public boolean update(String rotulo, String numero) {
        return false;
    }

    @Override
    public String toString() {
        return "Telefone [dados=" + dados + "]";
    }

}
