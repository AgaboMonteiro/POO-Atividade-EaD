import java.util.Random;
import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int tentativa;
        int tentativas = 0;

        do {
            System.out.print("Digite um número entre 1 e 100: ");
            tentativa = scanner.nextInt();
            tentativas++;

            if (tentativa < numeroSecreto) {
                System.out.println("O número é maior.");
            } 
            else if (tentativa > numeroSecreto) {
                System.out.println("O número é menor.");
            }

        } while (tentativa != numeroSecreto);

        System.out.println("Parabéns! Você acertou.");
        System.out.println("Total de tentativas: " + tentativas);

        scanner.close();
    }
}