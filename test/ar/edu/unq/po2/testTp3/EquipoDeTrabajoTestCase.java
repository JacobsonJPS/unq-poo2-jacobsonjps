package ar.edu.unq.po2.testTp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Calendar;
import java.util.Date;

import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.Persona;


public class EquipoDeTrabajoTestCase {
    private EquipoDeTrabajo equipo;
    private Persona persona1;
    private Persona persona2;
    private Persona persona3;

    @BeforeEach
    public void setUp() {
        equipo = new EquipoDeTrabajo("Testing Team");
        
        Calendar cal = Calendar.getInstance();
        
        // Persona de 25 años
        cal.add(Calendar.YEAR, -25);
        Date fecha1 = cal.getTime();
        persona1 = new Persona("Ana", "García", fecha1);
        
        // Persona de 35 años
        cal.add(Calendar.YEAR, -10); // 25 + 10 = 35
        Date fecha2 = cal.getTime();
        persona2 = new Persona("Pedro", "Sánchez", fecha2);
        
        // Persona de 30 años
        cal.add(Calendar.YEAR, 5); // 35 - 5 = 30
        Date fecha3 = cal.getTime();
        persona3 = new Persona("Laura", "Fernández", fecha3);
    }

    @Test
    public void testPromedioEdadConIntegrantes() {
        equipo.agregarIntegrante(persona1);
        equipo.agregarIntegrante(persona2);
        equipo.agregarIntegrante(persona3);
        
        double promedio = equipo.promedioEdadIntegrantes();
        // Verifica que el promedio esté cerca de 30 (±1 año)
        assertEquals(30.0, promedio, 1.0); // Tolerancia de ±1 año
    }

    
    @Test
    public void testCreacionEquipo() {
        assertEquals("Testing Team", equipo.getNombre());
        assertTrue(equipo.getIntegrantes().isEmpty());
    }

    @Test
    public void testAgregarIntegrantes() {
        equipo.agregarIntegrante(persona1);
        equipo.agregarIntegrante(persona2);
        
        assertEquals(2, equipo.getIntegrantes().size());
    }

    @Test
    public void testPromedioEdadSinIntegrantes() {
        assertEquals(0.0, equipo.promedioEdadIntegrantes(), 0.01);
    }
}