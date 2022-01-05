package Pokemons;

import java.util.*;

import Pokemons.Strikes.Strike;

public interface Pokemon {
    
    enum Rarity
    {
        Comum,
        Incomum,
        Raro
    }

    public String getName();

    public String getSurname();
    public void setSurname(String surname);

    public int getCurrentLife();
    public void setCurrentLife(int life);

    public int getMaxLife();
    public void setMaxLife(int maxLife);

    public Strike getCurrentStrike();
    public void setCurrentStrike(Strike currentStrike);

    public List<Strike> getListStrikes();
    public void setListStrikes(List<Strike> strikeList);

    public Rarity getRarity();
    public void setRarity(Rarity raridade);

    public float getCaptureChance();
    public void setCaptureChance(float captureChance);

    public default void atacar(Pokemon receivingPokemon)
    {
        try{
            if(receivingPokemon.getCurrentLife() > 0)
            {
                receivingPokemon.setCurrentLife(receivingPokemon.getCurrentLife() 
                - this.getCurrentStrike().getDamageStrike());
            }
        }catch(Exception e)
        {
            System.out.print(e);
        }
    }
}
