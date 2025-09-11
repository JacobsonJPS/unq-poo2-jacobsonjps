package ar.edu.unq.po2.testTp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

public class RectanguloTestCase {
    private Rectangulo rectanguloHorizontal;
    private Rectangulo rectanguloVertical;
    private Rectangulo cuadrado;
    private Point puntoInicial;

    @BeforeEach
    public void setUp() {
        puntoInicial = new Point(2, 3);
        rectanguloHorizontal = new Rectangulo(puntoInicial, 8, 4);
        rectanguloVertical = new Rectangulo(new Point(1, 1), 3, 7);
        cuadrado = new Rectangulo(new Point(0, 0), 5, 5);
    }

    @Test
    public void testCreacionRectangulo() {
        assertEquals(8, rectanguloHorizontal.getAncho());
        assertEquals(4, rectanguloHorizontal.getAlto());
        assertEquals(puntoInicial, rectanguloHorizontal.getEsquinaInferiorIzquierda());
    }

    @Test
    public void testCreacionInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangulo(new Point(0, 0), -5, 10);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            new Rectangulo(new Point(0, 0), 5, 0);
        });
    }

    @Test
    public void testArea() {
        assertEquals(32, rectanguloHorizontal.getArea()); // 8 * 4 = 32
        assertEquals(21, rectanguloVertical.getArea());   // 3 * 7 = 21
        assertEquals(25, cuadrado.getArea());             // 5 * 5 = 25
    }

    @Test
    public void testPerimetro() {
        assertEquals(24, rectanguloHorizontal.getPerimetro()); // 2*(8+4) = 24
        assertEquals(20, rectanguloVertical.getPerimetro());   // 2*(3+7) = 20
        assertEquals(20, cuadrado.getPerimetro());             // 2*(5+5) = 20
    }

    @Test
    public void testOrientacion() {
        assertTrue(rectanguloHorizontal.esHorizontal());
        assertFalse(rectanguloHorizontal.esVertical());
        
        assertTrue(rectanguloVertical.esVertical());
        assertFalse(rectanguloVertical.esHorizontal());
        
        assertFalse(cuadrado.esHorizontal());
        assertFalse(cuadrado.esVertical());
        assertTrue(cuadrado.esCuadrado());
    }

    @Test
    public void testEsquinas() {
        Point esquinaSuperiorDerecha = rectanguloHorizontal.getEsquinaSuperiorDerecha();
        assertEquals(10, esquinaSuperiorDerecha.getX()); // 2 + 8 = 10
        assertEquals(7, esquinaSuperiorDerecha.getY());  // 3 + 4 = 7
    }
}