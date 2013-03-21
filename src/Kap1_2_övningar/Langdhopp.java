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
public class Langdhopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklaration
        double langd, vind;
        //inmatning
        System.out.print("Hur lång hoppade du?: ");
        langd = sc.nextDouble();
        System.out.print("Vad är vindhastigheten?: ");
        vind = sc.nextDouble();
        
        if (langd > 7.92 && vind <= 2.0) {
            System.out.println("Grattis! ");
        }
        else {
            System.out.println("Tyvärr! ");
        }
       
        
    

    }//end main 
    
}//end class
