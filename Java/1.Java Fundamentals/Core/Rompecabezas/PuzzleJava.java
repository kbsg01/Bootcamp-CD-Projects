import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * PuzzleJava
 */
public class PuzzleJava {

    public static void main(String[] args) {
        // int[] testArreglo = {3,5,1,2,7,9,8,13,25,32};
        // mayorQue10(testArreglo);

        // String [] testLista = {"Nancy", "Jinichi", "Fujibayashi", "Momochi", "Ishikawa"};
        // mezclaNombres(testLista);

        // mezclarAlfabeto();

        // numerosAleatorios();

        numerosAleatorios2();

        // cadenaAleatoria();

        // cadenaAleatoria2();
    }

    public static void mayorQue10(int [] arreglo) {
        ArrayList<Integer> nuevoArreglo = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i< arreglo.length; i++){
            sum += arreglo[i];
            if(arreglo[i] > 10){
                nuevoArreglo.add(arreglo[i]);
            }
        }
        System.out.println(sum);
        System.out.println(nuevoArreglo);
    }

    public static void mezclaNombres(String [] lista) {
        ArrayList<String> nuevaLista = new ArrayList<String>();
        ArrayList<String> nuevaLista5 = new ArrayList<String>();
        for(int i = 0; i < lista.length; i++){
            if(lista[i].length() > 5){
                nuevaLista5.add(lista[i]);
            }
            nuevaLista.add(lista[i]);
        }
        Collections.shuffle(nuevaLista);
        System.out.println(nuevaLista);
        System.out.println(nuevaLista5);
    }

    public static void mezclarAlfabeto() {
        ArrayList<String> arregloAlfa = new ArrayList<String>();
        for(char alpha = 'a'; alpha<='z'; alpha++){
            arregloAlfa.add(Character.toString(alpha));
        }
        System.out.println(arregloAlfa);
        Collections.shuffle(arregloAlfa);
        System.out.println(arregloAlfa);

        System.out.println("La primera letra del arreglo mezclado es: " + arregloAlfa.get(0));
        System.out.println("La ultima letra del arreglo mezclado es: " + arregloAlfa.get(25));
        String muestra = arregloAlfa.get(0);

        if("aeiou".indexOf(muestra) > 0){
            System.out.println("Parece que la primera es una vocal!");
        }
    }

    public static void numerosAleatorios() {
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
        for(int i = 0; i<10; i++){
            int num = ThreadLocalRandom.current().nextInt(55,101);
            numerosAleatorios.add(num);
        }
        System.out.println(numerosAleatorios);
    }


    public static void numerosAleatorios2() {
        ArrayList<Integer> numerosAleatorios2 = new ArrayList<Integer>();
        int min = 101;
        int max = 55;
        for(int i = 0; i<10; i++){
            int num2 = ThreadLocalRandom.current().nextInt(55,101);
            numerosAleatorios2.add(num2);
                if(num2 < min){
                min=num2;
                }
                if(num2 > max){
                max = num2;
                }
            }
        Collections.sort(numerosAleatorios2);
        System.out.println(numerosAleatorios2);
        System.out.println("El valor minimo del arreglo es: "+ min);
        System.out.println("El valor maximo del arreglo es: "+ max);
    }

    public static void cadenaAleatoria() {
        Random aleatorio = new Random();
        StringBuilder cadenaAleatoria = new StringBuilder();
        String alfaNumerica = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i < 5; i++){
            cadenaAleatoria.append(alfaNumerica.charAt(aleatorio.nextInt(alfaNumerica.length())));
        }
        String cadenaFinal = cadenaAleatoria.toString();
        System.out.println(cadenaFinal);
    }

    public static void cadenaAleatoria2() {
        Random aleatorio = new Random();
        StringBuilder cadenaAleatoria = new StringBuilder();
        ArrayList<String> listaAleatoria = new ArrayList<String>();
        String alfaNumerica = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for(int i = 0; i <10; i++){
            for(int j = 0; j < 5; j++){
                cadenaAleatoria.append(alfaNumerica.charAt(aleatorio.nextInt(alfaNumerica.length())));
            }
            String cadenaFinal = cadenaAleatoria.toString();
            listaAleatoria.add(cadenaFinal);
            cadenaAleatoria.setLength(0);
        }
        System.out.println(listaAleatoria);
    }
}