public class ManipuladorCadenasTest {

    public static void main(String[] args) {

        ManipuladorCadenas manipuladorCadenas = new ManipuladorCadenas();
        
        String cadena = manipuladorCadenas.trimAndConcat(" Hola "," Mundo ");
        System.out.println(cadena); //HaloMundo

        char ch = 'n';
        int a = manipuladorCadenas.getIndexOrNull("Coding", ch);
        int b = manipuladorCadenas.getIndexOrNull("Hola Mundo", ch);
        int c = manipuladorCadenas.getIndexOrNull("Saludar", ch);
        System.out.println(a); // 4
        System.out.println(b); // 7
        System.out.println(c); //-1

        
        String word = "Hola";
        String subString = "la";
        String notSubString = "mundo";
        Integer d = manipuladorCadenas.getIndexOrNull(word, subString);
        Integer e = manipuladorCadenas.getIndexOrNull(word, notSubString);
        System.out.println(d); // 2
        System.out.println(e); // -1

        String word1 = manipuladorCadenas.concatSubString("Hola", 1, 3, "mundo");
        System.out.println(word1);
    }
    
}