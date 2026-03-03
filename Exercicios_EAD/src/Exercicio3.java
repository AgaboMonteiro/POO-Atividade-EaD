public class Exercicio3 {

    public static void main(String[] args) {
        double n1 = 10;
        double n2 = 15;
        double n3 = 20;
        double media =(n1+n2+n3) / 3;
         if (media >=7){
            System.out.println("Aprovado");
         }
         else if (media >=5 && media <6.9){
            System.out.println("Recuperação");
         }
         else {
            System.out.println("Reprovado");
         }
    }
}
