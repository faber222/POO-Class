package engtelecom.poo;

import java.text.ParseException;
import java.util.HashMap;

import javax.swing.text.MaskFormatter;

public class Telefone {
    private HashMap<String, String> dados = new HashMap<>();
    private final int NUMERO = 13;

    public Telefone() {
    }

    public boolean add(String rotulo, String numero) {
        if (verificaNumero(numero) && verificaTamanho(numero) && !existeNumero(rotulo) && !rotulo.isEmpty()) {
            this.dados.put(rotulo, numero);
            return true;
        }
        return false;
    }

    public boolean remover(String rotulo) {
        if (existeNumero(rotulo)) {
            this.dados.remove(rotulo);
            return true;
        }
        return false;
    }

    public boolean update(String rotulo, String numero) {
        if (verificaNumero(numero) && verificaTamanho(numero) && existeNumero(rotulo) && !rotulo.isEmpty()) {
            this.dados.remove(rotulo);
            this.dados.put(rotulo, numero);
            return true;
        }
        return false;
    }

    public String toString(String rotulo) throws ParseException {
        return formata(this.dados.get(rotulo));
    }

    private boolean verificaNumero(String numero) {
        return numero.matches("[0-9.]+");
    }

    private boolean verificaTamanho(String numero) {
        return (numero.length() == NUMERO);
    }

    private boolean existeNumero(String rotulo) {
        return (this.dados.get(rotulo) != null);
    }

    private String formata(String numero) {
        String mascara = "+##(##) # ####-####";
        try {
            MaskFormatter mask;

            mask = new MaskFormatter(mascara);
            mask.setValueContainsLiteralCharacters(false);
            mask.setPlaceholderCharacter('_');
            return mask.valueToString(numero);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return mascara;
    }

}
