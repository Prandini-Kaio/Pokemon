package Screen.Batalha.MeuTurno;

import java.util.Scanner;

import Pokemons.Pokemon;

public class FriendlyAttack {
    
    Scanner scanner = new Scanner(System.in);

    public FriendlyAttack(Pokemon myPokemon, Pokemon enemyPokemon)
    {
        System.out.println("Qual golpe deseja usar?");
        for(int i = 0; i < myPokemon.getListStrikes().size(); i++)
        {
            System.out.println(i + " - " + myPokemon.getListStrikes().get(i).getNameStrike());
            System.out.println("    - Damage: " + myPokemon.getListStrikes().get(i).getDamageStrike());
        }
        
        int op = scanner.nextInt();

        try{
            myPokemon.setCurrentStrike(myPokemon.getListStrikes().get(op));
            System.out.println("O golpe escolhido foi: " + myPokemon.getListStrikes().get(op).getNameStrike());
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
