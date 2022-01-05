package Pokemons.Strikes;

public class Fire implements Strike{

    private String name;
    private int damage;


    public Fire()
    {
        name = "Fire";
        damage = 100;
    }

    @Override
    public String getNameStrike() {
        // TODO Auto-generated method stub
        return name;
    }

    @Override
    public int getDamageStrike() {
        // TODO Auto-generated method stub
        return damage;
    }

    @Override
    public void setDamageStrike(int damage) {
        // TODO Auto-generated method stub
        this.damage = damage;
        
    }
    
}
