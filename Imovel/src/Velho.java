public class Velho extends Imovel{

    Double desconto;
    public Velho(String endereco, Double preco, Double desconto) {
        super(endereco, preco);
        this.desconto = desconto;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String exibeDados(){
        System.out.println(super.exibeDados());
        return (
                "O Preço + desconto é: " + (preco - desconto)
        );
    }
}
