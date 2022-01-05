package Pokemons.Strikes;

public class Punch implements Strike{

    private String strikeName;
    private int strikeDamage;

    public Punch()
    {
        this.strikeName = "Punch";
        this.strikeDamage = 10;
    }

    @Override
    public String getNameStrike() {
        return strikeName;
    }

    @Override
    public int getDamageStrike() {
        return strikeDamage;
    }

    @Override
    public void setDamageStrike(int damage) {
        this.strikeDamage = damage;
    }
    
}
