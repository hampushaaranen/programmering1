/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2_övningar;

import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class Statistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklaration
         double summa, medel;
         summa = 0;
         int tal, max, allaTal, n;
         
         allaTal=0;
         medel = 0;
         max = 0;
        
         System.out.println("Hur många tal ska behandlas?: ");
         n = sc.nextInt();
        //inmatning
        for (int i = 0;  i< n; i++) {
            System.out.print("Skriv ett tal: ");
            tal = sc.nextInt();
            if (tal > max){
                max=tal;
            }// end if
            
            summa = summa + tal;   
            allaTal++;
           
        }//end for
        medel = summa / allaTal;
        System.out.println("Summan är: " + summa);
        System.out.println("Medelvärdet är: " + medel);
        System.out.println("Maxtalet är: " + max);
  
                
    }//end main
    
}//end class
