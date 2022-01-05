package Screen.Batalha.MeuTurno;

import java.util.Scanner;

import Inventario.Bag;

public class ChangePokemon {
    
    Scanner scanner = new Scanner(System.in);

    public ChangePokemon()
    {
        
        System.out.println("Seu pokemon atual é: " + Bag.getBag().getCurrentPokemon().getSurname() + "\n\n");

        System.out.println("Deseja alterar para qual pokemon?\n\n");

        for(int i = 0; i < Bag.getBag().getLisPokemons().size(); i++)
        {
            System.out.println(i + " - " + Bag.getBag().getLisPokemons().get(i).getSurname());
            System.out.println("    - Vida:" + Bag.getBag().getLisPokemons().get(i).getCurrentLife() + "\n");
        }

        int option = scanner.nextInt();

        try{
            Bag.getBag().setCurrentPokemon(Bag.getBag().getLisPokemons().get(option));
        }catch(Exception e)
        {
            System.out.println(e);
        }

        System.out.println("Seu pokemon agora é: " + Bag.getBag().getCurrentPokemon().getSurname());
        return;
    }
}
