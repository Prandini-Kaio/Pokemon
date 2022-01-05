package Controlador;

import Inventario.Bag;
import Pokemons.Pokemon;
import Pokemons.PKMNS.*;
import Pokemons.Pokemon.Rarity;
import Screen.Batalha.InimigoTurno.EnemyTurn;
import Screen.Batalha.MeuTurno.*;

public class Battle {

    Bag bag;
    
    private static boolean inBattle = true;
    private static boolean myTurn = true;

    private Pokemon friendlyPokemon = Bag.getBag().getCurrentPokemon();
    private Pokemon enemyPokemon = new Bulbassaur(Rarity.Raro);

    //private Scanner scanner = new Scanner(System.in);

    public Battle()
    {
        inBattle = true;

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

    public static void startBattle()
    {
        inBattle = true;
    }

    public static void stopBattle()
    {
        inBattle = false;
    }

    public Pokemon getFriendlyPokemon(){ return friendlyPokemon; }
    public Pokemon getEnemyPokemon(){ return enemyPokemon; }
}
