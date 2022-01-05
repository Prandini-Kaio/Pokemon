package Controlador;
import Inventario.Bag;
import Pokemons.Pokemon;
import Pokemons.PKMNS.Bulbassaur;
import Screen.Batalha.InimigoTurno.EnemyTurn;
import Screen.Batalha.MeuTurno.*;

public class Battle {

    Bag bag;
    
    private boolean inBattle = true;
    private boolean myTurn = true;

    private Pokemon friendlyPokemon = Bag.getBag().getCurrentPokemon();
    private Pokemon enemyPokemon = new Bulbassaur();

    //private Scanner scanner = new Scanner(System.in);

    public Battle()
    {
        while(inBattle)
        {
            if(myTurn)
            {
                new MyTurn(friendlyPokemon, enemyPokemon);
                myTurn = false;
            }else
            {
                new EnemyTurn(enemyPokemon, friendlyPokemon);
                myTurn = true;
            }
            if(enemyPokemon.getCurrentLife() <= 0||friendlyPokemon.getCurrentLife() <=0 ){ stopBattle(); }
        }
        return;
    }

    private void stopBattle()
    {
        inBattle = false;
    }

    public Pokemon getFriendlyPokemon(){ return friendlyPokemon; }
    public Pokemon getEnemyPokemon(){ return enemyPokemon; }
}
