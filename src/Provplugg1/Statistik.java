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
public class Statistik {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        double summa = 0;
        double medel = 0;
        int tal, n;
        n=10;
        int max = 0;
        //inmatning
        
        for (int i = 0; i < n; i++) {
            System.out.println("Skriv in ett tal: ");
            tal = sc.nextInt();
            if (tal > max) {
                max = tal;
            }
            summa = summa + tal;
            medel = summa / n;
        }//end for
        
        System.out.println("Summan är: " + summa);
        System.out.println("Medelvärdet är: " + medel);
        System.out.println("Det största talet är: " + max);
    }//end main
   
    
}//end class
