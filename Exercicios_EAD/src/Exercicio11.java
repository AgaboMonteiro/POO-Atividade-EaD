import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Cria um leitor para receber dados do teclado

        System.out.print("Digite um numero: ");
        int n = scanner.nextInt();//Lê número inteiro digitado pelo usuário e armazena na variável numero1.
        
        for (int i = 1; i <= 10; i++) {
            int resultado = n * i;
            System.out.println(n + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}

