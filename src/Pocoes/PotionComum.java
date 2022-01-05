package Pocoes;

public class PotionComum implements Potion{

    private String potionName;
    private int amount;
    private int heal;

    public PotionComum()
    {
        this.potionName = "Comum";
        this.heal = 10;
    }

    @Override
    public String getName() {
        return potionName;
    }

    @Override
    public int getAmount() {
        return amount;
    }

    @Override
    public int getHeal() {
        return heal;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
}
