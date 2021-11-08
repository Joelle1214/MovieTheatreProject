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
  
        // this sections is meant for the way they would like to watch the movie and the prices for the movie 
        System.out.println("Our theatre has different ways you can watch the movie 2D, 3D and 4D. The times of the movies will be shown depeding if you pick 2D, 3D or 4D. ");
       System.out.println("Please pick 1 for 2D, 2 for 3D and 3 for 4D");
        int Theatertype = in.nextInt();
       if (Theatertype==1){
           System.out.println("to watch it in 2D you wil have to pay $18.99 per ticket");
       } else if (Theatertype==2) {
           System.out.println("To watch this movie in 3D you will have to pay $20.99 per ticket");
       } else {
           System.out.println(" To watch this movie in 4D you will have to pay $24.99 per ticket");
           System.out.println("Since you have picked theater " + Theatertype + " these are the showtimes");
           // printing out the theater times based on which theater was picked 
           typetheatre type = new typetheatre();
     type.Displaytype(); 
           
           //this section is for the ticket amounts and the total final price
            System.out.println("Please enter the amount of tickets you want, keep in  mind we have limited quantities ");
           
             char ticketAmount = in.nextLine().toLowerCase().charAt(0);
             if (ticketAmount<9) {
                 System.out.println("Sorry we do not have more then "+ ticketAmount + "please enter a different amount");
             } else {
                 System.out.println("Perfect, your total will be calculated and given back to you");
                 
             } 
             // this section will ask about the snacks
             
             // this section will ask what seats the user would like
             
    } 
    }
    }
    
    



    

