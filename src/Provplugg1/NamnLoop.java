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
public class NamnLoop {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        String namn;
        int antal;
        
        //inmatning
        System.out.println("Vad är ditt namn?: ");
        namn = sc.nextLine();
        System.out.println("Hur många gånger vill du skriva ut namnet?: ");
        antal = sc.nextInt();
                
        for (int i = 0; i < antal; i++) { //kommer köra loopen talet "antal" gånger.
        System.out.println("" + namn);
        }//end for 
        
    }//end main
       
    
}//end class 
