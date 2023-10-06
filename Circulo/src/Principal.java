import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Calcula calculoTotal = new Calcula();

        System.out.println("Digite o nome: ");
        String nome = scanner.next();

        System.out.println("Digite o valor por hora: ");
        Double valor_hora = scanner.nextDouble();

        System.out.println("Digite o Total de Horas Trabalhada: ");
        int horas_trabalhadas = scanner.nextInt();

        System.out.println("Digite o Total de Descontos: ");
        Double total_Desconto = scanner.nextDouble();

        calculoTotal.Total(nome, valor_hora, horas_trabalhadas, total_Desconto);

    }
}
