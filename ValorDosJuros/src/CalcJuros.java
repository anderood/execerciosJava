import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CalcJuros {

    public static void JurosCalc(String data) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date teste = simpleDateFormat.parse(data);

        String nTeste = String.valueOf(teste.getTime());
        System.out.println(teste.getTime());


    }
}
