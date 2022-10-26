package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class EmailTest {
    @Test
    public void adicionarEmail() {
        Email email = new Email();

        // verdadeiro
        assertTrue(email.add("comercial", "dados@dados.com"));
        assertTrue(email.add("pessoal", "dados@dados.com"));

        // falso
        assertFalse(email.add("", "dados@dados.com"));
        assertFalse(email.add("comercial", "dados@dados.com"));
        assertFalse(email.add("comercial2", "dados"));
        assertFalse(email.add("comercial3", "dados@"));
        assertFalse(email.add("comercial4", "dados@dados"));
        assertFalse(email.add("comercial5", "dados@dados."));
        assertFalse(email.add("comercial6", "dados@dados.c"));
        assertFalse(email.add("comercial7", ".com"));
        assertFalse(email.add("comercial8", "dados.com"));
        assertFalse(email.add("comercial9", "@dados.com"));
        assertFalse(email.add("comercial10", ".@dados.com"));
        assertFalse(email.add("comercial11", ".@.com"));
        assertFalse(email.add("comercial12", ""));
        assertFalse(email.add("comercial13", "@"));
        assertFalse(email.add("comercial14", "."));
        assertFalse(email.add("comercial15", "dados@.com"));
    }

    @Test
    public void removerEmail() {
        Email email = new Email();
        email.add("comercial", "dados@dados.com");
        email.add("pessoal", "dados2@dados.com");

        assertTrue(email.remover("comercial"));
        assertFalse(email.remover("comercial"));
        assertTrue(email.remover("pessoal"));
        assertFalse(email.remover("pessoal"));
        assertFalse(email.remover(""));
        assertFalse(email.remover("banana"));
    }

    @Test
    public void atualizarEmail() {
        Email email = new Email();
        email.add("comercial", "dados@dados.com");
        email.add("pessoal", "dados2@dados.com");

        // verdadeiro
        assertTrue(email.update("comercial", "dados@gmail.com"));
        assertTrue(email.update("pessoal", "dados@gmail.com"));

        // falso
        assertFalse(email.update("banana", "dados@gmail.com"));
        assertFalse(email.update("maça", "dados@gmail.com"));
        assertFalse(email.update("comercial", "dados"));
        assertFalse(email.update("comercial", "dados@"));
        assertFalse(email.update("comercial", "dados@dados"));
        assertFalse(email.update("comercial", "dados@dados."));
        assertFalse(email.update("comercial", "dados@dados.c"));
        assertFalse(email.update("comercial", ".com"));
        assertFalse(email.update("comercial", "dados.com"));
        assertFalse(email.update("comercial", "@dados.com"));
        assertFalse(email.update("comercial", ".@dados.com"));
        assertFalse(email.update("comercial", ".@.com"));
        assertFalse(email.update("comercial", ""));
        assertFalse(email.update("comercial", "@"));
        assertFalse(email.update("comercial", "."));
    }

}
