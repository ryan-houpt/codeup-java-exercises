import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean talkingToBob = true;

        System.out.println("Did you want to talk to Bob?");

        do {
            if (scanner.nextLine().equals( "yes")) {
                System.out.println("What do you want to say?");
                String userResponse = scanner.nextLine();
                if (userResponse.contains("?")) {
                    System.out.println("sure");
                } if (userResponse.contains("!")) {
                    System.out.println("Woah! Calm down!");
                } if (userResponse.length() < 1) {
                    System.out.println("Fine. Be that way!");
                } else if (!userResponse.contains("?") && !userResponse.contains("!") && userResponse.length() > 1) {
                    System.out.println("whatever.");
                }
                System.out.println("Did you want to say anything else?");
                if (userResponse.equals("no")) {
                    talkingToBob = false;
                } else {
                    talkingToBob = true;
                }
            } else {
                talkingToBob = false;
            }
        } while (talkingToBob);

    }

}
