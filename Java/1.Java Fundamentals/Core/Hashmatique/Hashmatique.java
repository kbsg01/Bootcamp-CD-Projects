import java.util.HashMap;
import java.util.Set;

public class Hashmatique {

    public static void main(String[] args) {

        // Crear un trackList tipo HashMap
        // Que incluya 4 canciones
        // la letra de cada cancion debe estar asociada al titulo de la cancion
        HashMap<String, String> trackList = new HashMap<String, String>();
        trackList.put("Miss You", "Don't fret/I don't ever wanna see you/ And I never wanna miss you again...");
        trackList.put("Paranoid", "I need someone to show me the things/In life that I can't find...");
        trackList.put("Useless", "'Cause I'm useless when you're stuck in my mind/I've been foolish, think of you all the time...");
        trackList.put("Jungle", "Welcome to the jungle/Are you gonna dance with me?/Welcome to the jungle/You got to close your eyes to see...");

        // obtener la letra de la cancion por el titulo
        String track = trackList.get("Jungle");
        System.out.println(track);

        // se imprime el titulo y la letra de la cancion
        Set<String> keys = trackList.keySet();
        for(String key : keys){
            System.out.println("Titulo: " + key);
            System.out.println("Letras: " + trackList.get(key));
        }
    }
}