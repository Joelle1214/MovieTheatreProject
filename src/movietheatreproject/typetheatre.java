/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatreproject;

import java.util.*;

/**
 *
 * @author Joelle
 */
// this is supposed to print out the showing times depending on the way they choose to watch the movie 
public class typetheatre {

    theatretype[] type;

    public typetheatre() {
        type = new theatretype[3];
        type[0] = new theatretype();
        type[0].tandt = new String[]{" 2D"};
        type[0].times = new String[]{"2:15 PM", "5:55PM", "7:15PM "};
        type[1] = new theatretype();
        type[1].tandt = new String[]{" 3D"};
        type[1].times = new String[]{"3:25PM", "4:20PM", "9:15PM"};
        type[2] = new theatretype();
        type[2].tandt = new String[]{" 4D"};
        type[2].times = new String[]{"1:30PM", "2:50PM", "6:30PM"};
    }

    public void Displaytype(int choice) {
        int counter = 1;

        for (String s : type[choice].times) {
            System.out.println(counter + ") " + s + "\t");
            counter++;
        }
        System.out.println("\n");
    }
}


