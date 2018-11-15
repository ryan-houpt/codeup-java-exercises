package Sports;

public class Basketball extends Sports{

    protected int players;

    public Basketball (int players) {
        super(players);
    }

    public void playBall() {
        System.out.println("Lets shoot some hoops!");
    }

}
