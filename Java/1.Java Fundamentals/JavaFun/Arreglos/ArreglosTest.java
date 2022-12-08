import java.util.ArrayList;

/**
 * ArreglosTest
 */
public class ArreglosTest {

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();
        Arreglos arreglos = new Arreglos();
        arreglos.agregarNotas(notas, 5);

        for (int i = 0; i< notas.size(); i++) {
            System.out.println(notas.get(i));
        }
        double salario = 12.32;
        arreglos.clacularSalario(10, salario);

        System.out.println("El salario es " + salario);

    }
}
