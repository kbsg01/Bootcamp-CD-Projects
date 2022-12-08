import Pokemon.Pokedex;
import Pokemon.Pokemon;

public class PokemonTest {
    public static void main(String[] args) {
        Pokedex x = new Pokedex();

        Pokemon poke1 = x.createPokemon("Pikachu", 100, "Electrico");
        Pokemon poke2 = x.createPokemon("Squirtle", 50, "Agua");
        Pokemon poke3 = x.createPokemon("Snorlax", 160, "Normal");

        System.out.println(x.pokemonInfo(poke1));
        System.out.println(x.pokemonInfo(poke2));
        System.out.println(x.pokemonInfo(poke3));



        x.addPokemon(poke1);
        x.addPokemon(poke3);
        x.addPokemon(poke2);

        poke1.attackPokemon(poke3);
        System.out.println(poke3.getHealth());

        System.out.println(Pokemon.getCount());
    }
}
