import java.util.HashMap;
import java.util.Set;
public class HashMapFun {
    public static void main(String[] args) {
        HashMap<String, String> userMap = new HashMap<String, String>();
        userMap.put("nninja@codingdojo.com", "Nancy Ninja");
        userMap.put("ssamurai@codingdojo.com", "Sam Samurai");
        userMap.put("wwizard@codingdojo.com", "Walter Wizard");

        String nombre = userMap.get("nninja@codingdojo.com");
        System.out.println("El nombre completo es: " + nombre);
        // se obtiene la key con el metodo keySet
        Set<String> keys = userMap.keySet();
        for(String key : keys) {
            System.out.println(key);
            System.out.println(userMap.get(key));
        }
    }
}
