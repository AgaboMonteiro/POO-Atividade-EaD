import java.util.Scanner;

public class Exercicio16 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero;

        while (true) {

            System.out.print("Digite um número (negativo para sair): ");
            numero = scanner.nextInt(); 

            if (numero < 0) {
                break;
            }

            System.out.println("Número digitado: " + numero);
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}