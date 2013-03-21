/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

/**
 *
 * @author hshn01
 */
public class StringTest {
    public static void main(String[] args) {
        //deklaration
        String namn = "Hampus";
        String namn2= "Schnaze";
        
        boolean test = namn.equals(namn2);
        System.out.println("" + test);
        //inmatning
        if (namn.equals(namn2)) {
            System.out.println("Bra lika där");
        } else {
            System.out.println("Inte så lika där");
        }
    }//end main
    
}//end class
