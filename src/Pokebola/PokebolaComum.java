package Pokebola;

public class PokebolaComum implements Pokebola{

    private float captureChance;
    private int amount;
    private String namePokebola;

    public PokebolaComum()
    {
        this.captureChance = 10;
        this.namePokebola = "Comum";
    }


    @Override
    public float getCaptureChance() {
        return captureChance;
    }

    @Override
    public int getAmout() {
        return amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }


    @Override
    public String getName() {
        return namePokebola;
    }
    
}
