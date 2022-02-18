package Pokemons.PKMNS;

import java.util.List;

import Pokemons.Pokemon;
import Pokemons.Strikes.*;

public class Bulbassaur implements Pokemon{

    private long id;

    private String namePokemon;
    private String surnamePokemon;

    private int currentLife;
    private int maxLife = 100;

    private List<Strike> listStrike;
    private Strike currentStrike;

    private Rarity rarity;
    
    private float captureChance;

    public Bulbassaur(Rarity raridade)
    {
        this.currentLife = maxLife;
        this.currentStrike = new Punch();
        this.namePokemon = "Bulbassaur";
        this.rarity = raridade;

        if(surnamePokemon == null)
        {
            surnamePokemon = namePokemon;
        }
        switch(rarity)
        {
            case Comum:
                this.captureChance = 50;
                break;
            case Incomum:
                this.captureChance = 35;
                break;
            case Raro:
                this.captureChance = 15;
                break;
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
    public long getId() {
        return this.id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    @Override
    public String getSurname() {
        return surnamePokemon;
    }

    @Override
    public void setSurname(String surname) {
        this.surnamePokemon = surname;
    }

    @Override
    public Rarity getRarity() {
        return this.rarity;
    }

    @Override
    public void setRarity(Rarity raridade) {
        this.rarity = raridade;
    }

    @Override
    public float getCaptureChance() {
        return this.captureChance;
    }

    @Override
    public void setCaptureChance(float captureChance) {
        this.captureChance = captureChance;
    }
}
