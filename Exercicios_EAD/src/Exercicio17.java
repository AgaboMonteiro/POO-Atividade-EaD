import java.util.Scanner;

public class Exercicio17 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int positivos = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.print("Digite o número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                positivos++;
            }
        }

        System.out.println("Quantidade de números positivos: " + positivos);

        scanner.close();
    }
}