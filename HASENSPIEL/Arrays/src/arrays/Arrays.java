/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Maurice
 */
public class Arrays {
        static int[][] sf = new int[40][40];
        static int[][] hasen = new int[40][40];
        static int[][] fuchse = new int[40][40];
        static int zustand = 0;
        
    
    public static void main(String[] args) {
      
        bauen();
        umdieohrenhauen();
        
        Scanner sc = new Scanner(System.in);
        while(sc.nextLine().equals("")){
            zustand++;
             for (int x=0; x<sf.length; x++){
            for (int y=0; y<sf.length; y++){
                int h = randint(20);
                
                if (hasen[x][y] == 1){
                    int s = randint(5);
                    if (s == 0){
                        hasen[x][y] = sf[x][y];
                    }
                if (s == 1){
                        hasen[x][y] = sf[x+1][y];
                    }
                if (s == 2){
                        hasen[x][y] = sf[x-1][y];
                    }
                if (s == 3){
                        hasen[x][y] = sf[x][y+1];
                    }
                if (s == 4){
                        hasen[x][y] = sf[x][y-1];
                    }
                
                }
                
                if (fuchse[x][y] == 4){
                int s = randint(5);
                    if (s == 0){
                        fuchse[x][y] = sf[x][y];
                    }
                if (s == 1){
                        fuchse[x][y] = sf[x+1][y];
                    }
                if (s == 2){
                        fuchse[x][y] = sf[x-1][y];
                    }
                if (s == 3){
                        fuchse[x][y] = sf[x][y+1];
                    }
                if (s == 4){
                        fuchse[x][y] = sf[x][y-1];
                    }
                }
                
                
            
            
        }
}      
            
            umdieohrenhauen();  
            System.out.println("Aktuelle Runde: " + zustand);
            System.out.println("Weiter?");
        }
        
        
        
        
     
    }
    
    private static int randint(int z){
        z++;
        Random rand = new Random();
        int r = rand.nextInt(z);
        return r;
    }
    
    private static void bauen() {
     for (int x=0; x<sf.length; x++){
            for (int y=0; y<sf.length; y++){
                int h = randint(20);
                sf[x][y] = 0;
                if (h<2){
                    sf[x][y] = 1;
                    hasen[x][y] = 1;
                }
                int f = randint(40);
                if(f<2){
                    sf[x][y] = 4;
                    fuchse[x][y] = 4;
                    
                }
                
            }
            
        }
}

    private static void umdieohrenhauen(){
        for (int x=0; x<sf.length; x++){
            for (int y=0; y<sf.length; y++){
                System.out.print(sf[x][y]+ " ");
                
            } 
            System.out.println();
            
        }   
        }

    private static void bauenundhüpfen() {
     for (int x=0; x<sf.length; x++){
            for (int y=0; y<sf.length; y++){
                int h = randint(20);
                
                if (hasen[x][y] == 1){
                    int s = randint(5);
                    if (s == 0){
                        hasen[x][y] = sf[x][y];
                    }
                if (s == 1){
                        hasen[x][y] = sf[x+1][y];
                    }
                if (s == 2){
                        hasen[x][y] = sf[x-1][y];
                    }
                if (s == 3){
                        hasen[x][y] = sf[x][y+1];
                    }
                if (s == 4){
                        hasen[x][y] = sf[x][y-1];
                    }
                
                }
                
                if (fuchse[x][y] == 4){
                int s = randint(5);
                    if (s == 0){
                        fuchse[x][y] = sf[x][y];
                    }
                if (s == 1){
                        fuchse[x][y] = sf[x+1][y];
                    }
                if (s == 2){
                        fuchse[x][y] = sf[x-1][y];
                    }
                if (s == 3){
                        fuchse[x][y] = sf[x][y+1];
                    }
                if (s == 4){
                        fuchse[x][y] = sf[x][y-1];
                    }
                }
                
                
            
            
        }
}   





    }
}
    

