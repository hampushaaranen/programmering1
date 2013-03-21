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
public class Deltagare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int deltagare;
        System.out.print("Hur många deltagare är med?: ");
        deltagare = sc.nextInt();
        if (deltagare >= 12) {
            System.out.println("För många! ");
        } else {
            System.out.println("OK!");
        }
    }//end main
    
}//end class
