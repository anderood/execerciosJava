import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Juros {

    private Double valor;
    private Double taxa;
    private int dia;
    private int mes;
    private int ano;

    public Juros(Double valor, Double taxa, int dia, int mes, int ano) {
        this.valor = valor;
        this.taxa = taxa;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Double getTaxa() {
        return taxa;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public long calculaTempo(int dia, int mes, int ano){

        LocalDate dataInformada = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();

        return ChronoUnit.DAYS.between(dataInformada, dataAtual);
    }

    public double calculaJuros(double valor, double taxa, long tempo){

        double j = (valor * taxa * tempo) / 100;

        return j+valor;
    }

    public boolean verificaEntrada(double valor, double taxa, int dia, int mes, int ano){

        if (valor <= 0.0) {
            return false;
        }

        if (taxa <= 0.0 || taxa >= 100) {
            return false;
        }

        try {
            LocalDate.of(ano, mes, dia);
        } catch (DateTimeException e) {
            return false;
        }

        return true;
    }
}
