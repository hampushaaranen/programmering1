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
public class Matte2 {
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        int talEtt, talTva;
        char fortsatt;
              
        //inmatning
        System.out.println("Skriv ett tal: ");
        talEtt = sc.nextInt();
        System.out.println("Skriv ett till tal: ");
        talTva= sc.nextInt();
        
        System.out.println("Vilket räknesätt vill du använda? (+,-,/,*): ");
        char raknesatt = sc.next().charAt(0);
        
        do {
            switch (raknesatt) {
            case  '+':
                int summa = talEtt + talTva;
                System.out.println("Summan är " + summa);
                
                
                break;
            
                case  '/':
                int kvoten = talEtt / talTva;
                System.out.println("Kvoten är " + kvoten);
                
                break;
            
                case  '-':
                int differensen = talEtt - talTva;
                System.out.println("Differensen är " + differensen);
                
                break;
            
                case  '*':
                int produkten = talEtt * talTva;
                System.out.println("Produkten är " + produkten);
                
                break;
                default:
           
               
        }//end switch
            System.out.println("Vill du köra programmet igen? (J/N): ");
            fortsatt = sc.next().charAt(0);
            
        } while (fortsatt == 'J' || fortsatt == 'j'); 
        
    
       
    }//end main
    
}//end class

