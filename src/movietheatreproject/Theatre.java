/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatreproject;
import java.util.*;
/**
 *
 * @author SPH_SHSM
 */
public class Theatre {
    Movie[] shows;
    public Theatre() {
        shows= new Movie[3];
        shows[0]=new Movie();
        shows[0].randg=new String[] {" rated E", "sci-fi" };
        shows[0].ticketsLeft=new int[] {150,150};
        shows[0].title = "The Solar Express";
        shows[1]=new Movie();
        shows[1].title=" We're The Smiths";
        shows[1].randg=new String[] {" rated E", "Comedy"};
        shows[1].ticketsLeft=new int[]{300,300,300};
        shows[2]=new Movie();
        shows[2].title="Saturday the 14th";
        shows[2].randg=new String[] {" rated R","Horror"};
        shows[2].ticketsLeft=new int[]{100};
    }
    
    public void displayShows(){
        int counter=1;
        for (Movie m:shows){
            System.out.println(counter+": "+m.title);
            for (String s:m.randg){
                System.out.print(s+"\t");
            }
            System.out.println("\n");
            counter++;
        }
    }
    
    
}
