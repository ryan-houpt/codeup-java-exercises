package movies;
import util.Input;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Input input = new Input(sc);
        boolean userBrowsing = true;

        do {
            System.out.println("What would you like to do? \n" +
                    "0 - exit \n" +
                    "1 - view all movies \n" +
                    "2 - view movies in the animated category \n" +
                    "3 - view movies in the drama category \n" +
                    "4 - view movies in the horror category \n" +
                    "5 - view movies in the sci-fi category \n" +
                    "6 - add a movie\n");

            int userChoice = input.getInt();

                if (userChoice == 0) {
                    userBrowsing = false;
                }

                if (userChoice == 1) {

                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        System.out.println(MoviesArray.findAll()[i].getName());
                    }
                    System.out.println("\n");

                }

                if (userChoice == 2) {

                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        if (MoviesArray.findAll()[i].getCategory().equals("animated")) {
                            System.out.println(MoviesArray.findAll()[i].getName());
                        }
                    }
                    System.out.println("\n");

                }

                if (userChoice == 3) {

                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        if (MoviesArray.findAll()[i].getCategory().equals("drama")) {
                            System.out.println(MoviesArray.findAll()[i].getName());
                        }
                    }
                    System.out.println("\n");
                }

                if (userChoice == 4) {

                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        if (MoviesArray.findAll()[i].getCategory().equals("horror")) {
                            System.out.println(MoviesArray.findAll()[i].getName());
                        }
                    }
                    System.out.println("\n");
                }

                if (userChoice == 5) {

                    for (int i = 0; i < MoviesArray.findAll().length; i++) {
                        if (MoviesArray.findAll()[i].getCategory().equals("scifi")) {
                            System.out.println(MoviesArray.findAll()[i].getName());
                        }
                    }
                    System.out.println("\n");
                }

                if (userChoice == 6) {

                    System.out.println("what is the name of the movie you would like to add?");
                    String userMovieName = input.getString();
                    input.getString();
                    System.out.println("what is the category of the movie?");
                    String userMovieCategory = input.getString();

                   new Movie(userMovieName, userMovieCategory);



                }

        } while (userBrowsing);
    }

}
