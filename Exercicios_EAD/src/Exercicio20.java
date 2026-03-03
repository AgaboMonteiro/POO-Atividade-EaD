import java.util.Scanner;

public class Exercicio20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double saldo = 1000;
        int opcao;

        do {
            System.out.println("\n1 - Ver saldo");
            System.out.println("2 - Sacar");
            System.out.println("3 - Depositar");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Valor para saque: ");
                    double saque = scanner.nextDouble();

                    if (saque <= saldo) {
                        saldo -= saque;
                        System.out.println("Saque realizado.");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.print("Valor para depósito: ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    System.out.println("Depósito realizado.");
                    break;

                case 4:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 4);

        scanner.close();
    }
}