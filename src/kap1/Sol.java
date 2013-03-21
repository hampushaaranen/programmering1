/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap1;

import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class Sol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Hur många soltimmar har oslo: ");
         int antalSolTimmarIOslo = sc.nextInt();
         
         System.out.print("O: ");
         
         int i = 0;
         while (i<antalSolTimmarIOslo) {
             System.out.print("*");
             i++;
         }
         System.out.println("");
          System.out.println("Hur många soltimmar har Stockholm: ");
         int antalSolTimmarIStockholm = sc.nextInt();
         
         System.out.print("S: ");
         
         i = 0;
         while (i < antalSolTimmarIStockholm) {
             System.out.print("*");
             i++;
         }
         System.out.println("");
            System.out.println("Hur många soltimmar har Helsingfors: ");
         int antalSolTimmarIHelsingfors = sc.nextInt();
         
         System.out.print("H: ");
         
         i = 0;
         while (i < antalSolTimmarIHelsingfors) {
             System.out.print("*");
             i++;
         }
        
                
    }//end main
    
}//end class
