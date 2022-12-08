public class CadenaInvertida {

    public static void main(String[] args) {
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
    }
}