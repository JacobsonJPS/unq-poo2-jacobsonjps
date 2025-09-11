package ar.edu.unq.po2.testTp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase {
    private Counter counter;

    /**
     * Crea un escenario de test básico, que consiste en un contador
     * con 10 enteros.
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
        // Se crea el contador
        counter = new Counter();
        // Se agregan los números. Nueve impares y un solo par.
        counter.addNumber(1);
        counter.addNumber(3);
        counter.addNumber(5);
        counter.addNumber(7);
        counter.addNumber(9);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(1);
        counter.addNumber(4);
    }

    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testEvenNumbers() {
        // Getting the even occurrences
        int amount = counter.getEvenOcurrences();
        // I check the amount is the expected one
        assertEquals(1, amount); // Corregido de 9 a 1
    }
    
    @Test
    public void testOddNumbers() {
        int amount = counter.getOddOcurrences();
        assertEquals(9, amount);
    }

    @Test
    public void testMultiplesOf() {
        int amount = counter.getMultipleOf(3);
        assertEquals(2, amount); // Los múltiplos de 3 son 3 y 9
    }
}