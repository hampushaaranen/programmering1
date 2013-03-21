/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap1_2_övningar;

import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class Cirkeln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Deklaration
        double pi, radie, area, omkrets;
        pi=3.14159;
        
        char forts = 'J';
        while (forts == 'J' || forts == 'j') {
            System.out.print("Vad är radien?: ");
            radie=sc.nextDouble();
            area=pi*radie*radie;
            omkrets=2*pi*radie;
            System.out.println("Arean är då: " + area);
            System.out.println("Omkretsen är då: " + omkrets);
            System.out.println("Vill du göra beräkningarna igen? (J/N): ");
            forts = sc.next().charAt(0);
        }
        System.out.println("Hejdå! ");
            
            
      
      
           
        
       
        
        
        
        
        
            
        
    }//end main
    
}//end class
