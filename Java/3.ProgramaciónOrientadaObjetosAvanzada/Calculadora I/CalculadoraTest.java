import Calculadora.Calculadora;
public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora testCal1 = new Calculadora(10.5, "+", 5.2);
        Calculadora testCal3 = new Calculadora(15.3, "+", 2.5);

        testCal1.perfomOperation();
        testCal3.perfomOperation();
        testCal1.getResult();
        testCal3.getResult();
    }
}
