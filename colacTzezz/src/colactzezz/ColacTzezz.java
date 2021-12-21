/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colactzezz;

import java.util.Scanner;

/**
 *
 * @author jovi3
 */
public class ColacTzezz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
       Scanner teclado = new Scanner(System.in);
       int c = teclado.nextInt();
            
            while(c>1){
                if (c%2==0){ c= c/2;System.out.printf("%d\n", c);}
                else { c= (3*c)+1;System.out.printf("%d\n", c);}
        
        
        }
    }
}
    

