package ar.edu.unq.po2.tp3;

public class Point {
    // Variables de instancia
    private int x;
    private int y;

    // 1. Constructor con parámetros x e y
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 2. Constructor sin parámetros - crea punto en (0,0)
    public Point() {
        this(0, 0); // Llama al constructor principal con valores (0,0)
    }

    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
 // 3. Método para mover el punto a otra posición
    public void moverA(int nuevoX, int nuevoY) {
        this.x = nuevoX;
        this.y = nuevoY;
    }

    // 4. Método para sumarse con otro punto y devolver nuevo punto
    public Point sumarCon(Point otroPunto) {
        int nuevaX = this.x + otroPunto.getX();
        int nuevaY = this.y + otroPunto.getY();
        return new Point(nuevaX, nuevaY);
    }

}