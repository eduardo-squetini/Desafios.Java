/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jogo_a1;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class jogo_a1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        /*EXECUÇÃO DAS REPETIÇÕES:
        1. while - Testa primeiro e executa a condição enquanto ela for verdadeira, infinitamente. 
        2. do while - Executa primeiro e depois testa a condiçao enquanto ela for verdadeira, infinitamente.
        3. for - Testa as condições apresentadas e realiza o bloco, somente se a expressão for verdadeira, infinitamente.
        
        MELHOR SITUAÇÃO:
        Quando não sei as condições exatas para chegar na solução do meu programa usa-se o "while", porém se preciso rodar algo em meu programa antes de testá-lo,
        usa-se o "do... while". E se eu sei as condições exatas para a solução usa-se o "for".*/
        
        int inicio = 0;
        int num1 = 0;
        int num2 = 0;
        int tentativas = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        do{
            System.out.println("\nSelecione (1) para iniciar o jogo");
            inicio = leitor.nextInt();
        
                if(inicio != 1){
                System.out.println("Comando errado. Digite novamente...");
                }
        
        }while(inicio != 1);
        
        System.out.println("----------------------------------------");
        
        System.out.println("PLAYER 01:");
        
        
        do{
            System.out.println("\nInsira um numero inteiro de 0 a 1000");
            num1 = leitor.nextInt();
        
                if((num1 < 0) || (num1 > 1000)){
                System.out.println("Numero errado. Digite novamente...");
                }
        
        }while((num1 < 0) || (num1 > 1000) );
        
        System.out.println("----------------------------------------");
        
        System.out.println("PLAYER 02:\n");
        
        
        do{
            System.out.println("Tente acertar o numero inserido anteriormente pelo PLAYER 01");
            num2 = leitor.nextInt();
            tentativas ++;
    
                if(num2 == num1){
                System.out.println("Parabens, voce GANHOU!!!");
       
                }else{
                    if((num2 > num1)){
                    System.out.println("O numero inserido e maior que o do PLAYER 01\n");
                    }
                    if ((num2 < num1)){
                    System.out.println("O numero inserido e menor que o do PLAYER 01\n");
                    }
                    
            }   
        }while((num2 < 0) || (num2 > 1000) || (num2 != num1));

        System.out.println("\nSeu numero de tentativas foram " + tentativas );
        
    }
    
}
