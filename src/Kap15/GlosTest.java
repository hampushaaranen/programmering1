/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import com.sun.corba.se.impl.oa.toa.TOA;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author hshn01
 */
public class GlosTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> ht = new HashMap<>();
        char svar;
        boolean fortsatt = true;
        int antalRatt = 0;

        while (fortsatt) {
            System.out.println("");
            System.out.println("Välj:");
            System.out.println("1. Skapa Gloslistan");
            System.out.println("2. Visa Gloslistan ");
            System.out.println("3. Skriv in en ny glosa ");
            System.out.println("4. Glostest ");
            System.out.println("0. Avsluta");
            System.out.println("");
            System.out.println("Vad vill du göra?: ");
            try {
                svar = sc.next().charAt(0);
                switch (svar) {
                    case '1':
                        ht.put("Sol", "Sun");
                        ht.put("Hej", "Hello");
                        ht.put("Med", "With");
                        ht.put("Ute", "Out");
                        ht.put("Gaffel", "Fork");

                        System.out.println("Klart! ");
                        break;
                    case '2':
                        for (String nyckel : ht.keySet()) {
                            System.out.print(nyckel + ": ");
                            System.out.println(ht.get(nyckel));
                        }

                        break;
                    case '3':
                        System.out.println("Ange det svenska ordet: ");
                        String glosa = sc.next();
                        System.out.println("Ange det engelska ordet: ");
                        String key = sc.next();

                        ht.put(glosa, key);

                        break;
                    case '4':
                        for (String nyckel : ht.keySet()) {
                            System.out.print("Vad är " + nyckel + " på engelska?: ");
                            String svaret = sc.next();

                            if (svaret.equalsIgnoreCase(ht.get(nyckel))) {
                                System.out.println("Rätt!");
                                antalRatt++;

                            } else {
                                System.out.println("Fel! Rätt svar är: " + ht.get(nyckel));
                            }//if ... och så vidare...
                        }
                        System.out.println("");

                        System.out.println("Antal rätt: " + antalRatt + "/" + ht.size());
                        break;
                    case '0':
                        fortsatt = false;

                        break;
                    default:

                }//end switch
            }//end try
            catch (Exception e) {
            }

        }//end whilefortsatt
    }//end main
}//end class
