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
        System.out.println("That movie is great!");
     typetheatre type = new typetheatre();
     type.Displaytype();
        
        System.out.println("Our theatre has different ways you can watch the movie 2D, 3D and 4D. The times of the movies will be shown depeding if you pick 2D, 3D or 4D. ");
       System.out.println("Please pick 1 for 2D, 2 for 3D and 3 for 4D");
        char Theatertype = in.nextLine().toLowerCase().charAt(0);
       if (Theatertype==1){
           System.out.println("to watch it in 2D you wil have to pay $18.99 per ticket");
       } else if (Theatertype==2) {
           System.out.println("To watch this movie in 3D you will have to pay $20.99 per ticket");
       } else {
           System.out.println(" To watch this movie in 4D you will have to pay $24.99 per ticket");
           System.out.println("Since you have picked theater " + Theatertype + " these are the showtimes");

    } 
    }
    }
    
    



    

