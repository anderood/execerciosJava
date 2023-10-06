import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de raio: ");
        Double raio = scanner.nextDouble();

        System.out.println("Digite o valor de Altura: ");
        Double altura = scanner.nextDouble();

        CalculoCilindrico calculo = new CalculoCilindrico(raio, altura);

        boolean isFalse = calculo.validaRaioAltura(calculo.getRaio(), calculo.getAltura());

        if ( !isFalse){
            System.out.println("Entrada Invalida!");
            System.exit(0);
        }

        double result = Double.parseDouble(calculo.calcula_circunferencia(calculo.getRaio(), calculo.getAltura()));

        System.out.println(
                "O volume do Cilindro é: "+ result
        );
    }
}