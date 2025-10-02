package ar.edu.unq.po2.testTp5;

import org.junit.Test;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.ProductoCooperativa;
import ar.edu.unq.po2.tp5.ProductoTradicional;

import static org.junit.Assert.*;

public class CajaTestCase {
    
    @Test
    public void testProductoTradicional() {
        ProductoTradicional producto = new ProductoTradicional("Arroz", 100.0, 10);
        assertEquals(100.0, producto.getPrecio(), 0.01);
    }
    
    @Test
    public void testProductoCooperativa() {
        ProductoCooperativa producto = new ProductoCooperativa("Aceite", 100.0, 5);
        assertEquals(90.0, producto.getPrecio(), 0.01); // 10% descuento
    }
    
    @Test
    public void testRegistrarProducto() {
        Caja caja = new Caja();
        ProductoTradicional arroz = new ProductoTradicional("Arroz", 100.0, 10);
        ProductoCooperativa aceite = new ProductoCooperativa("Aceite", 200.0, 5);
        
        caja.registrar(arroz);
        caja.registrar(aceite);
        
        assertEquals(280.0, caja.getTotal(), 0.01); // 100 + 180 (200 - 10%)
        assertEquals(9, arroz.getStock()); // Stock decrementado
        assertEquals(4, aceite.getStock()); // Stock decrementado
    }
}