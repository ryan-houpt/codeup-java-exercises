import java.util.Scanner;
import java.util.Random;

public class Adventure_Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int randomFallDMG = rand.nextInt(5) + 1;
        int randomBrushDMG = rand.nextInt(5) + 1;
        int playerSwordDMG;
        int playerFistDMG;
        int playerHP = 20;
        int dragonHP = 35;
        boolean blocking = false;
        boolean playerSword = false;
        boolean fluffy = false;
        boolean weaponChoice;

        System.out.println("You wake up to your day");
        System.out.println("What do you want to do? \n " +
                "1.) Get breakfast? (breakfast)\n " +
                "2.) Brush your teeth (brush) \n " +
                "3.) Go fight the dragon in your backyard (dragon)");
        String userMoringchoice = scanner.nextLine();
        if (userMoringchoice.contains("breakfast")) {
            System.out.println("Ahh so you would like to get breakfast.");
            System.out.println("You make your way out of bed, and start heading downstairs, but oh no! You tripped!");
            System.out.println("Unfortunately in your fall you took " + (randomFallDMG) + "DMG!");
            playerHP -= randomFallDMG;
            System.out.println("You have " + playerHP + "HP left");
            System.out.println("Time to go fight the dragon! (Bad luck!)");
        } if (userMoringchoice.contains("brush")) {
            System.out.println("Fair enough, who eats breakfast anyways?");
            System.out.println("You make your way to the bathroom and start brushing your teeth. " +
                    "Unfortunately you never listened to your dentist and you brushed too hard! Now your gums are bleeding!");
            System.out.println("You bled for " + (randomBrushDMG) + "DMG!");
            playerHP -= randomFallDMG;
            System.out.println("You have " + playerHP + "HP left");
            System.out.println("Time to go fight the dragon! (Bad luck!)");
        } if (userMoringchoice.contains("dragon")) {
            System.out.println("To the dragon!!!");
        }
            System.out.println("On your way to face the dragon head on you look into your garage and see some tools that might be useful. " +
                    "Do you want to grab them? \n " +
                    "1.) A rusted sword (sword)\n " +
                    "2.) a garbage can lid (shield)\n " +
                    "3.) Your dog fluffy (fluffy)\n " +
                    "4.) I don't need any of that crap (nothing)");
            weaponChoice = true;
            String userWeaponChoice = scanner.nextLine();
            do {
                if (userWeaponChoice.contains("sword")) {
                    System.out.println("Great! Now we have our weapon to defeat the mighty dragon! " +
                            "You have increased your DMG by 1 (Not much, but to be fair the thing is rusted)");
                    playerSword = true;
                    System.out.println("Your DMG has increased by 2");
                    weaponChoice = false;
                }
                if (userWeaponChoice.contains("shield")) {
                    System.out.println("Great! Now we have a shield to boost our defense! " +
                            "You have increased your HP by 5 (Not much, but to it is just a garbage can lid)");
                    playerHP += 5;
                    System.out.println("Your HP has increased too " + playerHP);
                    weaponChoice = false;
                }
                if (userWeaponChoice.contains("fluffy")) {
                    System.out.println("Great! Come with me fluffy! We will defeat the dragon together! " +
                            "Fluffys mighty roar will help lower the dragons HP by 10!");
                    dragonHP -= 10;
                    weaponChoice = false;
                    fluffy = true;
                } if (userWeaponChoice.contains("nothing")) {
                    System.out.println("'woah we have a badass over here' " +
                            "You charge forward with just your fists and the shirt on your back");
                    weaponChoice = false;
                }
            } while (weaponChoice);

        System.out.println("Now it is time to face your fears and challenge the mighty dragon!");
        if (fluffy) {
            System.out.println("Fluffy lets out a mighty roar and the dragon gets so scared he looses 10HP!");
            fluffy = false;
        }
        do {

            System.out.println("What do you want to do? \n" +
                    "1.) Attack (attack) \n" +
                    "2.) Defense (defense) \n");
            String userDragonChoice = scanner.nextLine();

            if (userDragonChoice.contains("attack") && playerSword) {
                playerSwordDMG = rand.nextInt(5) + 3;
                System.out.println("You did " + playerSwordDMG + "DMG to the dragon!");
                dragonHP -= playerSwordDMG;
                System.out.println("The dragon has " + dragonHP + "HP left!");
            } if (userDragonChoice.contains("attack") && !playerSword) {
                playerFistDMG = rand.nextInt(5) + 1;
                System.out.println("You did " + playerFistDMG + "DMG to the dragon!");
                dragonHP -= playerFistDMG;
                System.out.println("The dragon has " + dragonHP + "HP left!");
            } if (userDragonChoice.contains("defense")) {
                System.out.println("You are blocking DMG from the dragon!");
                blocking = true;
            }

            System.out.println("Now the dragon is on the attack!");

            if (blocking) {
                System.out.println("With your powerful block, you shielded yourself from the dragons damage!");
                blocking = false;
            } else {
                int dragonDMG = rand.nextInt(3) + 1;
                playerHP -= dragonDMG;
                System.out.println("The dragon did " + dragonDMG + "DMG and you have " + playerHP + "HP left!");
            }

        } while (dragonHP >= 0 && playerHP >= 0);

        if(dragonHP < 0) {
            System.out.println("Congrats! You have defeated the dragon!");
        } if (playerHP < 0) {
            System.out.println("Looks like the dragon roasted you. Sorry...");
        }

    }

}
