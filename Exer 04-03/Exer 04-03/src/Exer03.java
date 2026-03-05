
//Crie um array de 10 posições. 
// Preencha com números aleatórios entre 1 e 100. 
// Mostre: Todos os valores, o maior número e o menor número.

import java.util.Random;
import java.util.Scanner;

public class Exer03 {
    public static void main(String[] args) {
    int maior = 0;
    int menor = 100;

    int[] numeros = new int[10]; 
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < numeros.length; i++) {
        Random random = new Random();
        numeros[i] = random.nextInt(100) + 1;
    }
    
    for (int i = 0; i < numeros.length; i++) {
        System.out.println(numeros[i]);
        if (numeros[i] > maior) {
            maior = numeros[i];
        }
        if (numeros[i] < menor) {
            menor = numeros[i];
        }
    }
    System.out.println("Maior número: " + maior);
    System.out.println("Menor número: " + menor);
    scanner.close();
    }
}
