// Crear una función que reverse una cadena de caracteres. No utilizar las funciones predefinidas del lenguaje.
// Ejemplo:
// - Entrada
// "ojoD gnidoC"

// -Salida
// "Coding Dojo"
String cadena = "ojoD gnidoC";
		// Esta será la cadena invertida, primero está vacía
		String invertida = "";
		// Recorremos la original del final al inicio
		for (int indice = cadena.length() - 1; indice >= 0; indice--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			invertida += cadena.charAt(indice);
		}
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);


// Crear un algoritmo que devuelva el mayor valor de un arreglo.
// Ejemplo:
// arr = [1, 3, 5, 2]

// -Salida
// 5
arr = [1, 3, 5, 2]
posicion=[];
for(int i=0; i < arr.length; i++){
    for(int j = 0; j > i;  ){

    }
}
public void imprimirValorMaximo(int [1, 3, 5, 2] valorMaximo)
    {
        int array2 = valorMaximo[0];
        for (int i = 0; i <valorMaximo.length; i++) 
        {
            if (valorMaximo[i] > array2) 
            {
                array2 = valorMaximo[i];
                
            }
            System.out.println(array2);
        }
        
    }
