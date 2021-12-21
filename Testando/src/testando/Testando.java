/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testando;

import java.util.Scanner;

/**
 *
 * @author jovi3
 */
public class Testando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual é seu nome?");
    String nome = teclado.nextLine();
    System.out.printf("Seu nome é %s", nome);
  
    }
    
    
}
