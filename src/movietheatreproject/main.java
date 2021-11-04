/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movietheatreproject;

import java.util.Scanner;

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
        System.out.println("hello, welcome to the theater, here is a list of movies that we have showing at our theater!");
        Theatre SouthKeys = new Theatre();
        SouthKeys.displayShows();
        System.out.println("if you are not too sure which movie you would like to watch, pick a number between 1-5 and we will give you a random movie to watch!");
        String RandomMovie= in.nextLine();
        Math.random();
    }
    
}
