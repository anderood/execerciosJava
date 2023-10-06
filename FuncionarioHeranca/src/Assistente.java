public class Assistente extends Funcionario{

    int matricula;
    public Assistente(String nome, Double salario, int matricula) {
        super(nome, salario);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void exibeDados(){

       super.exibeDados();
       System.out.println("A matricula é: " + matricula);
        System.out.println("=========================================");
    }

}
