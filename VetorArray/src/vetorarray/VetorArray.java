
package vetorarray;

import java.util.Scanner;


public class VetorArray {

   
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int notas[]  = new int [3];
        
        
        double soma = 0;
        
        for (int i=0; i<notas.length; i++){
            System.out.println("Digite uma nota:");
            notas[i] = entrada.nextInt();
            soma += notas[i];
        }
         for (int i=0; i<notas.length; i++){
            System.out.println(notas[i]);  
        }
        double media  = soma / notas.length;
        System.out.println("A média é: " + media); 
        }
    }    

