/**
 * 
 */
package Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.performOperation(10.5);
		calc.performOperation("+");
		calc.performOperation(5.2);
		calc.performOperation("*");
		calc.performOperation(10);
		calc.performOperation("=");
		calc.getResults();
	}
}
