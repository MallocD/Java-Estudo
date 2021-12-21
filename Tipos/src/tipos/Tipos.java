/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos;

import java.util.Scanner;

/**
 *
 * @author jovi3
 */
public class Tipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner teclado = new Scanner(System.in);    
   System.out.println("Quantas pernas possue esse ser?");
   int pernas = teclado.nextInt();
   String tipo;
        switch(pernas){
         case 1 :
            tipo = "Saci";
        break;
         case 2:
            tipo= "Bípede";
        break;     
         case 4 :   
            tipo = "Quadrúpede";
        break;      
         case 6  :
            tipo= "Aracnídios";
        break;    
         case 8 :
             tipo = "Aracnídeos";
             break;
         default :
             tipo= "ET";
    }
         System.out.printf("O ser é %s\n", tipo);
    }
    
   
}
