/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2_övningar;

/**
 *
 * @author hshn01
 */
public class Support {
    public double minst(double tal1, double tal2){
        double minst = tal1;
        if (tal2 < minst) {
            minst = tal2;
            
        }
        return minst;
 }

    public void soltimmar(String stad, int soltimmar) {
        for (int i = 0; i < 10; i++) {
            System.out.print("*");
        }
    }

    
    

    
}//end class
