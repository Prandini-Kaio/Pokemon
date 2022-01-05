package Inventario;
import java.util.*;

import Pokebola.Pokebola;
import Pokebola.PokebolaComum;
import Pokemons.Pokemon;
import Pokemons.PKMNS.*;
import Pokemons.Pokemon.Rarity;
import Pokemons.Strikes.*;

public class Bag {
    
    private List<Pokemon> listPokemons = new ArrayList<Pokemon>();
    private Pokemon currentPokemon;

    private List<Pokebola> listPokebola = new ArrayList<Pokebola>();
    private Pokebola currentPokebola;

    private Bag()
    {
        //Pokemons
        Pokemon pk1 = new Bulbassaur(Rarity.Comum);

        //Apelidos
        pk1.setSurname("Bulbassaurinho");

        //Golpes
        List<Strike> strikeList = new ArrayList<Strike>();
        strikeList.add(new Punch());
        strikeList.add(new Fire());

        pk1.setListStrikes(strikeList);

        //Adicionar Pokemon
        listPokemons.add(pk1);

        if(currentPokemon == null)
        {
            currentPokemon = listPokemons.get(0);
        }

        Pokebola pokebola = new PokebolaComum();

        pokebola.setAmount(10);
        listPokebola.add(pokebola);
        currentPokebola = pokebola;
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
    public void setListPokemon(List<Pokemon> listPokemon){ this.listPokemons = listPokemon;}

    public Pokebola getCurrentPokebola(){ return this.currentPokebola; }
    public void setCurrentPokebola(Pokebola currentPokebola){ this.currentPokebola = currentPokebola; }

    public List<Pokebola> getListPokebola(){ return this.listPokebola; }
    public void setListPokebola(List<Pokebola> listPokebola){ this.listPokebola = listPokebola; }
}
