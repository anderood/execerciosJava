public class Novo extends Imovel{

    Double adicional;
    public Novo(String endereco, Double preco, Double adicional) {
        super(endereco, preco);
        this.adicional = adicional;
    }

    public Double getAdicional() {
        return adicional;
    }

    public String exibeDados(){
        System.out.println(super.exibeDados());
        return (
                "O Preço + adicional é: " + (preco + adicional)
        );
    }
}
