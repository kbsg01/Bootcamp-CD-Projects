import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class BasicJava {
    public static void main(String[] args) {
        cambiaValores();
    }
    // imprime desde 1 a 255
    public static void imprimeNumeros(String[] args) {
        for(int i = 1; i < 256; i++){
            System.out.println(i);
        }
    }



    // imprime numeros impares entre 1 y 255
    public static void imprimeImpares(String[] args) {
        for(int i = 0; i < 256; i++){
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
    }

    // imprime la suma
    public static void imprimeSuma(String[] args) {
        int suma = 0;
        for (int i = 0; i < 256; i++){
            System.out.println("Nuevo número: " + i);
            System.out.println("Suma:" + (suma += i));
        }
    }

    // recorrer un arreglo
    public static void recorreArreglo(String[] args) {
        int [] miArreglo = {2, 4, 8, 14, 35, 42};
        Arrays.sort(miArreglo);
        for(int arr: miArreglo){
            System.out.println(arr);
        }
    }

    // Enceuntra el maximo
    public static void encuentraElMax(String[] args) {
        Integer [] num = {-5, -8, 8, 0};
        int max = Collections.max(Arrays.asList(num));
        System.out.println("El maximo del array es: " + max);
    }

    // Obtener el promedio
    public static void promedio(int [] arreglo) {
        int [] arrayPromedio = {2,10,3};
        int suma = 0;
        for(int i = 0; i< arrayPromedio.length; i++){
            suma += arrayPromedio[i];
        }
        System.out.println("El promedio es: " + (double)suma / arrayPromedio.length);
    }

    // arreglo con numeros impares
    public static void arregloConImpares() {
        ArrayList<Integer> arreglo = new ArrayList<>();
        for(int i = 1; i < 256; i++){
            if(i % 2 == 1){
                arreglo.add(i);
            }
        }
        System.out.println(arreglo);
    }

    // mayor que y

    public static void mayorQueY() {
        int[] arreglo = {2, 5, 3, 6, 30, 27};
        int y = 3;
        int cuenta = 0;
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] > y){
                cuenta ++;
            }
        }
        System.out.println(cuenta);
    }

    // valores al cuadrado
    public static void valoresAlCuadrado() {
        int[] arreglo = {1, 2, 3, 4};
        int[] nuevoArreglo = new int[arreglo.length];
        int cuadrado;
        for(int i = 0; i < arreglo.length; i++){
            cuadrado = arreglo[i] * arreglo[i];
            nuevoArreglo[i] = cuadrado;
        }
        System.out.println(Arrays.toString(nuevoArreglo));
    }

    // eliminar numeros negativos
    
    public static void eliminaNegativos(int[] arreglo) {
        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i]<0){
                arreglo[i] = 0;
                
            }
            System.out.println(arreglo[i]);
        }
    }

    // min, max, prom

    public static void minMaxProm() {
        int[] arreglo = {1,5,10,-2};
        int max = arreglo[0];
        int min =  arreglo[0];
        int sum = 0;

        for(int i = 0; i < arreglo.length; i++){
            if(arreglo[i] > max){
                max = arreglo[i];
            }
            if(arreglo[i] < min){
                min = arreglo[i];
            }
            sum += arreglo[i];
        }
        System.out.println("El maximo es: " + max);
        System.out.println("El minimo es: " + min);
        System.out.println("El promedio es: " + (double)sum / arreglo.length);
    }

    // cambia valores en arreglo

    public static void cambiaValores() {
        ArrayList<Integer> nuevoArreglo = new ArrayList<>();
        int[] arreglo = {1,5,10,7,-2};
        for(int i = 0; i < arreglo.length; i++){
            if(i == arreglo.length - 1){
                nuevoArreglo.add(0);
            } else{
                nuevoArreglo.add(arreglo[i + 1]);
            }
        }
        System.out.println(nuevoArreglo + ",");
    }
}