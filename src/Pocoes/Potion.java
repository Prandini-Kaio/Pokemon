package Pocoes;

import Pokemons.Pokemon;

public interface Potion {
    
    public String getName();

    public int getAmount();
    public void setAmount(int amount);

    public int getHeal();

    public default void curar(Pokemon healPokemon)
    {
        if(getAmount() > 0 && healPokemon.getCurrentLife() > 0)
        {
            healPokemon.setCurrentLife(healPokemon.getCurrentLife() + getHeal());
        }else if(healPokemon.getCurrentLife() >= healPokemon.getMaxLife())
        {
            healPokemon.setCurrentLife(healPokemon.getMaxLife());
        }
    }
}
