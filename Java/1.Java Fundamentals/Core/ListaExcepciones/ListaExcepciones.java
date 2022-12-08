import java.util.ArrayList;

/**
 * ListaExcepciones
 */
public class ListaExcepciones {
    static ArrayList<Object> myList = new ArrayList<Object>();
    public static void main(String[] args) {
        
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");
        for(int i = 0; i < myList.size(); i++) {
            try {
                int castedValue = (Integer) myList.get(i);
            } 
        
            catch (ClassCastException exception) {
                exception.printStackTrace();
                System.out.println("Excepcion capturada en:" + myList.get(i));
            }
        } 
    }
}
