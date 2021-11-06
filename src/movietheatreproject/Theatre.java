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
        shows= new Movie[6];
        shows[0]=new Movie();
        shows[0].randg=new String[] {" rated E, sci-fi" };
        shows[0].Theatretype=new String[] {"showing in 2D","3D and 4D"};
        shows[0].title = "The Solar Express";
        shows[1]=new Movie();
        shows[1].title=" We're The Billers";
        shows[1].randg=new String[] {" rated E, Comedy"};
        shows[1].Theatretype=new String[]{"showing in 2D","3D and 4D"};
        shows[2]=new Movie();
        shows[2].title="Saturday the 14th";
        shows[2].randg=new String[] {" rated R, Horror"};
        shows[2].Theatretype= new String[]{"showing in 2D","3D and 4D"};
        shows[3] = new Movie();
        shows[3].title="The Notepad";
        shows[3].randg= new String[] {"rated PG 13, Romance"};
        shows[3].Theatretype= new String[]{"showing in 2D","3D and 4D"};
        shows[4] = new Movie();
        shows[4].title="Down";
        shows[4].randg= new String[] {"rated E, Animation"};
        shows[4].Theatretype= new String[]{"showing in 2D","3D and 4D"};
        shows[5] = new Movie();
        shows[5].title="Nebula Conflicts";
        shows[5].randg= new String[] {"rated PG, Action"};
        shows[5].Theatretype= new String[]{"showing in 2D","3D and 4D"};
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
    
    public Movie pickRandom(){
        Random rnd=new Random();
        int choice=rnd.nextInt(this.shows.length);
        return shows[choice];
    }
}
