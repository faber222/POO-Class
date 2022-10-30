package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class PessoaTest {
    @Test
    public void addEmail() {
        Pessoa teste1 = new Pessoa("Faber", "Bernardo Júnior", LocalDate.now());

        // verdadeiro
        assertTrue(teste1.addEmail("comercial", "dados@dados.com"));
        assertTrue(teste1.addEmail("pessoal", "dados@dados.com"));

        // falso
        assertFalse(teste1.addEmail("", "dados@dados.com"));
        assertFalse(teste1.addEmail("comercial", "dados@dados.com"));
        assertFalse(teste1.addEmail("comercial2", "dados"));
        assertFalse(teste1.addEmail("comercial3", "dados@"));
        assertFalse(teste1.addEmail("comercial4", "dados@dados"));
        assertFalse(teste1.addEmail("comercial5", "dados@dados."));
        assertFalse(teste1.addEmail("comercial6", "dados@dados.c"));
        assertFalse(teste1.addEmail("comercial7", ".com"));
        assertFalse(teste1.addEmail("comercial8", "dados.com"));
        assertFalse(teste1.addEmail("comercial9", "@dados.com"));
        assertFalse(teste1.addEmail("comercial10", ".@dados.com"));
        assertFalse(teste1.addEmail("comercial11", ".@.com"));
        assertFalse(teste1.addEmail("comercial12", ""));
        assertFalse(teste1.addEmail("comercial13", "@"));
        assertFalse(teste1.addEmail("comercial14", "."));
        assertFalse(teste1.addEmail("comercial15", "dados@.com"));
    }

    @Test
    public void addTelefone() {
        Pessoa teste2 = new Pessoa("Faber", "Bernardo Júnior", LocalDate.now());
        assertTrue(teste2.addTelefone("comercial", "5548996422103"));

        assertFalse(teste2.addTelefone("comercial", "5548996422103"));
        assertFalse(teste2.addTelefone("", "5548996422103"));
        assertFalse(teste2.addTelefone("comercial", ""));
    }

    @Test 
    public void removeEmail() {
        Pessoa teste3 = new Pessoa("Faber", "Bernardo Júnior", LocalDate.now());

        teste3.addEmail("comercial", "dados@dados.com");
        teste3.addEmail("pessoal", "dados2@dados.com");

        assertTrue(teste3.removeEmail("comercial"));
        assertFalse(teste3.removeEmail("comercial"));
        assertTrue(teste3.removeEmail("pessoal"));
        assertFalse(teste3.removeEmail("pessoal"));
        assertFalse(teste3.removeEmail(""));
        assertFalse(teste3.removeEmail("banana"));
    }

    @Test 
    public void removeTelefone() {
        Pessoa teste4 = new Pessoa("Faber", "Bernardo Júnior", LocalDate.now());

        teste4.addTelefone("comercial", "5548996422103");
        teste4.addTelefone("celular", "5548996422103");

        assertTrue(teste4.removeTelefone("comercial"));
        assertTrue(teste4.removeTelefone("celular"));

        assertFalse(teste4.removeTelefone("comercial"));
        assertFalse(teste4.removeTelefone("celular"));
        assertFalse(teste4.removeTelefone(""));
        assertFalse(teste4.removeTelefone("banana"));
    }

    @Test 
    public void updateEmail() {
        Pessoa teste5 = new Pessoa("Faber", "Bernardo Júnior", LocalDate.now());

        teste5.addEmail("comercial", "dados@dados.com");
        teste5.addEmail("pessoal", "dados2@dados.com");

        // verdadeiro
        assertTrue(teste5.updateEmail("comercial", "dados@gmail.com"));
        assertTrue(teste5.updateEmail("pessoal", "dados@gmail.com"));

        // falso
        assertFalse(teste5.updateEmail("banana", "dados@gmail.com"));
        assertFalse(teste5.updateEmail("maça", "dados@gmail.com"));
        assertFalse(teste5.updateEmail("comercial", "dados"));
        assertFalse(teste5.updateEmail("comercial", "dados@"));
        assertFalse(teste5.updateEmail("comercial", "dados@dados"));
        assertFalse(teste5.updateEmail("comercial", "dados@dados."));
        assertFalse(teste5.updateEmail("comercial", "dados@dados.c"));
        assertFalse(teste5.updateEmail("comercial", ".com"));
        assertFalse(teste5.updateEmail("comercial", "dados.com"));
        assertFalse(teste5.updateEmail("comercial", "@dados.com"));
        assertFalse(teste5.updateEmail("comercial", ".@dados.com"));
        assertFalse(teste5.updateEmail("comercial", ".@.com"));
        assertFalse(teste5.updateEmail("comercial", ""));
        assertFalse(teste5.updateEmail("comercial", "@"));
        assertFalse(teste5.updateEmail("comercial", "."));
    }

    @Test 
    public void updateTelefone() {
        Pessoa teste6 = new Pessoa("Faber", "Bernardo Júnior", LocalDate.now());

        teste6.addTelefone("comercial", "5548996422103");
        teste6.addTelefone("celular", "5548996422103");

        assertTrue(teste6.updateTelefone("comercial", "5548996422103"));
        assertTrue(teste6.updateTelefone("celular", "5548996422103"));

        assertFalse(teste6.updateTelefone("", "5548996422103"));
        assertFalse(teste6.updateTelefone("celular", ""));
        assertFalse(teste6.updateTelefone("celular", "55"));
        assertFalse(teste6.updateTelefone("banana", "5548996422103"));
    }
}
