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
public class Klotet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radie;
        double pi = 3.14159;
        double volym;
        System.out.print("Vad är klotets radie?: ");
        radie = sc.nextInt();
        volym = 4*pi*radie*radie*radie/3;
        System.out.println("Klotets volym är " + volym);
    }//end main
}//end class
