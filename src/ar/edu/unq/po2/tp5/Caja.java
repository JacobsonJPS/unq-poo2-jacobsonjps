package ar.edu.unq.po2.tp5;

public class Caja {
    private double total;
    
    public void registrar(Producto producto) {
        double precio = producto.getPrecio();
        total += precio;
        producto.decrementarStock();
    }
    
    public void registrar(Factura factura, Agencia agencia) {
        total += factura.getMonto();
        factura.pagar(agencia);
    }
    
    public double getTotal() {
        return total;
    }
}
