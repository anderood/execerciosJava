public class Administrativo extends Assistente{

    String turno;
    Double addNoturno;
    public Administrativo(String nome, Double salario, int matricula, String turno) {
        super(nome, salario, matricula);
        this.turno = turno;
    }

    public Double ganhoAnual(){
        if (turno.equals("noite")){
            addNoturno = salario + 0.25;
        }
        return salario * 12;
    }
}
