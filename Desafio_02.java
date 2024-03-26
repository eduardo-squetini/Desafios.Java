package exercicios_prof_arthur;
import java.util.Scanner;

public class Exercicios_prof_arthur {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double nota = 0;
   
        do{
            System.out.println("Digite a nota de 0 a 10");
            nota=leitor.nextDouble();
            if((nota<0)||(nota>10)){
                System.out.println("Nota Invalida");
            }else{
                break;
            }
        }while((nota>=0)||(nota<=10));
    
        String nome = "";
        String senha = "";
    
        do{
            System.out.println("Digite seu nome");
            nome = leitor.nextLine();
            System.out.println("Digite sua senha");
            senha = leitor.nextLine();
            if(senha.equals(nome)){
                System.out.println("Senha invalida. Digite Novamente");
            }else{
                System.out.println("Logado");
                break;
            } 
        }while((nome!=senha));
   
        String nome = "";
        int idade = 0;
        double salario = 0;
        String sexo = "";
        String estado = "";
   
        do{
            System.out.println("Digite seu nome");
            nome = leitor.nextLine();
            if(nome.length() < 3){
                System.out.println("nome menor que 3 caracteres");
            }
        }while(nome.length() < 3);
   
        do{
            System.out.println("Digite sua idade");
            idade = leitor.nextInt();
            if((idade<0)||(idade>150)){
                System.out.println("Permitido somente entre 0 e 150");
            }
        }while((idade<0)||(idade>150));
   
        do{
            System.out.println("Digite seu Salario");
            salario = leitor.nextDouble();
            if(salario<0){
                System.out.println("Salario menor que zero");
            }
        }while(salario<0);
   
        leitor.nextLine();
   
        do{
            System.out.println("Digite seu sexo");
            sexo = leitor.nextLine();
            if((!sexo.equals("m"))&& (!sexo.equals("f"))){
                System.out.println("Sexo invalido");
            }
        }while((!sexo.equals("m"))&& (!sexo.equals("f")));
   
        do{
            System.out.println("Digite seu Estado Civil");
            estado = leitor.nextLine();
            if((!estado.equals("s")) && (!estado.equals("c")) && (!estado.equals("v")) && (!estado.equals("d"))){
                System.out.println("Estado Invalido");
            }
        }while( (!estado.equals("s")) && (!estado.equals("c")) && (!estado.equals("v")) && (!estado.equals("d") ));
    }
}
