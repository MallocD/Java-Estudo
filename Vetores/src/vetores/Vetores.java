/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetores;

import java.util.Arrays;

/**
 *
 * @author jovi3
 */
public class Vetores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        /*int n[] = {1,2,3,4,4};
        int c =0;
         do {
             System.out.println("Na posição " + c + " Temos o valor " + n[c]);
             c++;
            
        } while(n.length-1>=c);*/
    
    float v []= new float[10];
    Arrays.fill(v,50);
    
    for(float valor :v){
    System.out.println(valor);}
//    Arrays.sort(v);
    /*int pos = Arrays.binarySearch(v,4);
    System.out.println(pos);
    
     */
}
}