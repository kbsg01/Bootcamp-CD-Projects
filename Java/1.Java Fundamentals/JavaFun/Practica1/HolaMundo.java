/*
 * HolaMundo
 */
public class HolaMundo {
    public static void main(String[] args) {
        // datos nomales
        String nombre = "Kai";
        System.out.println("Hola " + nombre);
        int edad = 21;
        int dias = 365;
        // double precio = 2.54;
        // float peso = 3.45f;
        // boolean esRojo = true;
        int valor = edad * dias;
        System.out.println(valor);
        //tambien se puede declarar asi, con el valor dentro de los corchetes
        // boolean[] respuestas = new boolean[10];    

        // si tenemos los valores es recomendable hacerlo de esta forma
        // String[] estudiantes = new String[] {"valor", "valor", "valor", "valor"};

        // arreglos de tamaño fijo
        int[] notas = new int []{2, 5};
        // for (int i = 0; i < notas.length; i++) {
        //     notas[i] = i*2;
        // }
        for (int i = 0; i < notas.length; i++) {
            System.out.println("nota " + notas[i]);
        }


        // arreglos de tamaño variable (mas adelante sera revisado)
    }
}
