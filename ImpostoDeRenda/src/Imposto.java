public class Imposto {

    private final double salario;
    private double imposto;

    public Imposto(double salario) {
        this.salario = salario;
        calcularImposto();
    }

    public double getValor() {
        return salario;
    }

    public void calcularImposto(){

       if ( salario <= 1903.98){
           imposto = 0.0;
           System.out.println(
                   "Para esta faixa salarial é isento: " + imposto
           );

       } else if (salario <= 2826.65 && salario >= 1903.99) {

           imposto = salario * 0.075;
           System.out.println(
                   "Para esta faixa salarial é de 7.5%: " + imposto
           );

       } else if (salario <= 3751.05 && salario >= 2826.66 ) {

           imposto = salario * 0.15;
           System.out.println(
                   "Para esta faixa salarial é de 15%: " + imposto
           );

       } else if (salario <= 4664.68 && salario >= 3751.06) {
           imposto = salario * 0.225;
           System.out.println(
                   "Para esta faixa salarial é de 22,5% : " + imposto
           );
       } else {
           imposto = salario * 0.275;
           System.out.println(
                   "Para esta faixa salarial é de 27,5%: " + imposto
           );
       }
    }

    public double getSalarioLiquido(){
        return salario - imposto;
    }

}
