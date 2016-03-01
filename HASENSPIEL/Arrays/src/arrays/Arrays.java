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
                
            
               bauenundhuepfen();
             
                
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
                int h = randint(100);
                feld[x][y] = ".";
                if (h<2){
                    feld[x][y] = "H";
                    //hasen[x][y] = "H";
                }
                int f = randint(200);
                if(f<2){
                    feld[x][y] = "F";
                    //fox[x][y] = "F";
                    
                }
                
            }
            
        }
}


    public static void bauenundhuepfen() {
    
        for (int x=0; x<feld.length; x++){
            
            for (int y=0; y<feld.length; y++){
                if(feld[0][y].equals("H")){
                feld[x][y] = ".";
                feld[12][y] = "H";
            }
                if(feld[x][0].equals("H")){
                feld[x][y] = ".";
                feld[x][12] = "H";
            }
                if(feld[13][y].equals("H")){
                feld[x][y] = ".";
                feld[1][y] = "H";
            }  
            if(feld[x][13].equals("H")){
                feld[x][y] = ".";
                feld[x][1] = "H";
            }
            if(feld[13][y].equals("F")){
                feld[x][y] = ".";
                feld[1][y] = "F";
            }
            if(feld[x][13].equals("F")){
                feld[x][y] = ".";
                feld[x][2] = "F";
            }
            if(feld[x][0].equals("F")){
                feld[x][y] = ".";
                feld[x][12] = "F";
            }
            if(feld[0][y].equals("F")){
                feld[x][y] = ".";
                feld[12][y] = "F";
            }
                
                
                
                
                if (feld[x][y] == "F"){
                int s = randint(5);
                    if (s == 0){
                        feld[x][y] = feld[x][y];
                        
                    }
                if (s == 1){
                        feld[x][y] = feld[x+1][y];
                        feld[x+1][y] = "F";
                }
                if (s == 2){
                        feld[x][y] = feld[x-1][y];
                        feld[x-1][y] = "F";
                }
                if (s == 3){
                        feld[x][y] = feld[x][y+1];
                        feld[x][y+1] = "F";
                }
                if (s == 4){
                        feld[x][y] = feld[x][y-1];
                        feld[x][y-1] = "F";
                }
                }
                
            
                
                if (feld[x][y] == "H"){
                    int s = randint(5);
                    if (s == 0){
                        feld[x][y] = feld[x][y];
                        
                    }
                    if (s == 1){
                        feld[x][y] = feld[x+1][y];
                        feld[x+1][y] = "H"; 
                        
                    }
                    if (s == 2){
                        feld[x][y] = feld[x-1][y];
                        feld[x-1][y]  = "H";
                    }
                    if (s == 3){
                        feld[x][y] = feld[x][y+1];
                        feld[x][y+1] = "H";
                    }
                    if (s == 4){
                        feld[x][y] = feld[x][y-1];
                        feld[x][y-1] = "H";
                    }
                
                    
                }   
                
                
                
            
            
            
            }   
            
    }   





    }
}
    

