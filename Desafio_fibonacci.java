/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio_aula08;

/**
 *
 * @author Eduardo
 */
public class Desafio_aula08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Série de fibonacci: 1 1 2 3 5 8 13 21 34 55... - o numero atual é encontrado através da soma dos dois últimos. ex: o 13 foi o 8 + 5.
        //EXPRESSÃO: N atual = N anterior (-1) + N anterior ao outro (-2)
        //Escrever e salvar 10 primeiros elementos da série de fibonacci e a média deles utilizando um Vetor
        
        int[] valoresFib = new int[10];
        
        double media = 0;
        valoresFib[0] = 1;
        valoresFib[1] = 1;
        
        for(int i = 2; i <10; i++){
            valoresFib[i] = valoresFib[i-1] + valoresFib[i-2];
        }
        
        for (int i = 0; i < 10; i ++){
            System.out.println("elemento[" +i+ "] = " + valoresFib[i]);
            media = media + valoresFib[i];
        }
        
        System.out.println("a media vale: " + media);
        // TODO code application logic here
    }
    
}
