import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a faixa salarial: ");
        double salario = scanner.nextDouble();

        Imposto impostoDeRenda = new Imposto(salario);

        System.out.println("Salário líquido: " + impostoDeRenda.getSalarioLiquido());
    }
}