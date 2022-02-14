package DB;

import java.sql.SQLException;
import java.util.List;

import Pokemons.Pokemon;

public interface DataBase
{
    public void savePokemon(Pokemon pokemon);
}
