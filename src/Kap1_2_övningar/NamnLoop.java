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
public class NamnLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklaration
        String namn;
        
        System.out.println("Vad är ditt namn?: ");
        namn = sc.nextLine();
       
        for(int i=0; i < 10; i++) 
{
System.out.println(" " + namn);
}

      
        
                
    }//end main
    
}//end class
