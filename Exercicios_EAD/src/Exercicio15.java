public class Exercicio15 {

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 != 0) {
                continue; // serve para pular a iteração atual e continuar com a próxima, ou seja, não executa o código abaixo para números ímpares
            }

            System.out.println(i);
        }
    }
}