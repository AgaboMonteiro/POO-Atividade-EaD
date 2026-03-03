import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in); //Cria um leitor para receber dados do teclado

        System.out.print("Digite o usuario: ");
        double usuario = scanner.nextDouble();//Lê número decimal digitado pelo usuário e armazena na variável numero1.

        System.out.print("Digite a senha: ");
        double senha = scanner.nextDouble();

        if (usuario == 1234 && senha == 9999) {
            System.out.println("Acesso permitido");
        } 
        else if (usuario == 1234 && senha != 9999) {
            System.out.println("Acesso negado senha");
        }
        else if (usuario != 1234 && senha == 9999) {
            System.out.println("Acesso negado usuário");
        }
        else {
            System.out.println("Acesso negado usuário e senha ");
        }

        scanner.close();
    }
    
}
