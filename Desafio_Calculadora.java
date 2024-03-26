import java.util.Scanner;

public class DesafioCalculadora_aula05 {

    public static void main(String[] args) {
        // Challenge calculator: Develop a calculator that performs the 4 basic operations. The execution should be decided through a menu.
        
        // Variable index at the beginning of the program
        int operacoes = 0;
        double calculo1 = 0;
        double calculo2 = 0;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("Coloque 1 para soma");
        System.out.println("Coloque 2 para subtracao");
        System.out.println("Coloque 3 para divisao");
        System.out.println("Coloque 4 para multiplicacao");
        operacoes = leitor.nextInt();
        
        if((operacoes >= 1) && (operacoes <= 4)){
            System.out.println("Digite seu primeiro numero");
            calculo1 = leitor.nextDouble();
            System.out.println("Digite seu segundo numero");
            calculo2 = leitor.nextDouble();
            System.out.println("Sua resposta e: ");
            
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
        } else {
            System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 4.");
        }
        
        leitor.close(); // It's a good practice to close the scanner
    }
}
