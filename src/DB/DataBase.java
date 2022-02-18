package DB;

import java.sql.SQLException;
import java.util.List;

import Pokemons.Pokemon;

public interface DataBase
{
    public long insertPokemon(Pokemon pokemon);
    public int getPokemonData(long id);
    public long updatePokemon(Pokemon pokemon);
    public long deletePokemon(long id);
}
