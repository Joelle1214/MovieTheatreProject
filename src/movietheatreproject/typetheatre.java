/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietheatreproject;

/**
 *
 * @author Joelle
 */
public class typetheatre {
     theatretype[] type;
    public typetheatre() {
        type= new theatretype[3];
        type[0]=new theatretype();
        type[0].tandt=new String[] {"2D" };
        type[0].times=new String[] {"showings at 2:15 PM, 5:55PM and 7:15PM " };
        type[1]=new theatretype();
        type[1].tandt=new String[]{" 3D"};
        type[1].times=new String[] {"showings at 2:15 PM, 5:55PM and 7:15PM " };
       type[2]=new theatretype();
       type[2].tandt=new String[]{" 4D"};
       type[2].times=new String[] {"showwings at 1:05 PM, 6:25M and 11:15PM " };
   }
}
