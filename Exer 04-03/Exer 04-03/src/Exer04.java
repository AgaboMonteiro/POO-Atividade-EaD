
//Crie um ArrayList<Integer>. 
// Permita que o usuário digite números. 
// O programa deve parar quando ele digitar 0. 
// Ao final, mostre: Quantos números foram digitados, a soma deles e a média.

import java.util.Scanner;

public class Exer04 {
    public static void main(String[] args) {
        int soma = 0;
        double media;
        int cont = 0;

        Scanner scanner = new Scanner(System.in);
        int numero;

        do {
            System.out.print("Digite um número (0 para parar): ");
            numero = scanner.nextInt();
            if (numero != 0) {
                soma += numero;
                cont++;
            }
        } while (numero != 0);

        if (cont > 0) {
            media = (double) soma / cont;
            System.out.println("Quantidade de números digitados: " + cont);
            System.out.println("Soma dos números: " + soma);
            System.out.println("Média dos números: " + media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        scanner.close();
    }
    
}
