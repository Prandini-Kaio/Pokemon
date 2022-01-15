package Pocoes;

public class PotionIncomum implements Potion{

    private String name;
    private int amount;
    private int heal;

    public PotionIncomum()
    {
        this.name = "Incomum";
        this.heal = 20;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAmount() {
        return this.amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    @Override
    public int getHeal() {
        return this.heal;
    }
    
}
