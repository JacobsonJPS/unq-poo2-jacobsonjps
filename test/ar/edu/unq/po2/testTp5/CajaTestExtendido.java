package ar.edu.unq.po2.testTp5;

import org.junit.Test;

import ar.edu.unq.po2.tp5.Agencia;
import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Factura;
import ar.edu.unq.po2.tp5.Impuesto;
import ar.edu.unq.po2.tp5.ProductoTradicional;
import ar.edu.unq.po2.tp5.Servicio;

import static org.junit.Assert.*;

public class CajaTestExtendido {
    
    @Test
    public void testRegistrarServicio() {
        Caja caja = new Caja();
        AgenciaMock agencia = new AgenciaMock();
        Servicio luz = new Servicio(5.0, 100); // 5 pesos por unidad, 100 unidades
        
        caja.registrar(luz, agencia);
        
        assertEquals(500.0, caja.getTotal(), 0.01);
        assertTrue(agencia.fueRegistrado);
    }
    
    @Test
    public void testRegistrarImpuesto() {
        Caja caja = new Caja();
        AgenciaMock agencia = new AgenciaMock();
        Impuesto municipal = new Impuesto(150.0); // Tasa fija
        
        caja.registrar(municipal, agencia);
        
        assertEquals(150.0, caja.getTotal(), 0.01);
        assertTrue(agencia.fueRegistrado);
    }
    
    @Test
    public void testMezclaProductosYFacturas() {
        Caja caja = new Caja();
        AgenciaMock agencia = new AgenciaMock();
        
        ProductoTradicional arroz = new ProductoTradicional("Arroz", 100.0, 10);
        Servicio agua = new Servicio(8.0, 50); // 400 pesos
        Impuesto provincial = new Impuesto(200.0);
        
        caja.registrar(arroz);
        caja.registrar(agua, agencia);
        caja.registrar(provincial, agencia);
        
        assertEquals(700.0, caja.getTotal(), 0.01); // 100 + 400 + 200
        assertEquals(9, arroz.getStock());
    }
}

// Mock para testing
class AgenciaMock implements Agencia {
    public boolean fueRegistrado = false;
    
    @Override
    public void registrarPago(Factura factura) {
        fueRegistrado = true;
    }
}
