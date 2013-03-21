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
public class Langdhopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Support program =  new Support();
        double lang, vind;
        System.out.println("Hur långt hoppade du?: ");
        lang = sc.nextDouble();
        System.out.println("Hur stark var vinden?: ");
        vind = sc.nextDouble();
        
        boolean resultat = program.hoppet(lang, vind);
        
        if (resultat == true) {
            System.out.println("Grattis! ");
        } else {
            System.out.println("Tyvärr! ");
        }
        
        
    }//end main
    
}//end class
