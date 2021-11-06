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
        Random rnd=new Random();
        Theatre t = new Theatre();
        System.out.println("hello, welcome to the theater, here is a list of movies that we have showing at our theater!");
        t.displayShows();
        System.out.println("if you are not sure which movie you would like to see would you like to have it randomly picked for you? say yes for a random movie and no if you know your choice");
        char userChoice = in.nextLine().toLowerCase().charAt(0);
        if (userChoice == 'y') {
            Movie choice=t.pickRandom();
            System.out.println("You are watching "+choice.title);
        } else {
            System.out.println("please pick the movie you would like");
        } String Moviechoice= in.nextLine(); 
        System.out.println("Good choice, which theater would you like to watch this movie in,  1 for 2D, 2 for 3D or 3 for 4D?");
        String Theaterchoice= in.nextLine();
         char Theatertype = in.nextLine().toLowerCase().charAt(0); 
         if (Theatertype== '1') {
        System.out.println("Great, these are the show times in 2D for the movie"+Moviechoice+"2:15 PM, 5:55PM and 7:15PM which time would you like?");
        String choice= in.nextLine();
         } else if (Theatertype=='2') {
        System.out.println("Great, these are the show times in 2D for the movie"+Moviechoice+"3:15 PM, 4:45PM and 8:20PM which time would you like?");
        String choice= in.nextLine();
    } else {
        System.out.println("Great, these are the show times in 2D for the movie"+Moviechoice+"1:05 PM, 6:25M and 11:15PM which time would you like?");
        String choice= in.nextLine();
    } 
    }
    }
    
    
}


    

