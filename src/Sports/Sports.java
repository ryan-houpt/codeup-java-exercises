package Sports;

// this is the parent or umbrella for all our classes. It extends its reach into every other class.
public class Sports {

    protected int players;


    // this is the specific constructor for the SPORTS class that is the parent constructor of every SPORT
    public Sports (int players) {
        this.players = players;
    }


    // every sport has a way to play ball so we must have a playBall method in the main class.
    public void playBall() {
        System.out.println("What game we playing here?");
    }

}
