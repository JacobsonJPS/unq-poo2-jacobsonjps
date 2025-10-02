package ar.edu.unq.po2.testTp4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp4.Producto;
import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

    private ProductoPrimeraNecesidad leche;
    private ProductoPrimeraNecesidad arroz;
    private ProductoPrimeraNecesidad pan;
    
    @BeforeEach
    public void setUp() {
        leche = new ProductoPrimeraNecesidad("Leche", 8.0, false);
        arroz = new ProductoPrimeraNecesidad("Arroz", 10.0, false, 8.0); // 8% de descuento
        pan = new ProductoPrimeraNecesidad("Pan", 5.0, 11.0); // 11% de descuento
    }
    
    @Test
    public void testCalcularPrecioConDescuentoPorDefecto() {
        // Leche tiene 10% de descuento por defecto
        assertEquals(7.2, leche.getPrecio(), 0.01); // 8 * 0.9 = 7.2
        assertEquals(10.0, leche.getDescuento(), 0.01);
    }
    
       
    @Test
    public void testConstructorConTresParametros() {
        assertEquals("Leche", leche.getNombre());
        assertEquals(8.0, leche.getPrecioBase(), 0.01);
        assertFalse(leche.esPrecioCuidado());
    }
    
    @Test
    public void testConstructorConCuatroParametros() {
        assertEquals("Arroz", arroz.getNombre());
        assertEquals(10.0, arroz.getPrecioBase(), 0.01);
        assertFalse(arroz.esPrecioCuidado());
        assertEquals(8.0, arroz.getDescuento(), 0.01);
    }
    
    // Método helper para acceder al precio base (sin descuento)
    private Double getPrecioBase(Producto producto) {
        // Reflection para acceder al precio base, o podemos agregar un método en Producto
        return producto.getPrecio() / (1 - ((ProductoPrimeraNecesidad) producto).getDescuento() / 100);
    }
    
    @Test
    public void testCalcularPrecioConDescuentoPersonalizado() {
        // Arroz tiene 8% de descuento
        assertEquals(9.2, arroz.getPrecio(), 0.01); // 10 * 0.92 = 9.2
        assertEquals(8.0, arroz.getDescuento(), 0.01);
        assertEquals(10.0, arroz.getPrecioBase(), 0.01); // Usando el nuevo método
        
        // Pan tiene 11% de descuento
        assertEquals(4.45, pan.getPrecio(), 0.01); // 5 * 0.89 = 4.45
        assertEquals(11.0, pan.getDescuento(), 0.01);
        assertEquals(5.0, pan.getPrecioBase(), 0.01);
    }
    
}