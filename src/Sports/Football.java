package Sports;

// the specific instance extends the general. Football is a specific SPORT
public class Football extends Sports{

    protected int players;

    // this is a specific constructor for Football that is build from the same properties as Sports
    public Football (int players) {
        super(players);
    }

    // Every sport has a ball that is played with.
    public void playBall() {
        System.out.println("Its monday night football!");
    }

    // This method is available directly on the football class as players run down the field. But players dont run down
    // the field in EVERY sport.

    public void run() {
        System.out.println("He's running down the field!");
    }

}
