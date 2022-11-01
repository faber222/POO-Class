package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;

public class TelefoneTest {
    @Test
    public void adicionarTelefone() {
        Telefone telefone = new Telefone();
        assertTrue(telefone.add("comercial", "5548996422103"));

        assertFalse(telefone.add("comercial", "5548996422103"));
        assertFalse(telefone.add("", "5548996422103"));
        assertFalse(telefone.add("comercial", ""));
    }

    @Test
    public void removerTelefone() {
        Telefone telefone = new Telefone();
        telefone.add("comercial", "5548996422103");
        telefone.add("celular", "5548996422103");

        assertTrue(telefone.remover("comercial"));
        assertTrue(telefone.remover("celular"));

        assertFalse(telefone.remover("comercial"));
        assertFalse(telefone.remover("celular"));
        assertFalse(telefone.remover(""));
        assertFalse(telefone.remover("banana"));
    }

    @Test
    public void atualizarTelefone() {
        Telefone telefone = new Telefone();
        telefone.add("comercial", "5548996422103");
        telefone.add("celular", "5548996422103");

        assertTrue(telefone.update("comercial", "5548996422103"));
        assertTrue(telefone.update("celular", "5548996422103"));

        assertFalse(telefone.update("", "5548996422103"));
        assertFalse(telefone.update("celular", ""));
        assertFalse(telefone.update("celular", "55"));
        assertFalse(telefone.update("banana", "5548996422103"));
    }
    
    @Test
    public void verificaToString(){
        Telefone telefone = new Telefone();
        telefone.add("comercial", "5548996422103");
        assertEquals("comercial : +55(48) 9 9642-2103", telefone.toString());
    }
}
