import java.util.Scanner;

public class Principal {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        CalcBissexto calc = new CalcBissexto();

        System.out.println("Digite o Ano");
        int ano = scanner.nextInt();

        calc.calcBissexto(ano);


    }
}
