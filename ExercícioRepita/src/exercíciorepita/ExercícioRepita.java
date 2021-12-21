/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercíciorepita;
import javax.swing.JOptionPane;

/**
 *
 * @author jovi3
 */
public class ExercícioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
     int n,s=0,med, t=0,imp=0,acima=0,p=0;
        
        
        do {
        n= Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Escolha um número: <br><em> (Valor 0 interrompe)</em></html>", "Miczada",JOptionPane.WARNING_MESSAGE));
        
        t++;
        s+=n;
        if (n%2==0){ p++;} else { imp++;}
        if(n>100){ acima++;}
        
       }while (n!=0);
        
        t--;
        p--;
        med = s/t;
        JOptionPane.showMessageDialog(null, 
                    "<html>Resultado <hr>" + "<br>Total de Valores: " + t + 
                      "<br>Total de Pares: " + p + 
                        "<br> Total de Impares: " + imp +
                          "<br> Acima de 100: " + acima + 
                           "<br> Média dos valores: " + med +"</htm>"  );
        
    
        
    }
    
}

