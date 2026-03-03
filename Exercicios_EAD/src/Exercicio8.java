import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Cria um leitor para receber dados do teclado

        System.out.print("Digite o primeiro número: ");
        double n1 = scanner.nextDouble();//Lê número decimal digitado pelo usuário e armazena na variável numero1.

        System.out.print("Digite o segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = scanner.next().charAt(0);

        double resultado;

        if (operador == '+') {
            resultado = n1 + n2;
        } 
        else if (operador == '-') {
            resultado = n1 - n2;
        } 
        else if (operador == '*') {
            resultado = n1 * n2;
        } 
        else if (operador == '/') {
            if (n2 != 0) {
                resultado = n1 / n2;
            } else {
                System.out.println("Erro: divisão por zero.");
                scanner.close();
                return;
            }
        } 
        else {
            System.out.println("Operador inválido.");
            scanner.close();
            return;
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}