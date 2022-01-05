package Pokebola;

import java.util.Random;

import Controlador.Battle;
import Inventario.Bag;
import Pokemons.Pokemon;

public interface Pokebola {
    
    Random random = new Random();

    public String getName();

    public float getCaptureChance();

    public int getAmout();
    public void setAmount(int amount);

    public default void capture(Pokemon capturePokemon)
    {
        if(this.getAmout() > 0)
        {
            this.setAmount(this.getAmout() -1);
            
            //Chance randomica de capturar
            float randomChance = random.nextFloat() * 100;
            float captureChancePokemon = capturePokemon.getCaptureChance() - (capturePokemon.getCurrentLife()/10);

            if(randomChance <= captureChancePokemon)
            {
                System.out.println("Capture chance pokemon: " + captureChancePokemon);
                System.out.println("Random attach: " + randomChance);
                System.out.println("Capturado");
                Bag.getBag().getLisPokemons().add(capturePokemon);
                Battle.stopBattle();
            }else
            {
                System.out.println("Capture chance pokemon: " + captureChancePokemon);
                System.out.println("Random attach: " + randomChance);

                float scapeChance = random.nextFloat()*100;
                if(scapeChance <= 50)
                {
                    System.out.println("Fugiu");
                    Battle.stopBattle();
                }else{
                    System.out.println("Tente de novo");
                }
            }
        }
    } 
}
