package Sports;

public class SportsTest {

    public static void main(String[] args) {

            Baseball baseball = new Baseball(10);
            Football football = new Football(10);
            Soccer soccer = new Soccer(10);
            Basketball basketball = new Basketball(10);

            // creating an array of TYPE SPORTS (from class sports). Each object of the ARRAY is of their sport TYPE.
            Sports[] sport = {baseball, football, soccer, basketball};


            for (Sports s : sport) {
                s.playBall();
            }

            football.run();


      // Create a new "Variable" that is TYPEOF "Sport", but within that variable is an object that is TYPEOF Football
//
//
//        Sports newGame = new Football(10);
//
//        newGame.run();


    }

}
