package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
    private double costoUnidad;
    private int unidadesConsumidas;
    
    public Servicio(double costoUnidad, int unidadesConsumidas) {
        super(costoUnidad * unidadesConsumidas);
        this.costoUnidad = costoUnidad;
        this.unidadesConsumidas = unidadesConsumidas;
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