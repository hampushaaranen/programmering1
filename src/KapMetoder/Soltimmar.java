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
public class Soltimmar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     //  Support program = new Support ();
      // program.soltimmar("Oslo", 5);
       //program.soltimmar("Stockholm", 5);
       //program.soltimmar("Helsingfors", 5);
        Support program = new Support ();
        char fortsatt;
        do{
            System.out.print("Ange en stad: ");
            String stad = sc.next();
            System.out.print("Ange soltimmar: ");
            int soltimmar = sc.nextInt();
            program.soltimmar(stad, soltimmar);
            System.out.println("");
            System.out.print("Vill du ange en till stad (J/N): ");
            fortsatt = sc.next().charAt(0);
        }while (fortsatt == 'J'|| fortsatt == 'j');
        System.out.print("Hejdå ha en bra dag! ");
        }//end main
        
    }//end class
    

