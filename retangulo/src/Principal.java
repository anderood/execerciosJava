public class Principal {

    public static void main(String[] args){

        Retangulo retangulo = new Retangulo();

        retangulo.Altura = 1.10;
        retangulo.Largura = 2.10;
        retangulo.Cor = "Vermelho";
        retangulo.Material = "Ferro";

        System.out.println(
                "O Valor de Area é " + retangulo.Area(1.20) + "\n" +
                "O Valor do Perimetro é " + retangulo.Perimetro(2.40) + "\n" +
                "O Valor Total da Area é " + (retangulo.Area(1.40) + retangulo.Perimetro(2.10))
        );

    }
}
