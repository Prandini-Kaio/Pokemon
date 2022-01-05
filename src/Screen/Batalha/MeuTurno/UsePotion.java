package Screen.Batalha.MeuTurno;

import java.util.Scanner;

import Inventario.Bag;
import Pokemons.Pokemon;

public class UsePotion {
    
    Scanner scanner = new Scanner(System.in);

    public UsePotion(Pokemon healPokemon)
    {
        System.out.println("Qual pocao deseja usar?\n");

        for(int i = 0; i < Bag.getBag().getListPotions().size(); i++)
        {
            System.out.println(i + " " + Bag.getBag().getListPotions().get(i).getName());
            System.out.println("    - Quantidade: " + Bag.getBag().getListPotions().get(i).getAmount());
            System.out.println("    - Cura: " + Bag.getBag().getListPotions().get(i).getHeal());
        }

        int option = scanner.nextInt();

        try
        {
            Bag.getBag().setCurrentPotion(Bag.getBag().getListPotions().get(option));
            Bag.getBag().getCurrentPotion().curar(healPokemon);
            System.out.println("Seu pokemon recuperou " + Bag.getBag().getCurrentPotion().getHeal() + " de vida.");
            System.out.println("Sua vida agora e " + healPokemon.getCurrentLife());
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
