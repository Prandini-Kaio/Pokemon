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

    public long getId();
    public void setId(long id);

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

    public default void setStrike(int index)
    {
        setCurrentStrike(getListStrikes().get(index));
        System.out.println("Seu golpe atual é: " + getCurrentStrike().getNameStrike());
    }
    
    public default void showStrikes()
    {
        for(int i = 0; i < getListStrikes().size(); i++)
        {
            System.out.println(i + " - " + getListStrikes().get(i).getNameStrike());
            System.out.println("    - Damage: " + getListStrikes().get(i).getDamageStrike());
        }
    }

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