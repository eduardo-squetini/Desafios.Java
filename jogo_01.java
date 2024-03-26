package jogo_a1;
import java.util.Scanner;

public class jogo_a1 {
    public static void main(String[] args) {
        int inicio = 0;
        int num1 = 0;
        int num2 = 0;
        int tentativas = 0;
        
        Scanner leitor = new Scanner(System.in);
        
        do {
            System.out.println("\nSelecione (1) para iniciar o jogo");
            inicio = leitor.nextInt();
            if (inicio != 1) {
                System.out.println("Comando errado. Digite novamente...");
            }
        } while (inicio != 1);
        
        System.out.println("----------------------------------------");
        System.out.println("PLAYER 01:");
        
        do {
            System.out.println("\nInsira um numero inteiro de 0 a 1000");
            num1 = leitor.nextInt();
            if ((num1 < 0) || (num1 > 1000)) {
                System.out.println("Numero errado. Digite novamente...");
            }
        } while ((num1 < 0) || (num1 > 1000));
        
        System.out.println("----------------------------------------");
        System.out.println("PLAYER 02:\n");
        
        do {
            System.out.println("Tente acertar o numero inserido anteriormente pelo PLAYER 01");
            num2 = leitor.nextInt();
            tentativas++;
            if (num2 == num1) {
                System.out.println("Parabens, voce GANHOU!!!");
            } else {
                if ((num2 > num1)) {
                    System.out.println("O numero inserido e maior que o do PLAYER 01\n");
                }
                if ((num2 < num1)) {
                    System.out.println("O numero inserido e menor que o do PLAYER 01\n");
                }
            }
        } while ((num2 < 0) || (num2 > 1000) || (num2 != num1));
        
        System.out.println("\nSeu numero de tentativas foram " + tentativas);
    }
}
