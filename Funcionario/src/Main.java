
public class Main {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
                "Anderson Santos",
                "Desenvolvimento",
                4.202,
                "02/01/2023",
                "12.345.678-0",
                true
        );

        System.out.println(
                "O nome do funcionario é: " + funcionario.getNome() + "\n" +
                        "O departamento do funcionario é: " + funcionario.getDepartamento() + "\n" +
                        "O salario do funcionario é: " + funcionario.getSalario() + "\n" +
                        "A data de entrada do funcionario é: " + funcionario.getData_entrada() + "\n" +
                        "O RG do funcionario é: " + funcionario.getRg() + "\n" +
                        "Esta trabalhando neste momento: " + funcionario.isTrabalhando() + "\n"
        );

        funcionario.bonifica(funcionario.isTrabalhando(), funcionario.getSalario());
        funcionario.demite();

    }
}