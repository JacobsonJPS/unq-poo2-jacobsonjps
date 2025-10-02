package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
    private Double descuento;
    
    public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado) {
        super(nombre, precio, esPrecioCuidado);
        this.descuento = 10.0; // Descuento por defecto del 10%
    }
    
    public ProductoPrimeraNecesidad(String nombre, Double precio, Boolean esPrecioCuidado, Double descuento) {
        super(nombre, precio, esPrecioCuidado);
        this.descuento = descuento;
    }
    
    public ProductoPrimeraNecesidad(String nombre, Double precio, Double descuento) {
        super(nombre, precio, false);
        this.descuento = descuento;
    }
    
    @Override
    public Double getPrecio() {
        return super.getPrecio() * (1 - descuento / 100);
    }
    
    public Double getDescuento() {
        return descuento;
    }
}