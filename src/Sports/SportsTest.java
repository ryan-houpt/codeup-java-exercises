package Sports;

public class SportsTest {

    public static void main(String[] args) {

            Baseball baseball = new Baseball(10);
            Football football = new Football(10);
            Soccer soccer = new Soccer(10);
            Basketball basketball = new Basketball(10);


            Sports[] sport = {baseball, football, soccer, basketball};


            for (Sports s : sport) {
                s.playBall();
            }

            football.run();

//        Sports newGame = new Football(10);
//
//        newGame.run();


    }

}
