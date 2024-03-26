/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_prof_mulina;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class Exercicios_prof_mulina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ler uma lista de 10 números pares e indicar a soma deles, o maior, o menor e a média deles.
        // para calcular os múltiplos tenho que colocar "%" que calcula o resto da divisão pelo número colocado em seguida.EX: variável%2==0 - multiplos de 2.
        
        int[] pares = new int [10];
        Scanner leitor = new Scanner(System.in);
        
        int num = 0;
        int qtdpar = 0;
        int soma =0;
        double media =0;
        int maior = 0;
        
        do{
            System.out.println("Digite 10 numeros pares");
            num = leitor.nextInt();
            if(num%2==0){
                pares[qtdpar]=num;
                qtdpar++;                
            }
            
        }while(qtdpar < 10);
        
        for(int i = 0; i < 10; i++){
        System.out.println(pares[i]);
    }
        
        //soma
        for(int i =0; i<10;i++){
            soma = soma + pares[i];
        }
        
        System.out.println("\n a soma é " + soma);
        
        
        //media
        media = soma/10;
        
        //maior
        for(int i = 1; i < 10; i++){
            if(maior < pares[i]){
                maior = pares[i];
            }
        }
        
        System.out.println("\n o maior é " + maior);
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
