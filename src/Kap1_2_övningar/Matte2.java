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
public class Matte2 {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        int talEtt,talTva;
        char fortsatt;
        
       
        
        
       
        //inmatning
        do {
            System.out.print("Ange ett tal: ");
            talEtt = sc.nextInt();
            System.out.println("Ange ett till tal: ");
            talTva = sc.nextInt();

            System.out.println("ange räknesätt +,-,/,*");
            char raknesatt = sc.next().charAt(0);
            
            
        
        switch (raknesatt) {
            case  '+':
                int summa = talEtt + talTva;
                System.out.println("summan är " + summa);
                
                
                break;
            
                case  '/':
                int kvoten = talEtt / talTva;
                System.out.println("kvoten är " + kvoten);
                
                break;
            
                case  '-':
                int differensen = talEtt - talTva;
                System.out.println("differensen är " + differensen);
                
                break;
            
                case  '*':
                int produkten = talEtt * talTva;
                System.out.println("produkten är " + produkten);
                
                break;
                default:
           
                 
        }//end switch
            System.out.println("Vill du köra programmet igen?: (J/N)");
            fortsatt=sc.next().charAt(0); 
        } while (fortsatt == 'j' || fortsatt == 'J');
        
        
            
    }//end main 
    
}//end class
