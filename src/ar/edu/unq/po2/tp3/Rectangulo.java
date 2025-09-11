package ar.edu.unq.po2.tp3;

public class Rectangulo {
    private Point esquinaInferiorIzquierda;
    private int ancho;
    private int alto;

    // 1. Constructor que asegura consistencia
    public Rectangulo(Point esquinaInferiorIzquierda, int ancho, int alto) {
        if (ancho <= 0 || alto <= 0) {
            throw new IllegalArgumentException("Ancho y alto deben ser valores positivos");
        }
        this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
        this.ancho = ancho;
        this.alto = alto;
    }

    // Constructor alternativo que crea desde (0,0)
    public Rectangulo(int ancho, int alto) {
        this(new Point(0, 0), ancho, alto);
    }

    // 2. Obtener el área
    public int getArea() {
        return ancho * alto;
    }

    // 3. Obtener el perímetro
    public int getPerimetro() {
        return 2 * (ancho + alto);
    }

    // 4. Determinar si es horizontal o vertical
    public boolean esHorizontal() {
        return ancho > alto;
    }

    public boolean esVertical() {
        return alto > ancho;
    }

    public boolean esCuadrado() {
        return ancho == alto;
    }

    // Getters
    public Point getEsquinaInferiorIzquierda() {
        return esquinaInferiorIzquierda;
    }

    public int getAncho() {
        return ancho;
    }

    public int getAlto() {
        return alto;
    }

    public Point getEsquinaSuperiorDerecha() {
        return new Point(esquinaInferiorIzquierda.getX() + ancho, 
                         esquinaInferiorIzquierda.getY() + alto);
    }

    @Override
    public String toString() {
        return "Rectangulo[(" + esquinaInferiorIzquierda.getX() + "," + 
               esquinaInferiorIzquierda.getY() + "), ancho=" + ancho + 
               ", alto=" + alto + "]";
    }
}


