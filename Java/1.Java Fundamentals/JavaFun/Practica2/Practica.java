

public class Practica {
    public static void main(String[] args) {
        float salarioTotal = calcularSalario(50, 16.50f);
        System.out.println(Saludar("Kai") +", tu salario total fue "+ salarioTotal);
    }

    public static String Saludar(String nombre) {
        return "Hola " + nombre;
        
    }

    public static float calcularSalario (int horas, float valorHora) {
        return horas*valorHora;
    }

    public float[] IngresarNotas(){
        float[] notas = new float[5];
        return notas;
    }
}
