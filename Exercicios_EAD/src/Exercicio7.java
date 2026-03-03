public class Exercicio7 {
    public static void main(String[] args) {
        int ano = 2026;

        if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("O ano " + ano + " é um ano bissexto");
        }
        else {
            System.out.println("O ano " + ano + " não é um ano bissexto");
        }
    }
}
