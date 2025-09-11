package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {

ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	public int numerosSumados() {
		int resultadoSuma = 0;
		for(Integer numero: numeros){
			resultadoSuma += numero;                 
	}
		return resultadoSuma;
	}

	public int numerosRestados() {
		int resultadoResta = 0;
		for(Integer numero: numeros){
			resultadoResta -= numero;                 
		}
		return resultadoResta;
	}

	public int numerosMultiplicados() {
		int resultadoMul = 1;
		for(Integer numero: numeros){
			resultadoMul *= numero;                 
		}
		return resultadoMul;
	}

	public void addNumber(int i) {
		numeros.add(i);
	}
	
}
