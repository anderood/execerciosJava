public class Pobre extends Pessoa{
    public Pobre(String nome, int idade) {
        super(nome, idade);
    }

    public String trabalha(){
        return "Trabalho muito, e não me sobra nada...";
    }
}
