/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap1_2_övningar;

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
        char fort;
        
        
        do {
        System.out.print("Vad är strömmen (i)?: ");
        i=sc.nextDouble();
        System.out.print("Vad är resistansen (r)?: ");
        r=sc.nextDouble();
        u=r*i;
        System.out.println("Spänningen (u) är då: " + u);
        System.out.print("Vill du göra en ny beräkning?: (J/N) ");
        
        fort = sc.next().charAt(0);
            System.out.println("Thank you come again! ");
            
        } while (fort == 'j' || fort== 'J');
        
        
    }//end main 
    
}//end class