public class Animal {

    public String nome;
    public String raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String caminha(){
        return "O Animal esta caminhando";
    }
}
