/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafiocalculadora_aula05;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class DesafioCalculadora_aula05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //desafio calculadora: Desenvolver uma calculadora que realize as 4 operações básicas. A execução deve ser decidida por meio de um menu.
        
        //índice das variáveis no início do programa
        int operacoes = 0;
        double calculo1 = 0;
        double calculo2 = 0;
        
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Coloque 1 para soma");
        System.out.println("Coloque 2 para subtracao");
        System.out.println("Coloque 3 para divisao");
        System.out.println("Coloque 4 para multiplicacao");
        operacoes = leitor.nextInt();
        
        
        if((operacoes == 1) || (operacoes == 2) || (operacoes == 3) || (operacoes == 4)){
            
            System.out.println("Digite seu primeiro numero");
            calculo1 = leitor.nextDouble();
            System.out.println("Digite seu segundo numero");
            calculo2 = leitor.nextDouble();
            System.out.println("Sua resposta e: ");
            
        } 
        
        
        switch(operacoes){
                
            case 1:
                System.out.println(calculo1 + calculo2);
                break;
            case 2:
                System.out.println(calculo1 - calculo2);
                break;
            case 3:
                System.out.println(calculo1 / calculo2);
                break;
            case 4:
                System.out.println(calculo1 * calculo2);
                break;
            default:
                System.out.println("opcao invalida");
                
        }
        
        
       
            
            
        
        
        
        
        
        // TODO code application logic here
    }
    
}
