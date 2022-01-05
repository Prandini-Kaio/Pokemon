package Screen;

import java.util.Scanner;

import Controlador.Battle;
import Inventario.Bag;

public class Menu {


    Scanner scanner = new Scanner(System.in);

    public Menu()
    {
        System.out.println("Seja bem vindo treinador!");
        System.out.println("O que deseja fazer hoje?");
        System.out.println("1 - Cacar 2 - Ver minhas conquistas 3  - Sair");

        int op = scanner.nextInt();

        switch(op)
        {
            case 1:
                if(Bag.getBag().getCurrentPokemon().getCurrentLife() > 0)
                {
                    new Battle();
                }else
                {
                    System.out.println("Seu pokemon atual está sem vida, recupero ou troque de pokemon");
                }
                break;
            case 2:
                break;
            case 3:
                break;
        }
    }
}
