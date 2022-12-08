import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * ArreglosTest
 */
public class ArreglosTest {
    public static void main(String[] args) {
        HashMap<String, Integer> frutas = new HashMap<>();
        frutas.put("Mangos", 12);
        frutas.put("Naranjas", 7);
        frutas.put("Manzanas", 16);

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Karla");
        nombres.add("Jane Doe");
        nombres.add("David");

        // ArrayList
        for(String nombre : nombres){
            System.out.println(nombre);
        }

        // HashMap
        for(String key : frutas.keySet()) {
            System.out.println(key + ": " + frutas.get(key));
        }

        System.out.println(frutas);
        System.out.println(nombres);
    }
}