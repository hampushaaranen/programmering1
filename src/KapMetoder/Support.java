/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KapMetoder;

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
    public void soltimmar (String stad, int soltimmar) {
        System.out.print("" + stad + ": ");
        for (int i = 0; i < soltimmar; i++) {
            System.out.print("*");
        }//end for
        System.out.println("");
    }//end void

public double pi (){
     return 3.15149;
}//end pi
public double area(double radie) {
    double area = Math.PI*radie*radie;
    return area;
}//end area
public double omkrets(double radie){
    double omkrets = 2*Math.PI*radie;
    return omkrets;
}//end omkrets
public double volym(double Radie){
    double volym = 4*Math.PI*Radie*Radie*Radie/3;
    return volym;
}// end volym
public boolean hoppet(double lang, double vind){
    
    boolean result;
    if (lang > 7.92 && vind <=2.0 ) {
        result = true;
    }else{
        result = false;
    }
    return result;
    
}
   
    
}// end class


