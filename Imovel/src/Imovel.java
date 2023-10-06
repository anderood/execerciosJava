public class Imovel {

    public String endereco;
    public Double preco;

    public Imovel(String endereco, Double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String exibeDados(){
        return (
                "O Endereco do Imovel é: " + endereco + "\n" +
                "O Preço dele é: " + preco
                );
    }
}
