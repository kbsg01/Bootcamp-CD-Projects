import java.util.ArrayList;

public class Arreglos {
    public void agregarNotas(ArrayList<Double> notas, int numeroNotas){
        for(int i = 0; i < numeroNotas; i++) {
            notas.add(i * 2.24);
        }
    }
    public void clacularSalario(int horas, double salario) {
        salario = 1;
    }
}

// Acabamos de ver arreglos dinamicos y pasar valores por referencia
