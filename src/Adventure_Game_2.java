import java.util.Scanner;
import java.util.Random;

public class Adventure_Game_2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int userHP = 100;
        boolean houseKey = false;
        boolean pickAxe = false;
        boolean ancientTome = false;


        System.out.println(
                "___________ \n" +
                        "|    T     | \n" +
                        "|C    x   H| \n" +
                        "|__________|");

        System.out.println("You wake up in the middle of a field, the sky is clear above you. You notice right in front of you is an old tree," +
                "and to your left is a wooden chest. As you spin around trying to take in your surroundings, you also notice a house on your right hand side.");
        System.out.println("What do you want to do? \n" +
                "1.) Inspect the tree \n" +
                "2.) Inspect the chest \n" +
                "3.) Inspect the house");

        String userFirstChoice = scanner.nextLine();
        do {
            if (userFirstChoice.equals("1")) {
                System.out.println(
                        "___________ \n" +
                                "|     x    | \n" +
                                "|C        H| \n" +
                                "|__________|");

                System.out.println("You notice in a notch in the tree a rusted key. I wonder what this goes too?");
                houseKey = true;
                System.out.println("Where would you like to go next? \n" +
                        "2.) The Chest \n" +
                        "3.) The House");
                userFirstChoice = scanner.nextLine();
            }
            if (userFirstChoice.equals("2")) {
                System.out.println(
                        "___________ \n" +
                                "|     T    | \n" +
                                "|x        H| \n" +
                                "|__________|");

                System.out.println("It looks like we are in luck! We found a pickAxe. I am sure we can make use of this!");
                pickAxe = true;
                System.out.println("Where would you like to go next? \n" +
                        "1.) The Tree \n" +
                        "3.) The House");
                userFirstChoice = scanner.nextLine();
            }
            if (userFirstChoice.equals("3") && !houseKey) {
                System.out.println(
                        "___________ \n" +
                                "|     T    | \n" +
                                "|C        x| \n" +
                                "|__________|");

                System.out.println("As you approach the house you notice that the door is locked. As you look inside you notice" +
                        "belongings covered in dust. It looks like the house hasn't been lived in, in ages. Maybe I can find a key somewhere?");
                System.out.println("Where would you like to go next? \n" +
                        "1.) The Tree \n" +
                        "2.) The Chest");
                userFirstChoice = scanner.nextLine();

            }
            if (userFirstChoice.equals("3") && houseKey) {
                System.out.println(
                        "___________ \n" +
                                "|     T    | \n" +
                                "|C        x| \n" +
                                "|__________|");

                System.out.println("You approach the house. The door is locked, but it appears the key we found in the tree fits! " +
                        "You slowly open the door, and it creaks as if it has not been used in ages.");
                System.out.println("As you look around you notice that dust covers the books and the furniture. ");
                ancientTome = true;

            }
        } while (!ancientTome);

        System.out.println("You notice what looks like an ancient tome on the bookshelf. You take it off and with a big breath, you blow all the dust off");
        System.out.println("Dust particles fly everywhere and you start to get an odd feeling around you. Something is different, but you can't quite pinpoint it just yet.");
        System.out.println("You step outside, and hear a noise in the distance.");

        System.out.println(
                        "___________ \n" +
                        "|___       | \n" +
                        "|___|     x| \n" +
                        "|__________|");

        System.out.println("A giant crag forms in front of you with a door-like opening at the bottom. As you star in wonder, you hear a whisper coming from the door. " +
                "As if its calling you in.");


    }

}

