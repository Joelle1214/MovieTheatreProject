/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movietheatreproject;

import java.util.*;

/**
 *
 * @author SPH_SHSM
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        Theatre t = new Theatre();
        System.out.println("hello, welcome to the theater, here is a list of movies that we have showing at our theater!");
        t.displayShows();
        System.out.println("Please eneter no if you know what movie you want to watch, if you are unsure type yes, for a random movie");
        char userChoice = in.nextLine().toLowerCase().charAt(0);
        if (userChoice == 'y') {
            Movie choice = t.pickRandom();
            System.out.println("You are watching " + choice.title);
        } else {
            System.out.println("please pick the movie you would like");
        }
        String Moviechoice = in.nextLine();
        System.out.println("That movie is great!");

        // this sections is meant for the way they would like to watch the movie and the prices for the movie 
        System.out.println("Our theatre has different ways you can watch the movie 2D, 3D and 4D. The times of the movies will be shown depeding if you pick 2D, 3D or 4D. ");
        System.out.println("Please pick 1 for 2D, 2 for 3D and 3 for 4D");
        int Theatertype = in.nextInt();
        if (Theatertype == 1) {
            System.out.println("to watch it in 2D you wil have to pay $18.99 per ticket");
        } else if (Theatertype == 2) {
            System.out.println("To watch this movie in 3D you will have to pay $20.99 per ticket");
        } else {
            System.out.println(" To watch this movie in 4D you will have to pay $24.99 per ticket");
        }
        String times;
        System.out.println("please enter the amount our system told you to pay for one ticket for qualification purposes");
        double ticketprice = in.nextDouble();
        System.out.println("Great!");
        // printing out the theater times based on which theater was picked 
        typetheatre type = new typetheatre();
        System.out.println("These are the times we have for each type (2D,3D or 4D)");
        type.Displaytype(Theatertype - 1);
        System.out.println("please enter the time you would like to watch the movie at for the theatre type you picked");
        in.nextLine();
        times = in.nextLine();
        System.out.println("Please enter the amount of tickets you want, keep in  mind we have limited quantities ");

        //this section is for the ticket amounts and the total final price
        int ticketAmount = in.nextInt();
        if (ticketAmount > 100) {
            System.out.println("Sorry we do not have  " + ticketAmount + " tickets please enter a different amount");
            int Amountticket = in.nextInt();
            System.out.println("your total is " + Amountticket * ticketprice);

        } else {
            System.out.println("Perfect, your total will be calculated and given back to you");
            System.out.println("your total is " + ticketAmount * ticketprice);
        }
      
        // this section will ask about the snacks
        System.out.println("would you like to add snacks to go along with your movie?");
        String snackstype = in.nextLine();
        char snacks = in.nextLine().toLowerCase().charAt(0);
        if (snacks == 'y') {
            System.out.println("please pick which snack you would like, Popcorn, Soda or Hotdog");
            char snack = in.nextLine().toLowerCase().charAt(0);
            if (snack == 'p') {
                System.out.println("which size would you like s for small, m for medium and l for large");
                String snackChoice = in.nextLine();
            } else if (snack == 's') {
                System.out.println("which size would you like s for small, m for medium and l for large");
                 String ChoiceSnack= in.nextLine();
            } else {
                System.out.println("which size would you like, regular or jumbo");
                String size= in.nextLine();
            }

            System.out.println("Good choice! please pick which seats you would like");
        }
        // this section will ask what seats the user would like
        System.out.println("your seat options are from 1a-10j please enter the seats you want based on how many tickets you have (ex, if you have 2 tickets please enter 1a- 1b)");
        String seat = in.nextLine();
        System.out.println("now that you have everything you need, please keep your ticket and go to the movie based on what time you have picked");
        System.out.println("Enjoy!");
    }
}


