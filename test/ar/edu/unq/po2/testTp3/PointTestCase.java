package ar.edu.unq.po2.testTp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;



public class PointTestCase {
    private Point punto;
    private Point puntoOrigen;

    @BeforeEach
    public void setUp() {
        punto = new Point(3, 4);
        puntoOrigen = new Point();
    }

    // Test 1: Creación con valores x e y
    @Test
    public void testCreacionConValores() {
        assertEquals(3, punto.getX());
        assertEquals(4, punto.getY());
    }

    // Test 2: Creación sin parámetros (debe estar en 0,0)
    @Test
    public void testCreacionSinParametros() {
        assertEquals(0, puntoOrigen.getX());
        assertEquals(0, puntoOrigen.getY());
    }

    // Test 3: Mover punto a nueva posición
    @Test
    public void testMoverPunto() {
        punto.moverA(7, 8);
        assertEquals(7, punto.getX());
        assertEquals(8, punto.getY());
    }

    // Test 4: Sumar con otro punto
    @Test
    public void testSumarConOtroPunto() {
        Point punto2 = new Point(2, 3);
        Point resultado = punto.sumarCon(punto2);
        
        assertEquals(5, resultado.getX()); // 3 + 2 = 5
        assertEquals(7, resultado.getY()); // 4 + 3 = 7
    }

    // Test 5: Sumar con punto en origen
    @Test
    public void testSumarConPuntoOrigen() {
        Point resultado = punto.sumarCon(puntoOrigen);
        
        assertEquals(3, resultado.getX()); // 3 + 0 = 3
        assertEquals(4, resultado.getY()); // 4 + 0 = 4
    }

    // Test 6: Verificar que el resultado de la suma es nuevo objeto
    @Test
    public void testSumaCreaNuevoObjeto() {
        Point punto2 = new Point(1, 1);
        Point resultado = punto.sumarCon(punto2);
        
        assertNotSame(punto, resultado); // No son el mismo objeto
        assertNotSame(punto2, resultado); // No son el mismo objeto
    }
}
    