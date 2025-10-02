package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
    private String nombre;
    private String direccion;
    private List<Producto> productos;
    
    public Supermercado(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.productos = new ArrayList<>();
    }
    
    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }
    
    public int getCantidadDeProductos() {
        return productos.size();
    }
    
    public double getPrecioTotal() {
        return productos.stream()
                       .mapToDouble(Producto::getPrecio)
                       .sum();
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getDireccion() {
        return direccion;
    }
}