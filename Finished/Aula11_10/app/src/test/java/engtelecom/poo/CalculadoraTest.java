package engtelecom.poo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void somandoPositivos() {
        Calculadora c = new Calculadora();

        assertEquals(2, c.somar(1, 1));
        assertEquals(3, c.somar(2, 1));
        assertEquals(3, c.somar(1, 2));
    };

    @Test
    public void somandoNegativos() {
        Calculadora c = new Calculadora();

        assertEquals(-2, c.somar(-1, -1));
        assertEquals(1, c.somar(-1, 2));
        assertEquals(-1, c.somar(-2, 1));
        assertEquals(-4, c.somar(-2, -2));
    };

    @Test
    public void somandoComZeros() {
        Calculadora c = new Calculadora();

        assertEquals(0, c.somar(0, 0));
        assertEquals(2, c.somar(0, 2));
        assertEquals(1, c.somar(0, 1));

    };
}
