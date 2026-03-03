import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Cria um leitor para receber dados do teclado

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();//Lê número inteiro digitado pelo usuário e armazena na variável numero1.
        int soma = 0;
        for (int i = 0; i <= n; i++) {
            soma += i;
        }
        System.out.println("A soma dos números de 0 até " + n + " é: " + soma);

        scanner.close();
    }
}
