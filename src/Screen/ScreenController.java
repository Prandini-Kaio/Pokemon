package Screen;

public class ScreenController {

    private boolean gameRunning = true;

    public ScreenController()
    {
        while(gameRunning)
        {
            new Menu();
        }
    }
}
