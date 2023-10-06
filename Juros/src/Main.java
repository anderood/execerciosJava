import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor: ");
        Double valor = scanner.nextDouble();

        System.out.println("Digite a Taxa: ");
        Double taxa = scanner.nextDouble();

        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.println("Digite o Mes: ");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();

        Juros juros = new Juros(valor, taxa, dia, mes, ano);

        boolean result = juros.verificaEntrada(
                juros.getValor(),
                juros.getTaxa(),
                juros.getDia(),
                juros.getMes(),
                juros.getAno()
        );

        if(!result) {
            System.out.println("Valor informado é invalido!");
            System.exit(0);
        }

        long tempo = juros.calculaTempo(juros.getDia(), juros.getMes(), juros.getAno());

        System.out.println(
                "O valor é: " + juros.getValor() + "\n" +
                "A taxa é: " + juros.getTaxa() + "%" + "\n" +
                "A Quantidade de dias em atraso é: " + juros.calculaTempo(juros.getDia(), juros.getMes(), juros.getAno()) + "\n" +
                "O Valor + Juros: " + juros.calculaJuros(juros.getValor(), juros.getTaxa(), tempo)
        );
    }
}