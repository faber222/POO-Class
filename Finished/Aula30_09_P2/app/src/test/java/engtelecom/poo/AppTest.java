package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    public void setTempo() {
        Tempo relogio = new Tempo(12, 20, 30);
        assertEquals(true, relogio.setHora(2));
        assertEquals(true, relogio.setMinuto(50));
        assertEquals(true, relogio.setSegundo(23));
    }

    @Test
    public void printTesteHora() {
        Tempo relogio = new Tempo(12, 20, 30);
        assertEquals("12:20:30", relogio.toString());
    }

    @Test
    public void verificaConstrutor() {

    }

    @Test
    public void verificaSegundosTotais() {

    }

    @Test
    public void verificaDiferenca() {

    }

}
