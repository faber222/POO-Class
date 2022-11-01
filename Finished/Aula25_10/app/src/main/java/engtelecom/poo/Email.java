package engtelecom.poo;

import java.util.HashMap;

public class Email {
    private HashMap<String, String> dados = new HashMap<>();

    private final String ER = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";

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
        if (existeEmail(rotulo)) {
            this.dados.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean update(String rotulo, String email) {
        if (validaEmail(email) && existeEmail(rotulo) && !rotulo.isEmpty()) {
            this.dados.remove(rotulo);
            this.dados.put(rotulo, email);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        dados.forEach((c, v) -> {
            sb.append(c + " : " + v);
        });

        return sb.toString();
    }

    private boolean validaEmail(String email) {
        return (email.matches(ER));
    }

    private boolean existeEmail(String rotulo) {
        return (dados.get(rotulo) != null);
    }

}
