//Gere um número aleatório entre 1 e 100. 
// O usuário deve tentar adivinhar. 
// Armazene todas as tentativas em um ArrayList. 
// Ao acertar, mostrar: Quantidade de tentativas e todas as tentativas feitas.

import java.util.Random;
import java.util.Scanner;

public class Exer05 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numeros = new int[100]; // Array para armazenar as tentativas

        int numeroSecreto = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativa;
        int tentativas = 0;

        do {
            System.out.print("Digite um número entre 1 e 100: ");// Solicita ao usuário para digitar um número
            tentativa = scanner.nextInt();
            numeros[tentativas] = tentativa; // Armazena a tentativa no array
            tentativas++; //

            if (tentativa < numeroSecreto) {
                System.out.println("O número é maior.");
            } 
            else if (tentativa > numeroSecreto) {
                System.out.println("O número é menor.");
            }

        } while (tentativa != numeroSecreto);

        System.out.println("Parabéns! Você acertou.");
        System.out.println("Total de tentativas: " + tentativas);
        System.out.println("Tentativas feitas: ");
        for (int i = 0; i < tentativas; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        scanner.close();
        
    }

    
}
