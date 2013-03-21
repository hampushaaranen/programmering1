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
public class Skivor1_2 {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        double antalSkivor;
        double priset;
        
        
        System.out.println("Välkommen!");
        System.out.println("Vi säljer CDR-skivor till priset 9.90kr/st");
        System.out.println("Köper du 100 eller fler skivor = 15% Rabatt");
        System.out.println("Köper du 50 eller fler skivor = 10% Rabatt");
        System.out.println("Köper du 10 eller fler skivor = 5% Rabatt");
        System.out.println("Hur många skivor vill du köpa?: ");
        antalSkivor = sc.nextDouble();
        
        if (antalSkivor >= 100) {
            System.out.println("Du får 15% Rabatt");
           priset = antalSkivor * 9.90;
           double nyttPris = priset * 0.85;
           System.out.println("Summan blir " + nyttPris +"kr");
        }
        else if (antalSkivor >= 50) {
            System.out.println("Du får 10% Rabatt");
            priset = antalSkivor * 9.90;
            double nyttPris = priset * 0.90;
            System.out.println("Summan blir " + nyttPris +"kr");
        }
        else if (antalSkivor >= 10) {
            System.out.println("Du får 5% Rabatt");
            priset = antalSkivor * 9.90;
            double nyttPris = priset * 0.95;
            System.out.println("Summan blir " + nyttPris +"kr");
        }
        else {
            System.out.println("Du får ingen rabatt!");
            priset = antalSkivor * 9.90;
            System.out.println("Summan blir " + priset +"kr");
        }
            
    

    }//end main
    
}//end class
