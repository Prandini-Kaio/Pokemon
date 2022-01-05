package Screen.Batalha.InimigoTurno;

import java.util.Random;

import Pokemons.Strikes.*;

public class RandomThingsEnemy {
    
    

    public static Strike randomStrike()
    {
        Random random = new Random();
        int rand = random.nextInt(2);

        Strike newStrike = null;

        while(newStrike == null)
        {
            if(rand == 0)
            {
                newStrike = new Punch();
            }else if(rand == 1)
            {
                newStrike = new Punch();
            }
        }

        return newStrike;
    }
}
