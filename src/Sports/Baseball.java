package Sports;

public class Baseball extends Sports {

    protected int players;

    public Baseball (int players) {
        super(players);
    }

    public void playBall() {
        System.out.println("Lets play ball!");
    }

}
