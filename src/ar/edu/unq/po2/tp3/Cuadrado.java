package ar.edu.unq.po2.tp3;


public class Cuadrado extends Rectangulo {

    // Constructor de Cuadrado
    public Cuadrado(Point esquinaInferiorIzquierda, int lado) {
        super(esquinaInferiorIzquierda, lado, lado);
    }

    // Constructor alternativo
    public Cuadrado(int lado) {
        super(lado, lado);
    }

    public int getLado() {
        return getAncho(); // En un cuadrado, ancho = alto = lado
    }

    @Override
    public String toString() {
        return "Cuadrado[(" + getEsquinaInferiorIzquierda().getX() + "," + 
               getEsquinaInferiorIzquierda().getY() + "), lado=" + getLado() + "]";
    }
}
