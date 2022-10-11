package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TermometroTest {

    @Test
    public void imprimeAtual() {
        Termometro t = new Termometro(100, 0, 32);
        assertEquals(32, t.getAtual('C'));
        assertEquals(89.6, t.getAtual('F'));
        assertEquals(305.15, t.getAtual('K'));
    }

    @Test
    public void imprimeMaximo() {
        Termometro t = new Termometro(100, 0, 32);
        assertEquals(100, t.getMax('C'));
        assertEquals(212, t.getMax('F'));
        assertEquals(373.15, t.getMax('K'));
    }

    @Test
    public void imprimeMinimo() {
        Termometro t = new Termometro(100, 0, 32);
        assertEquals(0, t.getMin('C'));
        assertEquals(32, t.getMin('F'));
        assertEquals(273.15, t.getMin('K'));
    }

    @Test
    public void imprimeDiferenca() {
        Termometro t = new Termometro(100, 0, 32);
        Termometro t2 = new Termometro(100, 0, 24);
        assertEquals(8, t.diferenca(t2, 'C'));
        assertEquals(14.4, t.diferenca(t2, 'F'));
        assertEquals(8, t.diferenca(t2, 'K'));
    }
}
