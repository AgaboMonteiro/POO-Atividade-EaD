import java.util.Scanner;

public class Exercicio18 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero = scanner.nextInt();

        int maior = numero;
        int menor = numero;

        for (int i = 2; i <= 5; i++) {

            System.out.print("Digite o número " + i + ": ");
            numero = scanner.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        scanner.close();
    }
}