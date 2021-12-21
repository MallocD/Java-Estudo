/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mesesdoano;

/**
 *
 * @author jovi3
 */
public class MesesdoAno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mes[]= {"Janeiro","Fevereiro","Março","Abril","Maio","Junho","Julho",
            "Agosto","Setembro","Outubro","Novembro","Dezembro"};
        String dias[]= {"31","28","31","30","31","30","31","31","30","31","30","31"};        
        
        for(int d=0;d<=mes.length-1;d++){
           System.out.println( "O mês de " + mes[d] + " Tem " + dias[d] + " Dias"
           );
           
        }
    }
    
}
