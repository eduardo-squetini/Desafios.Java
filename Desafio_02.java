/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios_prof_arthur;
import java.util.Scanner;
/**
 *
 * @author Eduardo
 */
public class Exercicios_prof_arthur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Faça um programa que peça uma nota, entre zero e dez. 
    //Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido. 
    //(Dica: Enquanto a nota não for válida, execute o bloco de código)
    
    Scanner leitor = new Scanner(System.in);
    /*double nota = 0;
   
    do{
        System.out.println("Digite a nota de 0 a 10");
        nota=leitor.nextDouble();
        if((nota<0)||(nota>10)){
            System.out.println("Nota Invalida");
        }else{
            break;
        }
    }while((nota>=0)||(nota<=10));*/
    
    /*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, 
    mostrando uma mensagem de erro e voltando a pedir as informações.*/
    
    //Equals compara os conteudos das variáveis: declaração.equals(variável a ser comparada)
   
   /* String nome = "";
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
    }while((nome!=senha));*/
   
   /*Faça um programa que leia e valide as seguintes informações:

    Nome: maior que 3 caracteres;

    Idade: entre 0 e 150;

    Salário: maior que zero;

    Sexo: 'f' ou 'm';

    Estado Civil: 's', 'c', 'v', 'd';*/
   
   //LENGTH = analisa a quantidade de elementos dentro da String
   // !variável.equals() - avalia se o conteúdo é diferente da variavel
   
   /*String nome = "";
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
   }while( (!estado.equals("s")) && (!estado.equals("c")) && (!estado.equals("v")) && (!estado.equals("d") ));*/
    
}
    
        
}


    
    
        // TODO code application logic here
    
    
    

