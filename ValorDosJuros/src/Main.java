import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        ValidaData valida = new ValidaData();
        CalcJuros calc = new CalcJuros();

        System.out.printf("Digite a Data (00/00/0000) : ");
        String data = scanner.next();

        boolean result = valida.checkData(data, "dd/MM/yyyy");

        if(!result){
            System.out.println("Data Invalida!");
        }



    }
}