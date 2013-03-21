/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class GlassKo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <String> GlassKo = new LinkedList<>();
        int val = 1;
        boolean fortsatt = true;
                GlassKo.add("Kalle"); 
                GlassKo.add("Lisa");
                GlassKo.add("Anna"); 
                GlassKo.add("Johan");
                GlassKo.add("Stina"); 
                GlassKo.add("Pelle");
        while (fortsatt) { 
            int plats = 0;
            if (GlassKo.isEmpty()) {
                System.out.println("Kön är tom");
            }else {
                for (int i = 0; i < GlassKo.size(); i++) {
                    System.out.println(++plats + ". " + GlassKo.get(i));
                    
                }//end for
            }//end if else
            System.out.println("");
        System.out.println("DINA VAL");
                   
        System.out.println("1. Lägg till en ny person ");
        System.out.println("2. Vem står först i kön? ");
        System.out.println("3. Ta bort en person ");
        System.out.println("0. Avsluta");
        System.out.println("");
        System.out.print("Välj alternativ som du vill göra: ");
        val = sc.nextInt();
        
            switch (val) {
            case 1:
                System.out.println("Ange en person: ");
                String person = sc.next();
                GlassKo.add(person);
                
                break;
            case 2:
                System.out.println(GlassKo.getFirst() + " står först i kön! ");
                System.out.println("");
                break;
            case 3:
                GlassKo.removeFirst();
                
                break;
            
            case 0:
                fortsatt = false;
                System.out.println("Hejdååååååååååå ");
                break;
            default:
                System.out.println("Fel inmatning! ");
        }//end switch
        }//end while
        
    }//end main
    
}//end class
