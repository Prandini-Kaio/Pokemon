package Screen.Batalha.MeuTurno;

import java.util.Scanner;

import Pokemons.Pokemon;

public class UseItem {
    
    Scanner scanner = new Scanner(System.in);

    public UseItem(Pokemon friendlyPokemon, Pokemon enemyPokemon)
    {
        System.out.println("Qual item deseja usar?");
        System.out.println("1 - Pokebolas 2 - Pocoes");

        int option = scanner.nextInt();
        
        if(option == 1)
        {
            new UsePokebola(enemyPokemon);
        }else if(option == 2)
        {
            System.out.println("Pocoes");
        }else
        {
            System.out.println("Opcao invalida");
            return;
        }
    }
}
