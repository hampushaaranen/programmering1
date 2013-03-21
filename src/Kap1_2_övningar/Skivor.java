/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2_övningar;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class Skivor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double skivpris;
        int antalSkivor;
        String formateratTal;
        DecimalFormat  d= new DecimalFormat ("0.##");
        System.out.println("Välkommen! ");
        System.out.println("Vi säljer skivor för 9,90 kr/st ");
        System.out.println("Köper du 10 får du 5% rabatt");
        System.out.println("Köper du 50 får du 10% rabatt");
        System.out.println("Köper du 100 får du 15% rabatt");
        System.out.print("Hur många skivor vill du köpa?: ");
        antalSkivor = sc.nextInt();
        skivpris = antalSkivor*9.90;
        
        if (antalSkivor >= 100) {
            skivpris = skivpris * 0.85;
            formateratTal = d.format (skivpris);
            System.out.println("Du får 15% rabatt");
            System.out.println("Summan blir " + formateratTal);
        }
        else if (antalSkivor >= 50) {
            skivpris = skivpris * 0.90;
            formateratTal = d.format (skivpris);
            System.out.println("Du får 10% rabatt");
            System.out.println("Summan blir " + formateratTal);
        }
        else if (antalSkivor >= 10) {
            skivpris = skivpris * 0.95;
            formateratTal = d.format (skivpris);
            System.out.println("Du får 5% rabatt");
            System.out.println("Summan blir " + formateratTal);
        }
        else {
            skivpris = skivpris;
            System.out.println("Ingen rabatt för dig!");
            System.out.println("Summan blir " + skivpris);
        }
    }//end main
    
}//end class
