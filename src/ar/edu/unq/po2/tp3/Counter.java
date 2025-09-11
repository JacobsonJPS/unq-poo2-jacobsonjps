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
}