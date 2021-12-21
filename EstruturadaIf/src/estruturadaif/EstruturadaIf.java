/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadaif;

import java.util.Scanner;

/**
 *
 * @author jovi3
 */
public class EstruturadaIf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard= new Scanner(System.in);
         System.out.println("Qual sua data de nascimento?");
        int data= keyboard.nextInt();
        int i= 2021 - data;
      
    if (i>=18) {
        System.out.println("Maior de idade");}
    else{
        System.out.println("Menor de idade");
    } 
    
    
    
    }
}
