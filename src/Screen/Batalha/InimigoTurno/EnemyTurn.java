package Screen.Batalha.InimigoTurno;
import Pokemons.*;

public class EnemyTurn {

    public EnemyTurn(Pokemon enemyPokemon, Pokemon friendlyPokemon)
    {
        new EnemyAttack(enemyPokemon, friendlyPokemon);
    }
}
