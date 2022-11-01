package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class AgendaTest {
    @Test
    public void addPessoa() {
        Agenda agenda = new Agenda();
        Pessoa pessoa1 = new Pessoa("Faber", "Bernardo Júnior", LocalDate.of(2001, 9, 3));
        Pessoa pessoa2 = new Pessoa("Yasmim", "Schmitz", LocalDate.of(2001, 9, 3));

        assertTrue(agenda.addPessoa(pessoa1));
        assertTrue(agenda.addPessoa(pessoa2));

        assertFalse(agenda.addPessoa(pessoa2));
        assertFalse(agenda.addPessoa(pessoa1));
    }

    @Test
    public void removePessoa() {
        Agenda agenda = new Agenda();

        Pessoa pessoa1 = new Pessoa("Faber", "Bernardo", LocalDate.of(2001, 9, 3));
        Pessoa pessoa2 = new Pessoa("Yasmim", "Schmitz", LocalDate.of(2000, 8, 22));
        Pessoa pessoa3 = new Pessoa("Tulipa", "Alvares", LocalDate.of(2001, 9, 3));

        agenda.addPessoa(pessoa1);
        agenda.addPessoa(pessoa2);
        agenda.addPessoa(pessoa3);

        assertTrue(agenda.removePessoa("Faber", "Bernardo"));
        assertTrue(agenda.removePessoa("Yasmim", "Schmitz"));

        assertFalse(agenda.removePessoa("Faber", "Bernardo"));
        assertFalse(agenda.removePessoa("", "Bernardo"));
        assertFalse(agenda.removePessoa("Tulipa", ""));
    }

    @Test
    public void addEmail() {
        Agenda agenda = new Agenda();

        Pessoa pessoa1 = new Pessoa("Faber", "Bernardo", LocalDate.of(2001, 9, 3));
        Pessoa pessoa2 = new Pessoa("Yasmim", "Schmitz", LocalDate.of(2000, 8, 22));
        Pessoa pessoa3 = new Pessoa("Tulipa", "Alvares", LocalDate.of(2001, 9, 3));

        agenda.addPessoa(pessoa1);
        agenda.addPessoa(pessoa2);
        agenda.addPessoa(pessoa3);

        assertTrue(agenda.addEmail("comercial", "dados@dados.com", 0));
        assertTrue(agenda.addEmail("pessoal", "dados@dados.com", 1));

        assertFalse(agenda.addEmail("", "dados@dados.com", 2));
        assertFalse(agenda.addEmail("comercial", "dados@dados.com", 0));
        assertFalse(agenda.addEmail("comercial2", "dados", 2));
        assertFalse(agenda.addEmail("comercial3", "dados@", 2));
        assertFalse(agenda.addEmail("comercial4", "dados@dados", 2));
        assertFalse(agenda.addEmail("comercial5", "dados@dados.", 2));
        assertFalse(agenda.addEmail("comercial6", "dados@dados.c", 2));
        assertFalse(agenda.addEmail("comercial7", ".com", 2));
        assertFalse(agenda.addEmail("comercial8", "dados.com", 2));
        assertFalse(agenda.addEmail("comercial9", "@dados.com", 2));
        assertFalse(agenda.addEmail("comercial12", ".@dados.com", 2));
        assertFalse(agenda.addEmail("comercial11", ".@.com", 2));
        assertFalse(agenda.addEmail("comercial12", "", 2));
        assertFalse(agenda.addEmail("comercial13", "@", 2));
        assertFalse(agenda.addEmail("comercial14", ".", 2));
        assertFalse(agenda.addEmail("comercial15", "dados@.com", 2));
    }

    @Test
    public void addTelefone() {
        Agenda agenda = new Agenda();
        Pessoa pessoa1 = new Pessoa("Faber", "Bernardo", LocalDate.of(2001, 9, 3));

        agenda.addPessoa(pessoa1);

        assertTrue(agenda.addTelefone("comercial", "5548996422103", 0));
        assertTrue(agenda.addTelefone("pessoal", "5548996422103", 0));

        assertFalse(agenda.addTelefone("comercial", "5548996422103", 0));
        assertFalse(agenda.addTelefone("", "5548996422103", 0));
        assertFalse(agenda.addTelefone("comercial", "", 0));
    }

    @Test
    public void removeEmail() {
        Agenda agenda = new Agenda();
        Pessoa pessoa1 = new Pessoa("Faber", "Bernardo", LocalDate.of(2001, 9, 3));

        agenda.addPessoa(pessoa1);

        agenda.addEmail("comercial", "dados@dados.com", 0);
        agenda.addEmail("pessoal", "dados2@dados.com", 0);

        assertTrue(agenda.removeEmail("comercial", 0));
        assertFalse(agenda.removeEmail("comercial", 0));
        assertTrue(agenda.removeEmail("pessoal", 0));
        assertFalse(agenda.removeEmail("pessoal", 0));
        assertFalse(agenda.removeEmail("", 0));
        assertFalse(agenda.removeEmail("banana", 0));
    }

    @Test
    public void removeTelefones() {
        Agenda agenda = new Agenda();
        Pessoa pessoa1 = new Pessoa("Faber", "Bernardo", LocalDate.of(2001, 9, 3));

        agenda.addPessoa(pessoa1);

        agenda.addTelefone("comercial", "5548996422103", 0);
        agenda.addTelefone("celular", "5548996422103", 0);

        assertTrue(agenda.removeTelefones("comercial", 0));
        assertTrue(agenda.removeTelefones("celular", 0));

        assertFalse(agenda.removeTelefones("comercial", 0));
        assertFalse(agenda.removeTelefones("celular", 0));
        assertFalse(agenda.removeTelefones("", 0));
        assertFalse(agenda.removeTelefones("banana", 0));
    }

    @Test
    public void updateEmail() {
        Agenda agenda = new Agenda();

        Pessoa pessoa1 = new Pessoa("Faber", "Bernardo", LocalDate.of(2001, 9, 3));
        Pessoa pessoa2 = new Pessoa("Yasmim", "Schmitz", LocalDate.of(2000, 8, 22));
        Pessoa pessoa3 = new Pessoa("Tulipa", "Alvares", LocalDate.of(2001, 9, 3));

        agenda.addPessoa(pessoa1);
        agenda.addPessoa(pessoa2);
        agenda.addPessoa(pessoa3);

        agenda.addEmail("comercial", "dados@dados.com", 0);
        agenda.addEmail("pessoal", "dados2@dados.com", 1);

        assertTrue(agenda.updateEmail("comercial", "dados@dados.com", 0));
        assertTrue(agenda.updateEmail("pessoal", "dados@dados.com", 1));

        assertFalse(agenda.updateEmail("", "dados@dados.com", 2));
        assertFalse(agenda.updateEmail("comercial2", "dados", 2));
        assertFalse(agenda.updateEmail("comercial3", "dados@", 2));
        assertFalse(agenda.updateEmail("comercial4", "dados@dados", 2));
        assertFalse(agenda.updateEmail("comercial5", "dados@dados.", 2));
        assertFalse(agenda.updateEmail("comercial6", "dados@dados.c", 2));
        assertFalse(agenda.updateEmail("comercial7", ".com", 2));
        assertFalse(agenda.updateEmail("comercial8", "dados.com", 2));
        assertFalse(agenda.updateEmail("comercial9", "@dados.com", 2));
        assertFalse(agenda.updateEmail("comercial12", ".@dados.com", 2));
        assertFalse(agenda.updateEmail("comercial11", ".@.com", 2));
        assertFalse(agenda.updateEmail("comercial12", "", 2));
        assertFalse(agenda.updateEmail("comercial13", "@", 2));
        assertFalse(agenda.updateEmail("comercial14", ".", 2));
        assertFalse(agenda.updateEmail("comercial15", "dados@.com", 2));
    }

    @Test
    public void updateTelefone() {
        Agenda agenda = new Agenda();
        Pessoa pessoa1 = new Pessoa("Faber", "Bernardo", LocalDate.of(2001, 9, 3));

        agenda.addPessoa(pessoa1);

        agenda.addTelefone("comercial", "5548996422103", 0);
        agenda.addTelefone("celular", "5548996422103", 0);

        assertTrue(agenda.updateTelefone("comercial", "5548996422103", 0));
        assertTrue(agenda.updateTelefone("celular", "5548996422103", 0));

        assertFalse(agenda.updateTelefone("", "5548996422103", 0));
        assertFalse(agenda.updateTelefone("celular", "", 0));
        assertFalse(agenda.updateTelefone("celular", "55", 0));
        assertFalse(agenda.updateTelefone("banana", "5548996422103", 0));
    }
}
