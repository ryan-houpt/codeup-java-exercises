package Sports;

public class Football extends Sports{

    protected int players;

    public Football (int players) {
        super(players);
    }

    public void playBall() {
        System.out.println("Its monday night football!");
    }

    public void run() {
        System.out.println("He's running down the field!");
    }

}
