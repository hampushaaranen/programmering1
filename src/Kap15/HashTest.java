package Kap15;

import java.util.*;

public class HashTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hashtable<String, String> ht = new Hashtable<String, String>();
        char svar;
        boolean fortsatt = true;
        
        while (fortsatt) {
            System.out.println("");
            System.out.println("Välj:");
            System.out.println("1. Skapa hashtabellen");
            System.out.println("2. Sök efter huvdstad ");
            System.out.println("3. Visa hashtabellens innehåll ");
            System.out.println("4. Geografiförhör ");
            System.out.println("0. Avsluta");
            System.out.println("");
            System.out.println("Vad vill du göra?: ");
            try {
                svar = sc.nextLine().charAt(0);
                switch (svar) {
                    case '1':
                        ht.put("Danmark", "Köpenamn");
                        ht.put("Sverige", "Stockholm");
                        ht.put("Norge", "Oslo");
                        ht.put("Ryssland", "Moskva");
                        ht.put("Tyskland", "Berlin");
                        ht.put("Finland", "Helsingfors");
                        ht.put("Frankrike", "Paris");
                        System.out.println("Klart! ");
                        break;
                    case '2':
                        System.out.println("Land?: ");
                        String land = sc.nextLine();
                        System.out.println("Huvudstad: " + ht.get(land));

                        break;
                    case '3':
                        for (String nyckel : ht.keySet()) {
                            System.out.print(nyckel + ": ");
                            System.out.println(ht.get(nyckel));
                        }

                        break;
                    case '4':
                        for (String nyckel : ht.keySet()) {
                            System.out.print("Vad heter huvudstaden i " + nyckel + "?");
                            String svaret = sc.next();
                            if (svaret.equalsIgnoreCase(ht.get(nyckel))) {
                                System.out.println("Rätt!");
                                
                            } else {
                                System.out.println("Fel! Rätt svar är: " + ht.get(nyckel));
                            }
                           
                            //if ... och så vidare...
                        }

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