/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Provplugg1;

import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class Ohm {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklaration
        double u,r,i;
        char forts;
        //inmatning
        do {
        System.out.print("Vad är strömmen (i)?: ");
        i=sc.nextDouble();
        System.out.print("Vad är resistansen (r)?: ");
        r=sc.nextDouble();
        u=r*i;
        System.out.println("Spänningen (u) är då: " + u);
        System.out.println("Vill du räkna igen?(J/N):");
        forts = sc.next().charAt(0);
        } while (forts == 'J' || forts == 'j'); {
         
     }
         System.out.println("Hejdå! ");
         
       
    }//end main 
    
}
