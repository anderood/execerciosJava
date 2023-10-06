public class Principal {

    public static void main(String[] args){

        Conta conta = new Conta();

        conta.numConta = 1110;
        conta.nomeTitular = "Anderson Santos";
        conta.saldo = 2.201;
        conta.agencia = 171;
        conta.tipoConta = "Conta Corrente";

        conta.Deposito(1.100);
        conta.Saque(100);

        System.out.println(
                "O Numero da Conta é: " + conta.numConta + "\n" +
                "O Nome do titular é: " + conta.nomeTitular + "\n" +
                "O seu Saldo é: " + conta.saldo + "\n" +
                "A agencia é: " + conta.agencia + "\n" +
                "O Tipo de Conta é: " + conta.tipoConta + "\n" +
                "O Deposito que fez é: " + conta.Deposito(100) + "\n" +
                "O Saque que efetuou é: " + conta.Saque(500) + "\n"
        );
    }
}
