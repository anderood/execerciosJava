public class Pessoa {

    public String nome;
    public int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void Pessoa(){
        System.out.println(
                "Meu nome é: " + nome + "\n" +
                        "Minha idade é: " + idade + "\n"
        );
    }
}
