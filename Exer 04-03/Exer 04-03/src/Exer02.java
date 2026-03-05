//Crie um array estático com 5 posições. 
// Leia 5 números digitados pelo usuário. 
// Calcule e mostre: Soma e Média.

import java.util.Scanner;

public class Exer02 {
    public static void main(String[] args) {
    int soma = 0;
    double media;

    int[] numeros = new int[10]; 
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Digite um número: ");
        numeros[i] = scanner.nextInt(); //
    }

    // cálculo da soma
    for (int i = 0; i < 5; i++) {
        soma += numeros[i];
    }
        // cálculo da média
    media = (double) soma / numeros.length;

        // exibição dos resultados
    System.out.println("Soma = " + soma);
    System.out.println("Média = " + media);

    scanner.close();
    }
}
