package Screen.Batalha.MeuTurno;

import java.util.Scanner;

import Inventario.Bag;
import Pokemons.Pokemon;

public class UsePokebola {
    
    Scanner scanner = new Scanner(System.in);

    public UsePokebola(Pokemon capturePokemon)
    {
        System.out.println("Qual pokebola deseja usar?\n");

        for(int i = 0; i < Bag.getBag().getListPokebola().size(); i++)
        {
            System.out.println(i + " - " + Bag.getBag().getListPokebola().get(i).getName());
            System.out.println("    - Quantidade:" + Bag.getBag().getListPokebola().get(i).getAmout());
            System.out.println("    - %: " + Bag.getBag().getListPokebola().get(i).getCaptureChance());
        }

        int option = scanner.nextInt();

        try{
            Bag.getBag().setCurrentPokebola(Bag.getBag().getListPokebola().get(option));

            Bag.getBag().getCurrentPokebola().capture(capturePokemon);
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
