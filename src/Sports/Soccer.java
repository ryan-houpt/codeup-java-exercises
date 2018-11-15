package Sports;

public class Soccer extends Sports{

    protected int players;

    public Soccer (int players) {
        super(players);
    }




    public void playBall() {
        System.out.println("Kick me the ball!");
    }

}
