package ar.edu.unq.po2.testTp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

class MultioperadorTestCase {

	private Multioperador multioperador;
	/**
	* Crea un escenario de test básico, que consiste en un multioperador con 10 enteros
	*/
	
	@BeforeEach
	public void setUp() throws Exception {
	//Se crea el contador
	multioperador = new Multioperador();
	//Se agregan los numeros. Un solo par y nueve impares
	multioperador.addNumber(1);
	multioperador.addNumber(2);
	multioperador.addNumber(3);
	multioperador.addNumber(4);
	}
	
	/* Verifica las operaciones*/
	
	@Test
	public void testSuma() {
	int amount = multioperador.numerosSumados();
	// I check the amount is the expected one
	assertEquals(amount, 10);
	}
	
	@Test
	public void testResta() {
	int amount = multioperador.numerosRestados();
	// I check the amount is the expected one
	assertEquals(amount, -10);
	}
	
	@Test
	public void testMul() {
	int amount = multioperador.numerosMultiplicados();
	// I check the amount is the expected one
	assertEquals(amount, 1*2*3*4);
	}
}
