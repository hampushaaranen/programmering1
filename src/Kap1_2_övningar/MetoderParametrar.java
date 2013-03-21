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
public class MetoderParametrar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Support svamp = new Support();
        
        
        double tal1, tal2, minst;
        System.out.print("Skriv in ett tal: ");
        tal1=sc.nextDouble();
        System.out.print("Skriv in ett till tal: ");
        tal2=sc.nextDouble();
        
        minst = svamp.minst(tal1, tal2);
        
        System.out.println("Det minsta talet är " + minst);
        
          
                
        
        
        
        
    }//end main
}//end class