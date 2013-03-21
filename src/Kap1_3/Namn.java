/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

public class Namn {
    public static void main(String[] args) {
        //deklaration
        String namn = "olas salo";
        
        for (int i = 0; i < namn.length(); i++) {
            System.out.print("" + namn.charAt(i));
            
        }
        System.out.println("\nOrdets längd är " + namn.length());
        
        for (int i = namn.length()-1; i >= 0; i--) {
            System.out.print(namn.charAt(i));
            
        }
        System.out.println("");
    }//end main
    
}//end class
