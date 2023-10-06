
public class Main {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Doug", "costelinha");
        cachorro.caminha();
        System.out.println(cachorro.late() + "\n" + cachorro.caminha());
        System.out.println("==========================");

        Gato gato = new Gato("Bichano", "cianes");
        gato.caminha();
        System.out.println(
                gato.mia() + "\n" +
                gato.caminha()
        );
        System.out.println("==========================");

        Rica rica = new Rica("Ada", 23, 300.000);
        rica.Pessoa();
        System.out.println(rica.fazCompras());

        System.out.println("==========================");

        Pobre pobre = new Pobre("Jose", 28);
        pobre.Pessoa();
        System.out.println(pobre.trabalha());

        System.out.println("==========================");

        Miseravel miseravel = new Miseravel("EuRico", 31);
        miseravel.Pessoa();
        miseravel.mendigar();

        System.out.println("==========================");



    }
}