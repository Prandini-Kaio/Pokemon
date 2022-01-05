package Inventario;
import java.util.*;
import Pokemons.Pokemon;
import Pokemons.PKMNS.*;
import Pokemons.Strikes.*;

public class Bag {
    
    private List<Pokemon> listPokemons = new ArrayList<Pokemon>();
    private Pokemon currentPokemon;

    private Bag()
    {
        Pokemon pk1 = new Bulbassaur();
        Pokemon pk2 = new Charmander();

        pk1.setSurname("pokemon1");
        pk2.setSurname("pokemon2");

        List<Strike> strikeList = new ArrayList<Strike>();
        strikeList.add(new Punch());
        strikeList.add(new Fire());

        pk1.setListStrikes(strikeList);
        pk2.setListStrikes(strikeList);

        listPokemons.add(pk1);
        listPokemons.add(pk2);

        if(currentPokemon == null)
        {
            currentPokemon = listPokemons.get(0);
        }
    }

    private static Bag instance;

    public static Bag getBag(){ 
        if(instance == null)
        {
            instance = new Bag();
        }
        return instance;
    }

    public Pokemon getCurrentPokemon(){ return currentPokemon; }
    public void setCurrentPokemon(Pokemon currentPokemon){ this.currentPokemon = currentPokemon; }

    public List<Pokemon> getLisPokemons(){ return listPokemons; }
}
