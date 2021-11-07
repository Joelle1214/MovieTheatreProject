/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatreproject;

/**
 *
 * @author Joelle
 */
public class snacktypes {
     snacks [] food;
    public snacktypes() {
        food= new snacks[3];
        food[0]=new snacks();
        food[0].popcorn=new String []{" Popcorm comes in small, medium and large" };
        food[1]=new snacks();
        food[1].hotdog =new String[]{" you can get a hotdog in small or jumbo"};
       food[2]=new snacks();
       food[2].soda=new String[]{" you can get soda in small, mediium or large"};
     
    } 
}
