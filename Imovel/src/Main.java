import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Novo novo = new Novo("Rua: bla bla bla", 300.000, 250.123);
        Velho velho = new Velho("Rua: Era uma casa muito engraçada...", 180.000, 20.000);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 1 para Novo e 2 para Velho: ");
        int option = scanner.nextInt();

        if (option == 1) {
            System.out.println(novo.exibeDados());
            System.out.println("========================");

        } else {
            System.out.println(velho.exibeDados());
            System.out.println("========================");
        }



    }
}