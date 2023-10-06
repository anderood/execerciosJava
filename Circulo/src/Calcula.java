public class Calcula {

    void Total(String nome, double valorHora, int horasTrabalhadas, double valorDesconto){

        double result = horasTrabalhadas * valorHora - valorDesconto;
        System.out.println("Folha de Pagamento: " + nome + "\n");

        System.out.println(
                horasTrabalhadas + " horas " + " X " + valorHora + " = " + horasTrabalhadas * valorHora
        );

        System.out.println("Descontos: " + valorDesconto + "\n");
        System.out.println("Total Devido: " + result);
    }
}
