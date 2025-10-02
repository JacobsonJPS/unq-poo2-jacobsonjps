package ar.edu.unq.po2.tp4;

public class Producto {
    private String nombre;
    private Double precio;
    private Boolean esPrecioCuidado;
    
    public Producto(String nombre, Double precio) {
        this(nombre, precio, false);
    }
    
    public Producto(String nombre, Double precio, Boolean esPrecioCuidado) {
        this.nombre = nombre;
        this.precio = precio;
        this.esPrecioCuidado = esPrecioCuidado;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public Double getPrecio() {
        return precio;
    }
    
    // Nuevo método para obtener el precio base (sin descuentos aplicados)
    public Double getPrecioBase() {
        return precio;
    }
    
    public Boolean esPrecioCuidado() {
        return esPrecioCuidado;
    }
    
    public void aumentarPrecio(Double aumento) {
        this.precio += aumento;
    }
}