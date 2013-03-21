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
public class Stad {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        String stad = "Tjeckoslovakien";
        
        //inmatning
        String stad2 = stad.substring (5,9);
        System.out.println("" + stad2);
    }//end main
    
}//end class
