public class Principal {

    public static void main(String[] args){

        Carro caranga = new Carro();

        caranga.cor = "black";
        caranga.quilometragem = 100.123;
        caranga.marca = "Fiat";
        caranga.modelo = "Palio";
        caranga.tipoCombustivel = "Flex";

        System.out.println(
                "A Cor do meu carro é: " + caranga.cor + "\n" +
                "A Quilometragem do meu carro é: " + caranga.quilometragem + "\n" +
                "A Marca do meu carro é: " + caranga.marca + "\n" +
                "O Modelo do meu carro é: " + caranga.modelo + "\n" +
                "O Tipo de Combustivel do meu carro é: " + caranga.tipoCombustivel + "\n"
        );

        System.out.println("Qual a velocidade do carro?");
        caranga.Aceleracao();
        caranga.Frenou();
    }
}
