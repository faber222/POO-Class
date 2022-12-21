package app.src.main.java.engtelecom.poo;

import java.text.ParseException;

import javax.swing.text.MaskFormatter;

public class Regex {
    private String formata() {

        String mascara = "+##(##) ####-####";

        String numero = "554838761234";

        try {

            MaskFormatter mask = new MaskFormatter(mascara);

            mask.setValueContainsLiteralCharacters(false);

            mask.setPlaceholderCharacter('_');

            return mask.valueToString(numero);

        } catch (ParseException e) {

            return "";

        }

    }

}
