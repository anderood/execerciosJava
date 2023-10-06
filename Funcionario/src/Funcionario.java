public class Funcionario {
   private String nome;
   private String departamento;
   private Double salario;
   private String data_entrada;
   private String rg;
   private boolean isTrabalhando;


    public Funcionario(String nome, String departamento, Double salario, String data_entrada, String rg, boolean isTrabalhando) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.data_entrada = data_entrada;
        this.rg = rg;
        this.isTrabalhando = isTrabalhando;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getData_entrada() {
        return data_entrada;
    }

    public void setData_entrada(String data_entrada) {
        this.data_entrada = data_entrada;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public boolean isTrabalhando() {
        return isTrabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.isTrabalhando = trabalhando;
    }

    public void bonifica(boolean trabalhando, Double salario){
        if(trabalhando){
            System.out.println("O Trabalhador recebeu um bonus de: " + salario * 2.0 );
        }
    }

    public void demite(){
        isTrabalhando = false;
        System.out.println("Funcionario Desligado!");
    }
}
