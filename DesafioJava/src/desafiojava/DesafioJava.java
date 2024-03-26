
package desafiojava;


import java.util.Scanner;

//No final deste curso, com os conhecimentos e capacidades que adquiriu, você 
//deverá ser capaz de desenvolver um sistema de votação simples em JAVA com as 
//seguintes características:
// - O sistema exibirá na tela um menu com 4 opções de voto (4 candidatos), uma 
//opção para mostrar o resultado e outra para sair da votação.​
// - Após inserir um voto, o sistema exibe novamente o menu para que novos votos
//possam ser inseridos;​
// - O sistema contará quantos votos cada candidato recebeu;​
// - Ao entrar na opção de mostrar o resultado, o sistema mostrará quantos votos
//cada candidato recebeu e quem foi o vencedor.

public class DesafioJava {

    public static void main(String[] args) {
        
       Scanner candidato = new Scanner(System.in);  
       
       int opcao;
       int c1 = 0, c2 = 0, c3 = 0, c4 = 0;

       do {
            System.out.println("Sistema de votação");
            System.out.println();
            System.out.println("[1] - Candidato A");
            System.out.println("[2] - Candidato B");
            System.out.println("[3] - Candidato C");
            System.out.println("[4] - Candidato D");
            System.out.println("[5] - SAIR");
            System.out.println();
            System.out.println("Digite o número escolhido");
            opcao = candidato.nextInt();
       
          if (opcao == 1){
              c1++;
          } else if (opcao == 2){
              c2++;
          } else if (opcao == 3){
              c3++;     
          } else if (opcao == 4)
              c4++;
          }
       while (opcao != 5);
  
       System.out.println("Votos candidato A: " + c1);
       System.out.println("Votos candidato B: " + c2);
       System.out.println("Votos candidato C: " + c3);
       System.out.println("Votos candidato D: " + c4);
       System.out.println();
       
       if (c1 > c2 && c1 > c3 && c1 > c4){
            System.out.println("Candidato A venceu");
       }
       else if (c2 > c1 && c2 > c3 && c2 > c4){
            System.out.println("Candidato B venceu");
       }
       else if (c3 > c1 && c3 > c2 && c3 > c4){
            System.out.println("Candidato C venceu");
       } 
       else if (c4 > c1 && c4 > c2 && c4 > c3){
            System.out.println("Candidato D venceu");
       }else {
            System.out.println("Houve empate!");
       }
    }   
}
