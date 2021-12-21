/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaao;

import java.util.Scanner;

/**
 *
 * @author jovi3
 */
public class RePeticaao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int y, x=0;
        String resp;
        
        Scanner tecla= new Scanner(System.in);
                
                do{
            System.out.println("Digite um número");
            y= tecla.nextInt();
            x+=y;
            System.out.println("Deseja continuar? Sim/Não" );    
            resp = tecla.next();} while(resp.equals("Sim"));
                System.out.printf("Seu resultado é igual á %d",x ); }
                
            
            
          
}
