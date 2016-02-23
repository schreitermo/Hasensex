/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays; 

import java.util.Random;
import java.util.Scanner;
import frameapi.*;
/**
 *
 * @author Maurice
 */
public class Arrays {
        static String[][] feld = new String[14][14];
        static String[][] hasen = new String[14][14];
        static String[][] fox = new String[14][14];
        
        
    
    public static void main(String[] args) {
      
    //setFelder();
        bauen();
        FrameAPI.initFrame();
        FrameAPI.initString(feld.length, feld);
        FrameAPI.setPlayground();
       
        do {
            if(FrameAPI.newRound){
                
            
               bauen();
             
                
                FrameAPI.initString(feld.length, feld);
                FrameAPI.setPlayground();
            } else {
                System.out.println();
            }
        } while(!FrameAPI.allDead);
            
        
        
        
        
     
    }
    
    public static int randint(int z){
        z++;
        Random rand = new Random();
        int r = rand.nextInt(z);
        return r;
    }
    
    public static void bauen() {
     for (int x=0; x<feld.length; x++){
            for (int y=0; y<feld.length; y++){
                int h = randint(20);
                feld[x][y] = ".";
                if (h<2){
                    feld[x][y] = "H";
                    hasen[x][y] = "H";
                }
                int f = randint(40);
                if(f<2){
                    feld[x][y] = "F";
                    fox[x][y] = "F";
                    
                }
                
            }
            
        }
}


    public static void bauenundhüpfen() {
     for (int x=0; x<feld.length; x++){
            for (int y=0; y<feld.length; y++){
                int h = randint(20);
                
                if (hasen[x][y] == "H"){
                    int s = randint(5);
                    if (s == 0){
                        hasen[x][y] = feld[x][y];
                    }
                if (s == 1){
                        hasen[x][y] = feld[x+1][y];
                    }
                if (s == 2){
                        hasen[x][y] = feld[x-1][y];
                    }
                if (s == 3){
                        hasen[x][y] = feld[x][y+1];
                    }
                if (s == 4){
                        hasen[x][y] = feld[x][y-1];
                    }
                
                }
                
                if (fox[x][y] == "F"){
                int s = randint(5);
                    if (s == 0){
                        fox[x][y] = feld[x][y];
                    }
                if (s == 1){
                        fox[x][y] = feld[x+1][y];
                    }
                if (s == 2){
                        fox[x][y] = feld[x-1][y];
                    }
                if (s == 3){
                        fox[x][y] = feld[x][y+1];
                    }
                if (s == 4){
                        fox[x][y] = feld[x][y-1];
                    }
                }
                
                
            
            
        }
}   





    }
}
    

