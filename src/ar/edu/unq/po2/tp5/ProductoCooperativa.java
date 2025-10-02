package ar.edu.unq.po2.tp5;

public class ProductoCooperativa extends Producto {
    
    public ProductoCooperativa(String nombre, double precioBase, int stock) {
        super(nombre, precioBase, stock);
    }
    
    @Override
    public double getPrecio() {
        return precioBase * 0.9; // 10% de descuento
    }
}
