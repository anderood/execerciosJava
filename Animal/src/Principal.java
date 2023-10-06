public class Principal {

    public static void main(String[] args){

        Animal meuAnimal = new Animal();

        meuAnimal.nome = "Thor";
        meuAnimal.idade = 10;
        meuAnimal.especie = "Vira-Lata";
        meuAnimal.habitat = "meu quintal";

        System.out.println(
                "O nome do meu animal é: " + meuAnimal.nome + "\n" +
                "A idade do meu animal é: " + meuAnimal.idade + "\n" +
                "A especie do meu animal é: " + meuAnimal.especie + "\n" +
                "O Habitat do meu animal é: " + meuAnimal.habitat + "\n"
        );

        meuAnimal.SomAnimal();
    }
}
