/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class Namn3 {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        String helaNamnet;
        
        
        //inmatning
        System.out.println("Vad heter du?: ");
        helaNamnet=sc.nextLine();
        System.out.print(helaNamnet.charAt(0) + ".");
        
        for (int i = 0; i < helaNamnet.length(); i++) {
            if (helaNamnet.charAt(i)== ' '){
                System.out.print(helaNamnet.charAt( i + 1));
            }
            
        }//end for
    
        System.out.println("");
        
        
    }//end main
    
}//end class
