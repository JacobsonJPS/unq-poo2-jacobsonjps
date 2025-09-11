package ar.edu.unq.po2.testTp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;
import ar.edu.unq.po2.tp3.Point;

public class CuadradoTestCase {
    private Cuadrado cuadrado;
    private Cuadrado cuadradoConPosicion;

    @BeforeEach
    public void setUp() {
        cuadrado = new Cuadrado(6);
        cuadradoConPosicion = new Cuadrado(new Point(2, 3), 4);
    }

    @Test
    public void testCreacionCuadrado() {
        assertEquals(6, cuadrado.getLado());
        assertEquals(6, cuadrado.getAncho());
        assertEquals(6, cuadrado.getAlto());
    }

    @Test
    public void testCuadradoConPosicion() {
        assertEquals(4, cuadradoConPosicion.getLado());
        assertEquals(2, cuadradoConPosicion.getEsquinaInferiorIzquierda().getX());
        assertEquals(3, cuadradoConPosicion.getEsquinaInferiorIzquierda().getY());
    }

    @Test
    public void testAreaCuadrado() {
        assertEquals(36, cuadrado.getArea());        // 6 * 6 = 36
        assertEquals(16, cuadradoConPosicion.getArea()); // 4 * 4 = 16
    }

    @Test
    public void testPerimetroCuadrado() {
        assertEquals(24, cuadrado.getPerimetro());        // 4 * 6 = 24
        assertEquals(16, cuadradoConPosicion.getPerimetro()); // 4 * 4 = 16
    }

    @Test
    public void testCuadradoSiempreEsCuadrado() {
        assertTrue(cuadrado.esCuadrado());
        assertFalse(cuadrado.esHorizontal());
        assertFalse(cuadrado.esVertical());
    }

    @Test
    public void testEsquinasCuadrado() {
        Point esquinaSuperiorDerecha = cuadradoConPosicion.getEsquinaSuperiorDerecha();
        assertEquals(6, esquinaSuperiorDerecha.getX()); // 2 + 4 = 6
        assertEquals(7, esquinaSuperiorDerecha.getY()); // 3 + 4 = 7
    }
}