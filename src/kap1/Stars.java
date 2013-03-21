/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kap1;

import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class Stars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Hur många stjärnor?: ");
        n = sc.nextInt();
        int i = 0;
        while (i < n) {            
            System.out.print("*");
            i++;
        }
        System.out.println("");
    }//end main
    
}//end class
