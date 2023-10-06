import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ValidaData {
    public static boolean checkData(String dataText, String formato) throws ParseException {

        SimpleDateFormat simpleDate = new SimpleDateFormat(formato);

        simpleDate.setLenient(false); // impede datas invalidas

        try{
            Date result = simpleDate.parse(dataText);
            System.out.println(result);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
