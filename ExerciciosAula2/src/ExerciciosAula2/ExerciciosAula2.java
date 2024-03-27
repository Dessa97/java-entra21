
package ExerciciosAula2;

import java.util.Scanner;


public class ExerciciosAula2 {

    
    public static void main(String[] args) {
    /*
    Faça um programa em Java que peça para o usuário digitar dois números inteiros.
    Em seguida, exiba na tela:​
    A soma dos dois números;​
    A subtração dos dois números;​
    A multiplicação dos dois números.
        
       
       Scanner valor = new Scanner(System.in);
        
       int numero1, numero2, soma, subtracao, multiplicacao;
        
       System.out.print("Digite o primeiro número inteiro: ");
       numero1 = valor.nextInt();
       
       System.out.print("Digite o segundo número inteiro: ");
       numero2 = valor.nextInt();
               
       soma = numero1 + numero2;
       subtracao = numero1 - numero2;
       multiplicacao = numero1 * numero2;
       
       System.out.println("A soma dos numeros é " + soma);
       System.out.println("A subtração dos numeros é " + subtracao);
       System.out.println("A multiplicação dos numeros é " + multiplicacao);
       */
      
      
    /*
    Faça um programa em Java que peça para o usuário digitar dois números 
    inteiros. Em seguida, exiba na tela qual é o maior e qual é o menor deles, 
    ou se são iguais.
    
    
        Scanner valor = new Scanner(System.in);
        
        int numero1, numero2;
    
       System.out.print("Digite o primeiro número inteiro: ");
       numero1 = valor.nextInt();
       
        System.out.print("Digite o segundo número inteiro: ");
        numero2 = valor.nextInt();
    
        if( numero1 > numero2)
            System.out.print("O primeiro número " + numero1 + " é MAIOR que o "
            + "segundo número " + numero2);
        else if (numero1 < numero2)
            System.out.print("O primeiro número " + numero1 + " é MENOR que o "
            + "segundo número " + numero2);
        else
            System.out.print("O primeiro número " + numero1 + " é IGUAL o "
            + "segundo número " + numero2);  
    
    
    Faça um programa em Java que fique pedindo para o usuário digitar números, 
    até que ele digite zero. Em seguida, mostre na tela a soma de todos os 
    números digitados.
    */
    
    Scanner dig = new Scanner (System.in);
     
    int num, soma = 0;
    
    do{
        System.out.println("Digite um número: ");
        num = dig.nextInt();
        soma = soma + num;
    }while (num != 0);
    
    System.out.println("A soma dos números é: " + soma);
                 
    }
}
