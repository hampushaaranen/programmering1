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
public class Cirkel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Support program = new Support();
        double radie;
        System.out.print("Vad är radien?: ");
        radie=sc.nextDouble();
        
        double omrekts = program.omkrets(radie);
        System.out.println("Omkretsen är: " + omrekts);
        double area = program.area(radie);
        System.out.println("Arean är: " + area);
        
        
        
        
    }//end main
    
}//end class
