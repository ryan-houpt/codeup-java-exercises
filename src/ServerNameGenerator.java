import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        String[] adjectives = {"boring", "tightfisted", "sulky", "loutish", "dashing", "lazy", "handy", "few", "hateful ", "sparkling"};
        String[] nouns = {"rate", "engine", "floor", "decision", "ball", "cap", "", "meal", "soup", "wing"};

        Random rand = new Random();

        int randomNumberAdjectives = rand.nextInt(9) + 1;
        int randomNumberNouns = rand.nextInt(9) + 1;

        System.out.println("Your server name is: \n" + adjectives[randomNumberAdjectives] + "-" + nouns[randomNumberNouns]);

    }

}
