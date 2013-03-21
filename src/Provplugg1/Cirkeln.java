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
public class Cirkeln {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklaration
        double pi, radie, area, omkrets;
        char fortsatt;
        fortsatt = 'J';
        pi=3.14159;
        //inmatning
         while (fortsatt == 'J' || fortsatt == 'j') {             
             System.out.print("Vad är radien?: ");
        radie=sc.nextDouble();
        area=pi*radie*radie;
        omkrets=2*pi*radie;
        System.out.println("Arean är då: " + area);
        System.out.println("Omkretsen är då: " + omkrets);
        System.out.println("Vill du köra programmet igen? (J/N): ");
        fortsatt = sc.next().charAt(0);
         }//end while
         System.out.println("Hejdå! ");
    }//end main
    
}//end class
