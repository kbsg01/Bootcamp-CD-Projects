package Calculadora;

import java.util.ArrayList;
import java.util.Iterator;

public class Calculadora {
	ArrayList<String> operadores = new ArrayList<String>();
	ArrayList<Double> numeros = new ArrayList<Double>();
	Double resultado;
	
	public Calculadora() {
		
	}
	public void performOperation(double dub) {
		numeros.add(dub);
	}
	public void performOperation(int dub) {
		numeros.add((double)dub);
	}
	public void performOperation(String str) {
		if (str != "=") {
			operadores.add(str);
		}
		else {
			Double inicio = numeros.get(numeros.size()-1);
			for (int i = operadores.size()-1; i>=0; i--) {
				switch(operadores.get(i)) {
				case "+" : inicio = inicio + numeros.get(i); break;
				case "-" : inicio = inicio - numeros.get(i); break;
				case "*" : inicio = inicio * numeros.get(i); break;
				case "/" : inicio = inicio / numeros.get(i); break;
				default: System.out.println("Operador invalido."); break;
				}
			}	
			this.resultado = inicio;
		}
	}
	public void getResults() {
		System.out.println(this.resultado);
	}
}

