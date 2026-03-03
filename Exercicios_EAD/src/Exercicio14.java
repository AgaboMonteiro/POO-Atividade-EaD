import java.util.Scanner;

public class Exercicio14 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota;

        System.out.print("Digite uma nota entre 0 e 10: ");
        nota = scanner.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.println("Nota inválida. Tente novamente.");
            System.out.print("Digite uma nota entre 0 e 10: ");
            nota = scanner.nextDouble();
        }

        System.out.println("Nota válida digitada: " + nota);

        scanner.close();
    }
}