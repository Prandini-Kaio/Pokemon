package Screen.Batalha.InimigoTurno;

import Pokemons.Pokemon;

public class EnemyAttack {
    

    public EnemyAttack(Pokemon enemyPokemon, Pokemon friendlyPokemon)
    {
        System.out.println(enemyPokemon.getName() + " ataca usando " + enemyPokemon.getCurrentStrike().getNameStrike());
        enemyPokemon.setCurrentStrike(RandomThingsEnemy.randomStrike());
        enemyPokemon.atacar(friendlyPokemon);
        System.out.println("A vida de seu pokemon agora é: " + friendlyPokemon.getCurrentLife());
        if(friendlyPokemon.getCurrentLife() <= 0)
        {
            friendlyPokemon.setCurrentLife(0);
            System.out.println("Seu pokemon foi derrotado, recupere-o e tente de novo");
        }
    }
}
