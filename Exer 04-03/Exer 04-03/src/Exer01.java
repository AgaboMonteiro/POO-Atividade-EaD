//Faça um programa que: Gere um número aleatório entre 1 e 10. 
// Peça ao usuário para digitar um número. 
// Informe se ele acertou ou errou. Mostre o número sorteado.

import java.util.Random;
import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tentativa;

        int numeroSecreto = random.nextInt(10) + 1;

        System.out.print("Digite um número entre 1 e 10: ");
        tentativa = scanner.nextInt();
            if (tentativa == numeroSecreto) {
                System.out.println("Parabéns! Você acertou");
            } 
            else if (tentativa != numeroSecreto) {
                System.out.println("Você ERROWWW.");
            }

        System.out.println("Número secreto era: " + numeroSecreto);

        scanner.close();
    }
}