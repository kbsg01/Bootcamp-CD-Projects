// import java.util.MissingFormatWidthException;

// import javax.swing.plaf.multi.MultiSplitPaneUI;

public class Algortimos {

    public static void main(String[] args) {
        cadenaRepetidos();
    }
// 1. ////////////////////////////
// Generar un algoritmo que tome una cadena y devuelva un nueva cadena con sus dos caracteres repetidos al principio y al final.

// Input
//     "Gato"
// Output
//     "GaGatoto"


// Input
//     "Coding Dojo"
// Output
//     "CoCoding Dojojo"
    public static void cadenaRepetidos(){
        String palabra = "Gato";
        String agregarA = "Ga";
        String agregarB = "to";
        System.out.println(agregarA+palabra+agregarB);
        String frase = "Coding Dojo";
        String agregarC = "Co";
        String agregarD = "jo";
        System.out.println(agregarC+frase+agregarD);
    }

    // 2. ////////////////////////////
// Generar un algoritmo que nos devuelva true si un arreglo de números es en tipo montaña o no, es decir, el arreglo siempre va en ascenso hasta que empieza a descencer y ahí va todo en descenso.

// Input:
// 	[2,3,4,5,8,5,3,2]
// Output
// 	El arreglo es de tipo montaña.


// Input
// 	[1,2,3,3,4,5,6,4,3,2]
// Output
// 	El arreglo no tiene un formato de montaña
    public static void arregloAcendente() {
        
    }
}






