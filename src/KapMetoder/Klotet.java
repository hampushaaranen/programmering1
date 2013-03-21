/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KapMetoder;

import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class Klotet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Support program = new Support();
        double radie;
        System.out.println("Vad är radien?: ");
        radie = sc.nextDouble();
        double volym = program.volym(radie);
        System.out.println("Volymen är: " + volym);
    }//end main
    
}//end class
