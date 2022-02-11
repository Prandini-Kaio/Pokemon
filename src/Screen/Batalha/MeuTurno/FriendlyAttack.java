package Screen.Batalha.MeuTurno;

import java.util.Scanner;

import Pokemons.Pokemon;

public class FriendlyAttack {
    
    Scanner scanner = new Scanner(System.in);

    public FriendlyAttack(Pokemon myPokemon, Pokemon enemyPokemon)
    {
        System.out.println("Qual golpe deseja usar?");
        myPokemon.showStrikes();
        
        int op = scanner.nextInt();

        try{
            myPokemon.setStrike(op);
            myPokemon.atacar(enemyPokemon);
            System.out.println("A vida de " + enemyPokemon.getName() + " agora é de " + enemyPokemon.getCurrentLife());
        }catch(Exception e)
        {
            System.out.println(e);
        }

        if(enemyPokemon.getCurrentLife() <= 0)
        {
            enemyPokemon.setCurrentLife(0);
            System.out.println("O pokemon inimigo foi derrotado");
        }
        return;
    }
}
