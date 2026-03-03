public class Exercicio6 {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 15;
        int n3 = 5;

        if (n1 > n2 && n1 > n3){
            System.out.println("O número " + n1 + " é o maior número");
        }
        else if (n2 > n1 && n2 > n3){
            System.out.println("O número " + n2 + " é o maior número");
        }
        else {
            System.out.println("O número " + n3 + " é o maior número");
        }
    }
}
