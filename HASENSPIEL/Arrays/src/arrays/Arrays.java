/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays; 

import java.util.Random;
import java.util.Scanner;
import frameapi.*;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author Maurice
 */
public class Arrays {
        static String[][] feld = new String[14][14];
        static String[][] Speicherfeld = new String[14][14];

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
                int h = randint(50);
                feld[x][y] = ".";
                if (h<2){
                    feld[x][y] = "H";
                    
//
                }
                int f = randint(50);
                if(f<2){
                    feld[x][y] = "F";
                    
                    
                }
                
            }
            
        }
}
    
    public static void moveHasen(){
    for(int x=0; x<feld.length; x++){
                for(int y=0; y<feld.length; y++){
                    
                if (Speicherfeld[x][y] == "H"){
                    int s = randint(5);
                    if (s == 0){
                        feld[x][y] = Speicherfeld[x][y];
                       
                    }
                    if (s == 1){
                        feld[x][y] = ",";
                        if(x<12)
                            feld[x+1][y] = "H"; 
                        else
                            feld[0][y] = "H"; 

                    }
                    if (s == 2){
                        feld[x][y] = ",";
                      if(x>2)
                        feld[x-1][y]  = "H";
                      else
                          feld[13][y] = "H";
                          
                    
                    }
                    if (s == 3){
                        feld[x][y] = ",";
                      if(y<12)    
                        feld[x][y+1] = "H";
                      else
                          feld[x][y] = "H";
                    
                    }
                    if (s == 4){
                        feld[x][y] = ",";
                      if(y>2)  
                        feld[x][y-1] = "H";
                      else
                          feld[x][13] = "H";
                    
                    }
                
                if (feld[x][y]. equals("H")){
                int fery = randint(10);
                
                if(fery<2){
                    feld[x][y] = "H";
                    
                if(x<12)  
                        feld[x+1][y] = "H";
                      else
                          feld[0][y] = "H";    
                
                
                }
            
               
            
            
            }
                
                
                }     
                    
                    
                    
                }
                
            }    
    }
    
    public static void moveFuechse (){
    for (int x=0; x<feld.length; x++){
            for (int y=0; y<feld.length; y++){
                
        
            if (Speicherfeld[x][y] == "F"){
                
                
                int s = randint(5);
                    if (s == 0){
                        feld[x][y] = Speicherfeld[x][y];
                    terrorbeifery();    
                    }
                if (s == 1){
                        feld[x][y] = ",";
                      if(x<12)  
                        feld[x+1][y] = "F";
                      else
                          feld[0][y] = "F";
                }
                if (s == 2){
                        feld[x][y] = ",";
                      if(x>2)   
                        feld[x-1][y] = "F";
                      else
                          feld[13][y] = "F";
                
                }
                if (s == 3){
                        feld[x][y] = ",";
                       if(y<12) 
                        feld[x][y+1] = "F";
                       else
                           feld[x][0] = "F";
                
                }
                if (s == 4){
                        feld[x][y] = ",";
                       if(y>2) 
                        feld[x][y-1] = "F";
                       else
                           feld[x][12] = "F";
                }
                
                if (feld[x][y]. equals("F")){
                int fery = randint(10);
                
                if(fery<2){
                    feld[x][y] = "F";
                    
                if(x<12)  
                        feld[x+1][y] = "F";
                      else
                          feld[0][y] = "F";    
                
                
                }
            
               
            
            
            }
                
            
            
            }
            
            
            
            }
          }    
    }
    
    public static void abinssf (){
    for (int x=0; x<feld.length; x++){
            for (int y=0; y<feld.length; y++){
                
           Speicherfeld[x][y] = feld[x][y];     
            }
          }    
    }
    
    public static void terrorbeifery (){
        int terror = randint(100);
        if (terror == 0){
        for(int x=0; x<feld.length; x++ ){
            for(int y=0; y<feld.length; y++){
                if (feld[x][y]  == "H"){
                    feld[x][y] = "R";
                }
                if (feld[x][y]  == "F"){
                    feld[x][y] = "R";
                }
            }
        }
        
        JOptionPane.showMessageDialog(null,"BREAKING NEWS: Terroranschlag auf der Hasenwiese. Osama bin Hase ist zurück!");    
    }
    
    }
    
    public static void bauenundhuepfen() {
    
    abinssf();    
    
    moveHasen(); 
    moveFuechse();      
    
    
          
            
    }   
            
    }   





    

    








    

