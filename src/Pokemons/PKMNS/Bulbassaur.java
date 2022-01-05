package Pokemons.PKMNS;

import java.util.List;

import Pokemons.Pokemon;
import Pokemons.Strikes.*;

public class Bulbassaur implements Pokemon{

    private String namePokemon;
    private String surnamePokemon;

    private int currentLife;
    private int maxLife = 100;

    private List<Strike> listStrike;
    private Strike currentStrike;

    public Bulbassaur()
    {
        this.currentLife = maxLife;
        this.currentStrike = new Punch();
        this.namePokemon = "Bulbassaur";

        if(surnamePokemon == null)
        {
            surnamePokemon = namePokemon;
        }
    }

    @Override
    public int getCurrentLife() {
        return currentLife;
    }

    @Override
    public void setCurrentLife(int life) {
        this.currentLife = life;
    }

    @Override
    public int getMaxLife() {
        return maxLife;
    }

    @Override
    public void setMaxLife(int maxLife) {
        this.maxLife = maxLife;
    }

    @Override
    public Strike getCurrentStrike() {
        return currentStrike;
    }

    @Override
    public void setCurrentStrike(Strike currentStrike) {
        this.currentStrike = currentStrike;
    }

    @Override
    public List<Strike> getListStrikes() {
        return listStrike;
    }

    @Override
    public void setListStrikes(List<Strike> strikeList) {
        this.listStrike = strikeList;
    }

    @Override
    public String getName() {
        return namePokemon;
    }

    @Override
    public String getSurname() {
        return surnamePokemon;
    }

    @Override
    public void setSurname(String surname) {
        this.surnamePokemon = surname;
    }
}
