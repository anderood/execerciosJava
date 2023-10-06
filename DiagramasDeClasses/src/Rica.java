public class Rica extends Pessoa{

    double dinheiro;
    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public String fazCompras(){
        return "Eu Gosto de fazer compras";
    }
}
