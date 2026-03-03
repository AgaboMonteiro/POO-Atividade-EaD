import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in); //Cria um leitor para receber dados do teclado

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();//Lê número inteiro digitado pelo usuário e armazena na variável numero1.
        int fatorial = 1;
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("O fatorial de " + n + " é: " + fatorial);

        scanner.close();
    }
}
