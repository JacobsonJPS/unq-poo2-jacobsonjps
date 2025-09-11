package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {
    private List<Integer> numeros = new ArrayList<>();

    public void addNumber(int numero) {
        this.numeros.add(numero);
    }

    
    public int getEvenOcurrences() {
        int count = 0;
        for (Integer numero : numeros) {
            if (numero % 2 == 0) {
                count++;
            }
        }
        return count;
    }

   
    public int getOddOcurrences() {
        int count = 0;
        for (Integer numero : numeros) {
            if (numero % 2 != 0) {
                count++;
            }
        }
        return count;
    }

    
    public int getMultipleOf(int x) {
        int count = 0;
        for (Integer numero : numeros) {
            if (numero % x == 0) {
                count++;
            }
        }
        return count;
    }
    
    
    /**
     * Busca en la lista de números de la instancia y devuelve aquel
     * que tiene la mayor cantidad de dígitos pares.
     */
    public int getNumeroConMayorCantidadDePares() {
        int numeroConMasPares = -1;
        int maxDigitosPares = -1;

        for (int numero : this.numeros) {
            int digitosParesActual = contarDigitosPares(numero);
            if (digitosParesActual > maxDigitosPares) {
                maxDigitosPares = digitosParesActual;
                numeroConMasPares = numero;
            }
        }
        return numeroConMasPares;
    }

    /**
     * Método auxiliar y privado. Cuenta la cantidad de dígitos pares de un número.
     */
    private int contarDigitosPares(int numero) {
        if (numero == 0) {
            return 1;
        }

        int count = 0;
        int numeroActual = numero;

        while (numeroActual != 0) {
            int digito = numeroActual % 10;
            if (digito % 2 == 0) {
                count++;
            }
            numeroActual /= 10;
        }
        return count;
    }
    
         
        // Encuentra el múltiplo común más alto de x e y en el rango [0, 1000].
        
        public static int encontrarMultiploMasAlto(int x, int y) {
            // Se itera en orden descendente para encontrar el más alto primero.
            for (int i = 1000; i > 0; i--) {
                if (i % x == 0 && i % y == 0) {
                    return i;
                }
            }
            return -1; // No se encontró ningún múltiplo común.
        }
    
}
    
    
