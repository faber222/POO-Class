package engtelecom.poo;

import java.util.HashMap;

public class Email {
    private HashMap<String, String> dados = new HashMap<>();

    private final String eR = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

    /**
     * @param dados
     */
    public Email() {
    }

    public boolean add(String rotulo, String email) {
        if (!rotulo.isEmpty() && validaEmail(email) && !existeEmail(rotulo)) {
            this.dados.put(rotulo, email);
            return true;
        }
        return false;
    }

    public boolean remover(String rotulo) {
        return false;
    }

    public boolean update(String rotulo, String email) {
        return false;
    }

    @Override
    public String toString() {
        return "Email [dados=" + dados + "]";
    }

    public boolean validaEmail(String email) {
        return (email.matches(eR));
    }

    public boolean existeEmail(String rotulo) {
        if (dados.get(rotulo) != null) {
            return true;
        }
        return false;
    }

}
