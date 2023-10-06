public class Funcionario {
    public String nome;
    public Double salario;

    public Funcionario(String nome, Double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Double addAumento(double valor){
        return salario + valor;
    }

    public Double ganhoAnual(){
        return salario * 12;
    }

    public void exibeDados(){
        System.out.println(
                "O nome é: " + nome + "\n" +
                "O salario é: " + salario + "\n" +
                "O ganho anual é: " + ganhoAnual() + "\n"
        );
    }
}
