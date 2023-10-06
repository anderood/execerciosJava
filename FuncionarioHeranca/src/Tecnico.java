public class Tecnico extends Assistente {

    double bonusSalarial;
    public Tecnico(String nome, Double salario, int matricula, double bonusSalarial) {
        super(nome, salario, matricula);
        this.bonusSalarial = bonusSalarial;
    }

    public Double ganhoAnual(){
        return super.ganhoAnual() + bonusSalarial;
    }
}
