package desafio_aula06;
import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class Desafio_aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //faça um sistema com 10 alunos e suas respectivas notas com estrutura de repetição EM WHILE:
        
        Scanner leitor = new Scanner(System.in);
        
        int aluno = 1;
       
        
        while(aluno <=10 ){
            System.out.println("Digite a nota do aluno"+aluno);
            
            int nota = leitor.nextInt();
            
            System.out.println("A nota do aluno e:" + nota +"\n\n");
            
            aluno++;
        }
        
        // "\n" pula uma linha ao rodar o código
        //aluno++ é para ele pedir a nota do aluno seguinte e não somente o aluno 1.
        
        
        // AGORA EM FOR: lição de casa
        
        /*double nota = 0;
        Scanner leitor = new Scanner(System.in);
        
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite a nota do " + i + " aluno");
            nota = leitor.nextDouble();
            System.out.println("a nota do" +" "+ i + " vale " + nota + "\n\n");
        }*/
        
        
        
        //AGORA EM DO..WHILE:
        //DO...while ele faz e depois testa
        
        /*Scanner leitor = new Scanner(System.in);
        double nota = 0;
        int i = 1;
        
        do{
             System.out.println("Digite a nota do " + i + " aluno");
             nota = leitor.nextDouble();
             System.out.println("a nota do" +" "+ i + " vale " + nota + "\n\n");
             i++;
        }while(i <= 10);*/
                     
             
        
            
            
        
        
        
        
        
        //Faça um algoritmo que imprima a metade de cada número de 10 a 20.
        
        /*for(double metade = 10;metade >= 10 && metade <= 20; ++metade){
           System.out.println("a metade do numero " + metade + " e:" + metade/2);
        }*/
        
        //quando nn sei o valor específico e só quero usar a função de mostrar notas sem saber a quantidade de alunos uso: while(true){}
            
        
        
        
        
        
       
        
        
        
        
        // TODO code application logic here
    }
    
}
