package Pokemons.PKMNS;

import java.util.List;

import Pokemons.Pokemon;
import Pokemons.Strikes.*;

public class Charmander implements Pokemon{


    private String name;
    private String surname;
    private int currentLife;
    private int maxLife = 100;
    private List<Strike> lStrikes;
    private Strike currentStrike;

    public Charmander()
    {
        this.name = "Charmander";
        this.currentLife = this.maxLife;
        this.currentStrike = new Punch();

        if(surname == null)
        {
            this.surname = name;
        }
    }


    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public String getSurname() {
        // TODO Auto-generated method stub
        return surname;
    }

    @Override
    public void setSurname(String surname) {
        // TODO Auto-generated method stub
        this.surname = surname;
    }

    @Override
    public int getCurrentLife() {
        // TODO Auto-generated method stub
        return currentLife;
    }

    @Override
    public void setCurrentLife(int life) {
        // TODO Auto-generated method stub
        this.currentLife = life;
    }

    @Override
    public int getMaxLife() {
        // TODO Auto-generated method stub
        return maxLife;
    }

    @Override
    public void setMaxLife(int maxLife) {
        // TODO Auto-generated method stub
        this.maxLife = maxLife;
    }

    @Override
    public Strike getCurrentStrike() {
        // TODO Auto-generated method stub
        return currentStrike;
    }

    @Override
    public void setCurrentStrike(Strike currentStrike) {
        // TODO Auto-generated method stub
        this.currentStrike = currentStrike;
    }

    @Override
    public List<Strike> getListStrikes() {
        // TODO Auto-generated method stub
        return lStrikes;
    }

    @Override
    public void setListStrikes(List<Strike> strikeList) {
        // TODO Auto-generated method stub
        this.lStrikes = strikeList;
    }
    
}
