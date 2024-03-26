package desafio_aula06;

import java.util.Scanner;

public class Desafio_aula06 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int aluno = 1;
        int nota;

        while (aluno <= 10) {
            System.out.println("Digite a nota do aluno " + aluno + ":");
            
            while (!leitor.hasNextInt()) {
                System.out.println("Entrada inválida. Por favor, digite um número inteiro para a nota do aluno.");
                leitor.next(); // Limpa o input errado
            }
            nota = leitor.nextInt();
            
            System.out.println("A nota do aluno " + aluno + " é: " + nota + "\n");
            aluno++;
        }
        leitor.close(); // Fecha o scanner
    }
}
