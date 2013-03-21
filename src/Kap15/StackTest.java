/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author hshn01
 */
public class StackTest {
    public static void main(String[] args) {
        Stack<String> minStack = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        char svar;
        boolean fortsatt = true;
        
        while (fortsatt) {
            if (minStack.isEmpty()) {
            System.out.println("Ingen Stack för tillfället! ");
        } else {
                System.out.println("STACK: ");
            for (String namn : minStack)
                
                System.out.println(namn + " ");
        }
        
        
        System.out.println("");
        System.out.println("Välj:");
        System.out.println("1. Lägg en tallrik på tallrikstraven");
        System.out.println("2. Vems tallrik ligger överst? ");
        System.out.println("3. Ta bort översta tallriken ");
        System.out.println("0. Avsluta");
        System.out.println("");
        System.out.println("Vad vill du göra?: ");
        
                
        try {
            svar = sc.nextLine().charAt(0); 
            switch (svar) {
                case '1':
                    System.out.println("Vems tallrik?: ");
                    String namn = sc.nextLine();
                    minStack.push(namn);
                    
                    break;
                case '2':
                    System.out.print("Högst upp är " + minStack.peek() + " tallrik");
                    System.out.print(" (Tryck ENTER)"); sc.nextLine();
                    break;
                case '3':
                    System.out.print("Tar bort " + minStack.pop() + " tallrik");
                    System.out.print(" (Tryck ENTER)"); sc.nextLine();
                    break;
                case '0':
                    fortsatt = false;
                    break;
                default:
                    
            }//end switch
        }//end try
        catch(Exception e) {}
        System.out.println();
        }//end while
             hej mamma!
    }//end main
    
}//end class
