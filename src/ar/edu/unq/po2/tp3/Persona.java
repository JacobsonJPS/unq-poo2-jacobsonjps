package ar.edu.unq.po2.tp3;

import java.util.Date;
import java.util.Calendar;

public class Persona {
    private String nombre;
    private String apellido;  // ← NUEVO campo
    private Date fechaNacimiento;

    // Constructor ORIGINAL (del ejercicio anterior)
    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = "";  // Valor por defecto para mantener compatibilidad
        this.fechaNacimiento = fechaNacimiento;
    }

    // NUEVO constructor para el ejercicio 11
    public Persona(String nombre, String apellido, Date fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {  // ← NUEVO getter
        return apellido;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Método para calcular la edad (se mantiene igual)
    public int getEdad() {
        Calendar hoy = Calendar.getInstance();
        Calendar nacimiento = Calendar.getInstance();
        nacimiento.setTime(fechaNacimiento);
        
        int edad = hoy.get(Calendar.YEAR) - nacimiento.get(Calendar.YEAR);
        
        if (hoy.get(Calendar.DAY_OF_YEAR) < nacimiento.get(Calendar.DAY_OF_YEAR)) {
            edad--;
        }
        
        return edad;
    }

    @Override
    public String toString() {
        if (apellido.isEmpty()) {
            return nombre + " (" + getEdad() + " años)";
        } else {
            return nombre + " " + apellido + " (" + getEdad() + " años)";
        }
    }

    // Los demás métodos se mantienen (menorQue, etc.)
    public boolean menorQue(Persona otraPersona) {
        return this.getEdad() < otraPersona.getEdad();
    }

    public static Persona crearPersona(String nombre, Date fechaNacimiento) {
        return new Persona(nombre, fechaNacimiento);
    }
}

/*
Respuesta a la pregunta teórica:
1. Si un objeto cualquiera que le pide la edad a una Persona: ¿Conoce cómo ésta calcula u obtiene tal valor? ¿Cómo se llama el mecanismo de abstracción que permite esto?
Respuesta: No, el objeto que solicita la edad no conoce cómo la Persona calcula u obtiene ese valor. Solo conoce la interfaz pública (el método getEdad()) pero no la implementación interna.

El mecanismo de abstracción que permite esto se llama:
Encapsulamiento (ocultamiento de información)
Abstracción mediante interfaz pública

Explicación:
El encapsulamiento oculta los detalles internos de implementación
La clase Persona expone solo lo necesario a través de métodos públicos
El cliente solo ve "qué hace" (getEdad()) pero no "cómo lo hace"
Esto permite cambiar la implementación interna sin afectar a los clientes
Es uno de los pilares fundamentales de la programación orientada a objetos
*/