package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
    
    public Impuesto(double tasa) {
        super(tasa);
    }
    
    @Override
    public double getMonto() {
        return monto;
    }
    
    @Override
    public void pagar(Agencia agencia) {
        agencia.registrarPago(this);
    }
}
