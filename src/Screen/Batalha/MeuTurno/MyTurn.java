package Screen.Batalha.MeuTurno;

import java.util.Scanner;
import Pokemons.Pokemon;

public class MyTurn {
    
    private Scanner scanner = new Scanner(System.in);

    public MyTurn(Pokemon myPokemon, Pokemon enemyPokemon)
    {
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Atacar 2 - Mudar Pokemon 3 - Fugir");

        int op = scanner.nextInt();

        switch(op)
        {
            case 1:
                new FriendlyAttack(myPokemon, enemyPokemon);
                break;
            case 2:
                new ChangePokemon();
                break;
            case 3:
                break;
        }
        return;
    }
}
