package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
    private String nombre;
    private List<Persona> integrantes;

    public EquipoDeTrabajo(String nombre) {
        this.nombre = nombre;
        this.integrantes = new ArrayList<>();
    }

    public void agregarIntegrante(Persona persona) {
        integrantes.add(persona);
    }

    public double promedioEdadIntegrantes() {
        if (integrantes.isEmpty()) {
            return 0;
        }
        
        int sumaEdades = 0;
        for (Persona persona : integrantes) {
            sumaEdades += persona.getEdad(); // Usa getEdad() que calcula automáticamente
        }
        
        return (double) sumaEdades / integrantes.size();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Persona> getIntegrantes() {
        return new ArrayList<>(integrantes);
    }
}