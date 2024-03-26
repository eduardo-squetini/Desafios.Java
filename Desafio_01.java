package exercicios_prof_mulina;
import java.util.Scanner;

public class Exercicios_prof_mulina {

    public static void main(String[] args) {
        int[] pares = new int [10];
        Scanner leitor = new Scanner(System.in);
        
        int num = 0;
        int qtdpar = 0;
        int soma =0;
        double media =0;
        int maior = 0;
        int menor = Integer.MAX_VALUE;
        
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
        media = soma/10.0;
        System.out.println("\n a media é " + media);
        
        //maior e menor
        for(int i = 0; i < 10; i++){
            if(maior < pares[i]){
                maior = pares[i];
            }
            if(menor > pares[i]){
                menor = pares[i];
            }
        }
        
        System.out.println("\n o maior é " + maior);
        System.out.println("\n o menor é " + menor);
    }
}
