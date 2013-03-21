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
public class Soltimmar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
         Support program = new Support();
         
         program.soltimmar("Oslo", 5);
         program.soltimmar("Stockholm", 5);
         program.soltimmar("Helsingfors", 5);
    }//end main
}//end class
